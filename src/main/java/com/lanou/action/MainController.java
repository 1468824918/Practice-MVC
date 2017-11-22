package com.lanou.action;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
    @RequestMapping(value = "/home")
    public String home() {
        System.out.println("你好");
        return "home";
    }

    @RequestMapping(value = "/login")
    public String login(String username,String password ,Integer[] ids){
        System.out.println(username+" "+ password);
        if ("".equals(username)||"".equals(password)|| null==ids){
            return "error";
        }
        for (Integer id : ids) {
            System.out.println(id);
        }
        return "success";
    }
}
