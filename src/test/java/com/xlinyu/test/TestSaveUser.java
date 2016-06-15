package com.xlinyu.test;

import java.util.Date;
import java.util.UUID;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.xlinyu.model.User;
import com.xlinyu.service.IUserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml","classpath:spring-hibernate.xml"})
public class TestSaveUser {

	@Resource
	private IUserService userService;
	
	@Test
	public void save(){
		User user = new User();
		user.setId(UUID.randomUUID().toString().replaceAll("-", ""));
		user.setUsername("孤傲苍狼");
	    user.setPassword("123");
	    user.setAddTime(new Date());
	    userService.save(user);
	}
	
}
