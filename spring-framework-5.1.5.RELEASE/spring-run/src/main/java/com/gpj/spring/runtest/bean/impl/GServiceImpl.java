package com.gpj.spring.runtest.bean.impl;

import com.gpj.spring.runtest.bean.GService;

/**
 * @author GPJ
 * @version 1.0
 * @className GServiceImpl
 * @description TODO
 * @date 2019/5/30 18:26
 **/
public class GServiceImpl implements GService {
	@Override
	public void hellworld() {
		System.out.println("I am a bean created by spring");
	}
}
