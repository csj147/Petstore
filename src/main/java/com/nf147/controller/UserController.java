package com.nf147.controller;

import com.nf147.dao.*;

import com.nf147.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * @author 陈小子
 */
@Controller
@RequestMapping("/lan")
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @RequestMapping(method = RequestMethod.GET)
    public String index() {
        return "User";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String landing(Model model, String U_Name, String U_Pwd) {

        List<User> users = userMapper.selectAll();

        model.addAttribute("users",users);

        for (User user : users) {
            if (user.getU_Name() != U_Name || user.getU_pwd() != U_Pwd) {

                model.addAttribute("lanError", "用户名或密码错误");
                return "User";
            }
        }
        return "User";
    }

}
