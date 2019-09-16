package com.dyz.entity;

import java.util.List;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class UserRole {
	private Integer ur_Id;
	private Integer roleId;
	private Integer userId;
	private Integer urexitInt;
	private String urexit2String;
	private User user;
	private List<Role> role;
}
