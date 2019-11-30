package com.gpj.spring.application;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @className ClientRunApplication
 * @description TODO
 * @author GPJ
 * @date 2019/11/29 下午10:46
 * @version 1.0
 **/
public class ClientRunApplication {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

//		context.refresh();
		context.getBean("");


	}
}
