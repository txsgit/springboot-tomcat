package com.ktx.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ktx.domain.User;
import com.ktx.redis.RedisInterface;
import com.ktx.service.UserService;


@Controller
@RequestMapping("/jsp")
public class JspController {

	
	@Autowired
	UserService userService;
	
	@Autowired
	RedisInterface redisInterface;
	
	@GetMapping("/map")
	public String index(String name,ModelMap map) {
		map.addAttribute("name", name);
		map.addAttribute("from", "lqdev.cn");
		//模版名称，实际的目录为：src/main/webapp/jsp/index.html
		return "index";
	}
	
	/**
	 * 用户测试
	 * @return
	 */
	@RequestMapping("/showUser")
	public String userInfo(HttpServletRequest req)
	{
		
		/*for(int i=11;i<=20;i++)
		{
			User user = new User();
//			user.setId(idGenerator.generateId().longValue());
//			user.setEnterpriseId(new Long(i));
			user.setName("aaa"+i);
			user.setNickName("a3");
			user.setPassword("123456");
			user.setPhone("13601405865");
			user.setEnterpriseId(2l);
			 //user = userService.getUSer(user);
			userService.addUSer(user);
			 req.setAttribute("user", user);
		}*/
		
		//查
		PageHelper.startPage(1, 5);
		Map<String,Object> map=new HashMap<String, Object>();
		map.put("enterpriseId", 2);
//		map.put("id", "2");
		List<User> users=userService.selectUser(map);
		PageInfo pageInfo = new PageInfo<User>(users);
		 req.setAttribute("users", users);
		 
		 redisInterface.set("users", "123");
		 String str=redisInterface.get("users");
		 System.out.println(str);
		 
		return "user";
	}
	
	
}
