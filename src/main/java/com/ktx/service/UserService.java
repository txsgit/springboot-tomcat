package com.ktx.service;

import java.util.List;
import java.util.Map;

import com.ktx.domain.User;


public interface UserService {

	
public User getUSer(User user);
	
	public boolean addUSer(User user);
	
	public List<User> selectUser(Map<String,Object> map);
}
