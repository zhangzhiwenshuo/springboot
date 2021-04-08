package thread;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchMeeting {
   private static  CountDownLatch countDownLatch ;
    public static void main(String[] args) {
        countDownLatch = new CountDownLatch(10);
        A a = new A(countDownLatch);
        B b = new B(countDownLatch);
        Thread ta = new Thread(a);
        Thread tb = new Thread(b);
        ta.start();
        tb.start();
        System.out.println("主线程结束---");
    }
}

class A implements Runnable{
     CountDownLatch countDownLatch;
     public A(CountDownLatch countDownLatch){
         this.countDownLatch = countDownLatch;
     }
    @Override
    public void run() {
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("会议开始...");
    }
}

class B implements Runnable{
    CountDownLatch countDownLatch;
    public B(CountDownLatch countDownLatch){
        this.countDownLatch = countDownLatch;
    }
    @Override
    public void run() {
        for(int i=0;i<10;i++){
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("第　"+(i+1)+" 位高管报到!");
            countDownLatch.countDown();
        }
    }
}