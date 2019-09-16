package com.dyz.entity;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class Message {
	private Integer me_id;
	private String me_startdate;
	private String me_content;
	private String me_seedate;
	private Integer me_isstate;
	private Integer me_exitInt;
	private String me_exitString;
	private String me_sender;
	private String me_receiver;
}
