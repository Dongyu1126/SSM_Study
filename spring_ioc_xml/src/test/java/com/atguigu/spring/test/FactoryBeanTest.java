package com.atguigu.spring.test;

import com.atguigu.spring.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Date:2022/7/1
 * Author:ybc
 * Description:
 */
public class FactoryBeanTest {

    @Test
    public void testFactoryBean(){
        ApplicationContext ioc = new ClassPathXmlApplicationContext("spring-factory.xml");
        User user = ioc.getBean(User.class);/*把getObject方法的返回值交给了bean，而并不是UserFactoryBean*/
        System.out.println(user);
    }/*结果为什么只有实例化，没有依赖注入之类的，因为我们并没有手动对bean赋值，这是factory自己配置的*/

}
