package com.demo.controller;

import com.demo.pojo.userpojo;
import com.demo.service.userserive;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author 10133
 * @version V1.0
 * 2020/4/10 19:21
 */
@Controller
public class usercontroller {

    @Autowired
    private userserive us;

    @RequestMapping("/all")

    public String selectallusers(ModelMap modelMap)
    {
        List<userpojo> list=us.getUsers();

        modelMap.addAttribute("template","login");


        modelMap.addAttribute("userlist",list);


        return "index";

    }


}
