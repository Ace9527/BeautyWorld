package com.ace.beauty.mapper;

import java.util.List;

import com.ace.beauty.pojo.User;

public interface UserMapper {
	public List<User> findAll();
	public void read();
}
