package com.gpj.spring.runtest;

import com.gpj.spring.runtest.bean.GService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author GPJ
 * @version 1.0
 * @className SpringRunTest
 * @description TODO
 * @date 2019/5/30 18:16
 **/
public class SpringRunTest {
	public static void main(String[] args) {
		System.out.println("start...");
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:application.xml");

		System.out.println("context has be created!");
		GService bean = context.getBean(GService.class);

		bean.hellworld();
		System.out.println("end...");
	}
}
