package com.gpj.spring.client;

import com.gpj.spring.client.simpledemo.GBean;
import com.gpj.spring.client.simpledemo.SimpleDemoConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @className ClientRun
 * @description TODO
 * @author GPJ
 * @date 2019/12/4 12:39
 * @version 1.0
 **/
public class ClientRun {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SimpleDemoConfig.class);
        GBean bean = context.getBean(GBean.class);
        bean.showInfo();
    }
}
