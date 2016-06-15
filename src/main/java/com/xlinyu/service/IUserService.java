package com.xlinyu.service;

import java.io.Serializable;

import com.xlinyu.model.User;

public interface IUserService {

	public String sayHello();
	
	Serializable save(User user);
}
