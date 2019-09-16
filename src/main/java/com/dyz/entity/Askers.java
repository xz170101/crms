package com.dyz.entity;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class Askers {
	private Integer askers_Id;
	private String askers_Name;
	private Boolean checkState;
	private String checkInTime;
	private String changeState;
	private Integer weight;
	private String roleName;
	private String bakContent;
	private Integer aexit1Int;//咨询师的学生数量
	private String aexit2String;
	private Integer usercheckid;
}
