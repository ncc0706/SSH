package com.xlinyu.dao.impl;

import java.io.Serializable;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.xlinyu.dao.IUserDao;
import com.xlinyu.model.User;

@Repository("userDao")
public class UserDaoImpl implements IUserDao {

	@Resource
	private SessionFactory sessionFactory;
	
	@Override
	public Serializable save(User user) {
		return sessionFactory.getCurrentSession().save(user);
	}

}
