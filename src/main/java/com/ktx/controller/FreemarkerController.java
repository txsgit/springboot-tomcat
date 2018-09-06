package com.ktx.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/freemarker")
public class FreemarkerController {

	
	//正常和springmvc设置返回参数是意义的用法了
		@GetMapping("/map")
		public String index(String name,ModelMap map) {
			map.addAttribute("name", name);
			map.addAttribute("from", "lqdev.cn");
			//模版名称，实际的目录为：src/main/resources/templates/freemarker.html
			return "freemarker";
		}
		
		@GetMapping("/mv")
		public String index(String name,ModelAndView mv,HttpServletRequest request) {
//			mv.addObject("name", name);
//			mv.addObject("from", "lqdev.cn");
			request.setAttribute("name", name);
			request.setAttribute("from", "lqdev.cn");
			//模版名称，实际的目录为：src/main/resources/templates/freemarker.html
			return "freemarker";
		}
}
