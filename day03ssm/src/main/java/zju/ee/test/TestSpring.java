package zju.ee.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import zju.ee.service.AccountService;

public class TestSpring {
    @Test
    public void run1(){
        //加载配置文件
        ApplicationContext ac=new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        //获取对象
        AccountService accountService = ac.getBean("accountService", AccountService.class);
        //调用方法
        accountService.findAll();


    }
}
