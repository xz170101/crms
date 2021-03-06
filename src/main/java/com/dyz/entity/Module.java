package com.dyz.entity;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class Module {
	private Integer modules_Id;//模块Id 
	private Integer parentId;//父模块编号
	private Integer modules_weight;//模块权重
	private String modules_Name;//模块名称
	private String modules_path;//模块路径
	private Integer mexit1int;
	private String mexit2String;
	private RoleModules roleModules;
	
}
