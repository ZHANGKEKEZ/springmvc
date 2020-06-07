package zju.ee.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloContrller {
    @RequestMapping(path = "/hello")
    public String sayHello(){
        System.out.println("Hello SpringMvc");
        return "success";
    }
}
