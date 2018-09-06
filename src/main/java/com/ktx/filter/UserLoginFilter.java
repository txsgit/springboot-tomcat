package com.ktx.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

import lombok.extern.slf4j.Slf4j;

@WebFilter(filterName="userLoginFilter",urlPatterns={"/*"})
@Slf4j
public class UserLoginFilter implements Filter {

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		log.info("filter 初始化");
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		log.info("doFilter 处理请求");
		 chain.doFilter(request, response);
	}

	@Override
	public void destroy() {
		log.info("filter 销毁");
		
	}

}
