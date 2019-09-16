package com.dyz.entity;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class Role {
	private Integer roles_Id;
	private String roles_Name;
	private Integer roles_Int;
	private String roles_String;
}
