package zju.ee.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import zju.ee.exception.SysException;

@Controller
@RequestMapping("/user")
public class UserController {
    @RequestMapping("/testException")
    public String testException() throws SysException{
        System.out.println("异常测试执行了");
        try {
            int a=10/0;
        } catch (Exception e) {
            e.printStackTrace();
            throw new SysException("查询所有用户出错...");
        }
        return "success";
    }
}
