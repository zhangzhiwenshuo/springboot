package thread;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierTest {
    public static void main(String[] args) {
        final int N = 4;
        CyclicBarrier barrier = new CyclicBarrier(N);
        for (int i=0;i<N;i++){
            new Thread(new Writer(barrier)).start();
        }
    }
    static class  Writer implements Runnable{
        CyclicBarrier cyclicBarrier;
        public Writer(CyclicBarrier cyclicBarrier){
            this.cyclicBarrier = cyclicBarrier;
        }
        @Override
        public void run() {
            String name = Thread.currentThread().getName();
            System.out.println(name + "开始读写数据");
            try {
                Thread.sleep(3000);
                System.out.println(name+"结束写数据");
                cyclicBarrier.await();
            } catch (InterruptedException | BrokenBarrierException e) {
                e.printStackTrace();
            }
            System.out.println(name + "所以线程都读取完毕，开始其他的操作");
        }
    }
}
