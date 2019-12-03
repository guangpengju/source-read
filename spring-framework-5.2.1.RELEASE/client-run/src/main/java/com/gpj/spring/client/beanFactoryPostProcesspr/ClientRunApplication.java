package com.gpj.spring.client.beanFactoryPostProcesspr;

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
		/**
		 * BeanFactoryPostProcessor
		 * 	使用BeanFactoryPostProcessor来修改bean为多例
		 * 使用：
		 * 	1) 执行clientRunApplication获得结果
		 * 	2) 注释MyBeanFactoryPostProcessor中的@Component注解执行clientRunApplication获得结果
		 * 	3) 进行结果比对
		 */
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppApplication.class);
		GBean bean1 = context.getBean(GBean.class);
		GBean bean2 = context.getBean(GBean.class);
		System.out.println("bean1:" + bean1.hashCode());
		System.out.println("bean2:" + bean2.hashCode());
	}
}
