package com.nf147.controller;

import com.nf147.dao.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import sun.misc.Request;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/")
public class UserController {

    @Autowired(required = false)
    private UserMapper userMapper;

    @RequestMapping(method = RequestMethod.GET)
    public String index(Model model){
        return "User";
    }

    @PostMapping("/lan")
    public String landing (String U_Name, String U_Pwd){
        System.out.println(U_Name+U_Pwd);

        return "User";
    }
}
