/**   
* @Title: QueueTest.java 
* @Package cn.com.tp.test 
* @Description: TODO(用一句话描述该文件做什么) 
* @author A18ccms A18ccms_gmail_com   
* @date 2018年6月23日 下午5:33:45 
* @version V1.0   
*/
package cn.com.tp.test;

import java.util.ArrayList;
import java.util.List;

/**
 * ## 类说明：
 * 	描述
 * @author    [tianpei]   
 * @version   [V1.0, 2018年6月23日]
 * @package cn.com.tp.test
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2018年6月23日|tianpei|新增|QueueTest.java新增
*/
public class QueueTest {
    
    public static void main(String[] args) throws InterruptedException {
        QueueTest qtest = new QueueTest();
        Queue<Integer> queue = new Queue<>(20);
        Thread2 t3 = new Thread2(queue, 40);
        Thread1 t1 = new Thread1(queue, 100);
        Thread2 t2 = new Thread2(queue, 60);
        t3.start();
        t1.start();
        t2.start();
        
    }
    
    private final static class Thread1 extends Thread {
        
        private Queue queue;
        
        private int size;
        
        public Thread1(Queue queue, int size) {
            this.queue = queue;
            this.size = size;
        }
        
        @Override
        public void run(){
                try {
                    for (int i = 0; i < size; i++) {
                        queue.imQueue(i);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            
        }
    }
    
    private static final class Thread2 extends Thread {
        private Queue<?> queue;
        
        private int size;
        
        public Thread2(Queue<?> queue, int size) {
            this.queue = queue;
            this.size = size;
        }
        
        @Override
        public void run() {
            try {
                for(int i = 0; i < size; i++)
                System.out.println(queue.exQueue());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Queue<T> {
    
   private final int limit;
   
   private List<T> queueList = new ArrayList<>();
   
   public Queue(int limit) {
       this.limit = limit;
   }
   
   public synchronized void imQueue(T t) throws InterruptedException {
       while (queueList.size() == limit) {
           wait();
       }
       System.out.println(Thread.currentThread().getName());
       queueList.add(t);
       if (queueList.size() == limit)
       notifyAll();
   }
   
   public synchronized T exQueue() throws InterruptedException {
       while (queueList.size() == 0) {
           wait();
       }
       System.out.println(Thread.currentThread().getName());
       T t = queueList.remove(0);
       if (queueList.size() == 0)
       notifyAll();
       return t;
   }
   
   
}