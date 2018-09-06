package com.ktx.domain;

import lombok.Data;

@Data
public class User {
private Long id;
	
	private String name;
	
	private String nickName;
	
	private String phone;
	
	private String email;
	
	private String password;

	private Long enterpriseId;
	
}
