package com.ktx.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ktx.domain.User;
import com.ktx.mapper.UserMapper;


@Service
@Transactional
public class UserServiceImpl implements UserService {

	
	@Autowired
	UserMapper userMapper;
	
	public User getUSer(User user)
	{
		int flag=0;
		//先查询，判断是否存在
		User users=userMapper.selectUser(user);
		
		
		return null;
	}
	
	public boolean addUSer(User user)
	{
		return userMapper.insertUser(user);
	}
	
	public List<User> selectUser(Map<String,Object> map)
	{
		return userMapper.selectUser(map);
	}
}
