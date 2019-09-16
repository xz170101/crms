package com.dyz.entity;

import java.util.List;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class Fenye {
	private Integer page;
	private Integer pageSize;
	private Integer total;
	private List<?> rows;
 //用来做多条件查询的 通用
	private String text1;
	private String text2;
	private String text3;
	private String text4;
	private String text5;
	private String text6;
	private String text7;
	private String text8;
	private String text9;
	
	
	private Integer num1;
	private Integer num2;
	private Integer num3;
	private Integer num4;
	private Integer num5;
	private Integer num6;
 
	private Student student;
	
	private String UserName;
	
	private Integer me_isstate;
}
