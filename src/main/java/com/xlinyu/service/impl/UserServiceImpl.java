package com.xlinyu.service.impl;

import java.io.Serializable;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.xlinyu.dao.IUserDao;
import com.xlinyu.model.User;
import com.xlinyu.service.IUserService;

@Service("userService")
public class UserServiceImpl implements IUserService {

	@Resource
	private IUserDao userDao;
	
	@Override
	public String sayHello() {
		return "Hello World";
	}

	@Override
    public Serializable save(User user) {
        return userDao.save(user);
    }
}
