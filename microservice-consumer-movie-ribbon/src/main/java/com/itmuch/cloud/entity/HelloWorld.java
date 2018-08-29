package com.itmuch.cloud.entity;

import java.io.IOException;
import java.io.InputStream;

/**
 * @Author:zrd
 * @Description:
 * @Date:2018-7-16 15:30
 */
public class HelloWorld  extends  InputStream implements Runnable {
    private  String id;
    private  Object obj ;
    @Override
    public void run() {
        System.out.println("111");
    }

    @Override
    public int read() throws IOException {
        return 0;
    }
}
