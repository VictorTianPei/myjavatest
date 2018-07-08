/**   
* @Title: AtomicTest.java 
* @Package cn.com.tp.test 
* @Description: TODO(用一句话描述该文件做什么) 
* @author A18ccms A18ccms_gmail_com   
* @date 2018年6月24日 上午12:02:38 
* @version V1.0   
*/
package cn.com.tp.test;

import java.util.concurrent.atomic.AtomicReference;

/**
 * ## 类说明：
 * 	描述
 * @author    [tianpei]   
 * @version   [V1.0, 2018年6月24日]
 * @package cn.com.tp.test
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2018年6月24日|tianpei|新增|AtomicTest.java新增
*/
public class AtomicTest {
    static AtomicReference<user> ar = new AtomicReference<>();
    public static void main(String[] args) {
      user user = new user("tianpei", 29); 
      ar.set(user);
      user user1 = new user("tianpei", 18);
      ar.compareAndSet(user, user1);
      user user2 = new user("linger", 16);
      ar.set(user2);
      System.out.println(ar.get().toString());
    }
}

class user {
    private String name;
    private int age;
    /** 
    * @Title: user 
    * @Description: TODO(这里用一句话描述这个方法的作用) 
    * @param name
    * @param age    设定文件 
    * @return AtomicTest.java    返回类型 
    * @throws 
    */
    public user(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }
    /** 
     * ## 方法说明：
     * 	数据传输验证 
     * @return
    */
    @Override
    public String toString() {
        return "user [name=" + name + ", age=" + age + "]";
    }
    
}