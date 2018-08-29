package com.itmuch.cloud.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Author:zrd
 * @Description:
 * @Date:2018-7-17 11:08
 */
@FeignClient(name = "remotetesturl",url = "http://localhost:8083")
public interface UrlFegin {
    @RequestMapping(value = "/poo/select",method = RequestMethod.GET)
    public String getinfo();
}
