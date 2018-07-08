/**   
* @Title: ArrayTest.java 
* @Package cn.com.tp.test 
* @Description: TODO(用一句话描述该文件做什么) 
* @author A18ccms A18ccms_gmail_com   
* @date 2018年7月8日 上午9:50:00 
* @version V1.0   
*/
package cn.com.tp.test;

import java.util.Arrays;
import java.util.List;

/**
 * ## 类说明：
 * 	描述
 * @author    [tianpei]   
 * @version   [V1.0, 2018年7月8日]
 * @package cn.com.tp.test
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2018年7月8日|tianpei|新增|ArrayTest.java新增
*/
public class ArrayTest {

    /** 
     * ## 方法说明：
     * 	数据传输验证 
     * @param args
    */
    public static void main(String[] args) {
        String[] a = new String[] {"abc", "def", "hello"};
        System.out.println(a);
        List<String> list = Arrays.asList(a);
        System.out.println(list);
        Integer[] b ={1,2,3};
        List<Integer> listb = Arrays.asList(b);
        System.out.println(listb);
        System.out.println(list.toArray().length);
        System.out.println(listb.toString());
        
        String[] c = new String[3];
        list.toArray(c);
        System.out.println(c);
        System.out.println("gittest3");
        System.out.println("git test");
        System.out.println("git test2");
        System.out.println("git test4");
        System.out.println("git test6");
        System.out.println("git test hahahah");
        System.out.println("git test papapap");
    }

}
