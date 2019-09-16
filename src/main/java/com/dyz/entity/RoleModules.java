package com.dyz.entity;

import java.util.List;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class RoleModules {
	private Integer rm_Id; 
	private Integer roles_Id; 
	private Integer modules_Id; //代表的是父模块id
	private Integer rmexit1int; 
	private String rmexit2String;
	private Role role;
	private List<Module> module;
}
