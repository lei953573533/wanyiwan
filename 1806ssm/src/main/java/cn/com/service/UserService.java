package cn.com.service;

import java.util.List;

import cn.com.pojo.User;

public interface UserService {
	public List<User> findAll();
	public void insert(User user);
}
