package com.xlinyu.dao;

import java.io.Serializable;

import com.xlinyu.model.User;

public interface IUserDao {

	Serializable save(User user);
}
