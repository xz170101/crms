package com.dyz.entity;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class Student {
	private Integer stu_id;
	private Integer user_Id;
	private Integer roles_Id;
	private String stu_Name;
	private Integer stu_Age;
	private Integer stu_Sex;
	private String stu_Phone;
	private String stu_Status;//学历
	private String stu_PerState;//状态
	private String stu_MsgSource;
	private String stu_SourceUrl;
	private String stu_SourceKeyWord;
	private String stu_Address;
	private String stu_NetPusherld;
	private Integer askers_Id;
	private String stu_qq;
	private String stu_WeiXin;
	private String stu_Content;
	private String stu_CreateTime;
	private String stu_LearnForward;
	private Integer stu_isValid;
	private String stu_Record;
	private Integer stu_isReturnVist;
	private Integer stu_isHome;
	private String stu_firstVisitTime;
	private String stu_HomeTime;
	private String stu_LostValid;
	private Integer stu_isPay;
	private String stu_PayTime;
	private Double stu_Money;
	private Integer stu_isReturnMoney;
	private Integer stu_isInClass;
	private String stu_inClassTime;
	private String stu_inClassContent;
	private String stu_AskerContent;
	private Integer stu_isDel;
	private String stu_FromPart;
	private String stu_stuConcern;
	private Integer stu_isBaoBei;
	private String stu_ZiXunName;
	private String stu_CreateUser;
	private String stu_ReturnMoneyReason;
	private Double stu_preMoney;
	private String stu_preMoneyTime;
	private Integer sexitInte;//打分
	private String sexitString;
	private NetFollows netFollows;
	
}
