package com.dyz.entity;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class User {
	private Integer user_Id;
	private String loginName;//登录名
	private String passWord;//密码
	private Integer psdWrongTime;//密码错误次数
	private String lockTime;//被锁定时间
	private String protectEMail;//密保邮箱
	private String protectMTel;//密保手机号
	private String loginTime;//登录时间
	private String createTime;//账户创立时间
	private Integer isLockout;//是否锁定
	private String uexit2String;
	private Integer uexit1int;
}
