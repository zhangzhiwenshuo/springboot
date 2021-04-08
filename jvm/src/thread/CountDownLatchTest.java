package thread;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchTest {
    public static void main(String[] args) {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        new Thread(()->{
            System.out.println("子线程1开始执行：");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("子线程1结束执行。");
            countDownLatch.countDown();
        }).start();
        new Thread(()->{
            System.out.println("子线程2开始执行：");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("子线程2结束执行。");
            countDownLatch.countDown();
        }).start();
        new Thread(()->{
            System.out.println("子线程3开始执行：");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("子线程3结束执行。");
            countDownLatch.countDown();
        }).start();
        try {
            countDownLatch.await();
            System.out.println("所有子线程执行完毕了。。。");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
