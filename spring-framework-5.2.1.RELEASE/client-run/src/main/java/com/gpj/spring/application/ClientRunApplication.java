package com.gpj.spring.application;

import com.gpj.spring.client.AppApplication;
import com.gpj.spring.client.common.bean.GBean;
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
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppApplication.class);
		GBean bean = context.getBean(GBean.class);
		bean.show();
	}
}
