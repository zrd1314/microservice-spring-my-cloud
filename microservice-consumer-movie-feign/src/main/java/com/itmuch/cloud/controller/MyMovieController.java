package com.itmuch.cloud.controller;

import com.itmuch.cloud.entity.User;
import com.itmuch.cloud.feign.MyMovieFegin;
import com.itmuch.cloud.feign.UrlFegin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author:zrd
 * @Description:
 * @Date:2018-7-16 22:47
 */
@RestController
public class MyMovieController {
    @Autowired
    private MyMovieFegin myMovieFegin;
    @Autowired
    private UrlFegin urlFegin ;

    @GetMapping("/mymovie/{id}")
    public User findUser(@PathVariable Long id){
      return   this.myMovieFegin.findById(id);
    }

    @GetMapping("/momove/url")
    public String urlremote(){
        return this.urlFegin.getinfo();
    }
}
