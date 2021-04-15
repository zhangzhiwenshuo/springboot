package com.zzw.springboot.sys.controller;


import com.zzw.springboot.sys.entity.TUser;
import com.zzw.springboot.sys.service.ITUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author zhangzw
 * @since 2021-04-15
 */
@RestController
@RequestMapping("/sys")
public class TUserController  {

    @Autowired
    private ITUserService service;

    @RequestMapping("/insertUser")
    public String insertUser(){
        TUser user = new TUser();
        user.setEmail("xxx@163.com");
        user.setNickname("zhangsan");
        user.setPassword("123456");
        user.setScore(Long.valueOf("3"));
        user.setStatus(Long.valueOf("1"));
        user.setTopicCount(Long.valueOf("1"));
        user.setCommentCount(Long.valueOf("2"));
        user.setType(Long.valueOf("0"));
        service.save(user);
        return "success";
    }

}
