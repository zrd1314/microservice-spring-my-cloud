package com.itmuch.cloud.hystrix;

import com.itmuch.cloud.entity.User;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**
 * @Author:zrd
 * @Description:
 * @Date:2018-7-18 9:50
 */
@Component
public class Myhystrix  {
    @Autowired
    private RestTemplate restTemplate;

@HystrixCommand(fallbackMethod = "myhystrixmethod")
public User findById(Long id){
    return   this.restTemplate.getForObject("http://localhost:9007/simple/"+id,User.class);

}
    //当 请求 服务时出现 服务长时间没有 返回 ，使用断路器机制 ，默认的 请求时长为 1秒 ，如1秒没有 返回 ，会走 失败的回调返回 ，这个时间可以在yml文件修改
    public User myhystrixmethod(Long id ){
        User user = new User();
        user.setId(0l);
        user.setName("默认名字");
        return user;
    }
}
