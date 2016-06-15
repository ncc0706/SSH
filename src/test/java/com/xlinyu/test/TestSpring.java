package com.xlinyu.test;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.xlinyu.service.IUserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class TestSpring {

	@Resource
	private IUserService userService;
	
	@Test
	public void sayHello(){
		String hello = userService.sayHello();
		System.out.println(hello);
	}

}
