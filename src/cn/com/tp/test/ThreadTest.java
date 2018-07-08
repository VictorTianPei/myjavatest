/**   
* @Title: ThreadTest.java 
* @Package cn.com.tp.test 
* @Description: TODO(用一句话描述该文件做什么) 
* @author A18ccms A18ccms_gmail_com   
* @date 2018年6月23日 上午9:02:47 
* @version V1.0   
*/
package cn.com.tp.test;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;

/**
 * ## 类说明：
 * 	描述
 * @author    [tianpei]   
 * @version   [V1.0, 2018年6月23日]
 * @package cn.com.tp.test
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2018年6月23日|tianpei|新增|ThreadTest.java新增
*/
public class ThreadTest {

    public static void main(String[] args) {
        ThreadMXBean threadMXBean = ManagementFactory.getThreadMXBean();
        ThreadInfo[] threadInfos = threadMXBean.dumpAllThreads(false, false);
        for (ThreadInfo t : threadInfos) {
            System.out.println(t.getThreadId() + ":" + t.getThreadName());
        }
    }
}
