package com.itmuch.cloud.controller;

import com.itmuch.cloud.entity.User;
import com.itmuch.cloud.hystrix.Myhystrix;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author:zrd
 * @Description:
 * @Date:2018-7-18 9:46
 */
@RestController
public class MovieController {

    @Autowired
    private Myhystrix myhystrix;

    @GetMapping("/hystrix/{id}")
   public User getUser(@PathVariable Long id){
            return myhystrix.findById(id);
    }
}
