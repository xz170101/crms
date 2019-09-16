package com.dyz.entity;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class UserChecks {
	private Integer checks_Id;
	private Integer user_Id;
	private String userName;
	private String checkInTime;
	private Boolean  checkState;
	private Boolean  isCancel;
	private String checkOutTime;
	private Integer ucexit1int;
	private String ucexit2String;
}
