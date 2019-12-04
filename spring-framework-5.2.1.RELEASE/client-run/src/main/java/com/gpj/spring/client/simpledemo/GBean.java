package com.gpj.spring.client.simpledemo;

import org.springframework.stereotype.Component;

/**
 * @className GBean
 * @description TODO
 * @author GPJ
 * @date 2019/12/4 12:42
 * @version 1.0
 **/
@Component
public class GBean {
    public void showInfo(){
        System.out.println("this is GBean info!");
    }
}
