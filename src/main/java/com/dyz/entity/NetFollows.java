package com.dyz.entity;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class NetFollows {
	private Integer follows_Id;
	private Integer stu_Id;
	private String studentName;
	private String followTime;
	private String nextFollowTime;
	private String conTent;
	private Integer user_Id;
	private String followType;
	
	private String createTime;
	private String followState;
	private Integer nexit1int;
	private String nexit2String;

	private Student student;
}
