package com.xlinyu.action;

import java.util.Date;
import java.util.UUID;

import javax.annotation.Resource;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;

import com.xlinyu.model.User;
import com.xlinyu.service.IUserService;


@ParentPackage("basePackage")
@Action(value="test")//使用convention-plugin插件提供的@Action注解将一个普通java类标注为一个可以处理用户请求的Action，Action的名字为struts2Test
@Namespace("/")//使用convention-plugin插件提供的@Namespace注解为这个Action指定一个命名空间
public class TestAction {

	@Resource
	private IUserService userService;
	
	//http://127.0.0.1/test!sayHello.action
	public void sayHello(){
        System.out.println("进入TestAction");
        String hello = userService.sayHello();
        System.out.println(hello);
    }
	
	public void saveUser(){
		User user = new User();
		user.setId(UUID.randomUUID().toString().replaceAll("-", ""));
		user.setUsername("孤傲苍狼");
	    user.setPassword("123");
	    user.setAddTime(new Date());
	    userService.save(user);
	}
}
