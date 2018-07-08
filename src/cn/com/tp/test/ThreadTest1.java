/**   
* @Title: ThreadTest1.java 
* @Package cn.com.tp.test 
* @Description: TODO(用一句话描述该文件做什么) 
* @author A18ccms A18ccms_gmail_com   
* @date 2018年6月23日 上午10:07:41 
* @version V1.0   
*/
package cn.com.tp.test;


/**
 * ## 类说明：
 * 	描述
 * @author    [tianpei]   
 * @version   [V1.0, 2018年6月23日]
 * @package cn.com.tp.test
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2018年6月23日|tianpei|新增|ThreadTest1.java新增
*/
public class ThreadTest1 {
    
    
    /** 
     * ## 方法说明：
     * 	数据传输验证 
     * @param args
    */
    public static void main(String[] args) {
        Test target = new Test();   
        Thread thread = new Thread(target);
        thread.start();
        thread.setPriority(6);
        System.out.println("0000000000000");
        try {
            Thread.sleep(2000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        target.cancle();
    }
}

class Test implements Runnable{
    
    private boolean on =true;
    
    /** 
     * ## 方法说明：
     * 	数据传输验证 
    */
    /** 
     * ## 方法说明：
     * 	数据传输验证 
    */
    @Override
    public void run(){
        while (on && !Thread.currentThread().isInterrupted()) {
            try {
                System.out.println("hahhahah-------------");
                Thread.sleep(5000L);
              //  this.wait(5000L);
                System.out.println("hahhahah");
            } catch (InterruptedException e) {
                e.printStackTrace();
                System.out.println("----------");
                System.out.println(Thread.currentThread().isInterrupted());
             //   Thread.currentThread().interrupt();
                System.out.println(Thread.currentThread().isInterrupted());
            }
            System.out.println("8888888888888888888888888888");
        }
        System.out.println("线程结束运行");
    }
    
    public void cancle() {
        this.on = false;
        Thread.currentThread().interrupt();
        System.out.println(Thread.currentThread().isInterrupted()+"+++++++");
    }
}