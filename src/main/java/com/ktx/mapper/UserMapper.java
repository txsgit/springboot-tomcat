package com.ktx.mapper;


import java.util.List;
import java.util.Map;

import com.ktx.domain.User;


public interface UserMapper {
	
	public User selectUser(User user);
	
	public boolean insertUser(User user);
	
	public List<User> selectUser(Map<String,Object> map);
	
	public boolean deleteUser(Map<String,Object> map);
	
	public boolean updateUser(User user);

}
