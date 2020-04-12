package com.demo.service;

import com.demo.dao.userdao;
import com.demo.pojo.userpojo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 10133
 * @version V1.0
 * 2020/4/10 21:13
 */
@Service
public class impuserservice implements userserive {
     @Autowired
    private userdao ud;


    @Override
    public List<userpojo> getUsers() {
        return ud.getUsers();
    }
}
