package com.ktx;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

/**
 * 启用类
 * @author Administrator
 *
 */
@SpringBootApplication
@ServletComponentScan
@MapperScan("com.ktx.mapper")
//@ImportResource({"classpath:spring-*.xml"})
public class Chapter1Application {

	public static void main(String[] args) {
		SpringApplication.run(Chapter1Application.class, args);
	}
}
