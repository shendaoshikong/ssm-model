package com.czp.controller;

import com.czp.pojo.User;
import com.czp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

@RequestMapping("/userC")
@Controller
public class UserController {
    @Autowired
    private UserService UserService;

    @RequestMapping("/showAll")
    public String showAll(HttpSession sess) {
        User object = UserService.selectById(1);
        if(object==null){
            System.out.println("null");
            return "404";
        }else {
            System.out.println("object=" + object);
            return "show";
        }
    }
}
