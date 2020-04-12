package com.demo.dao;

import com.demo.pojo.userpojo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author 10133
 * @version V1.0
 * 2020/4/10 21:36
 */
@Repository
@Mapper
public interface userdao {

    @Select("select * from user")
    List<userpojo> getUsers();


}
