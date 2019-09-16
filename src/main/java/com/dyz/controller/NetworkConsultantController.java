package com.dyz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.dyz.entity.Fenye;
import com.dyz.entity.Message;
import com.dyz.entity.Student;
import com.dyz.service.NetworkConsultantService;

@RestController
public class NetworkConsultantController {
	@Autowired
	private NetworkConsultantService networkConsultantService;
	@RequestMapping(value="/selectStu",method=RequestMethod.POST)
	public Fenye select(Fenye fenye,Integer page,Integer rows) {
		fenye.setPage((page-1)*rows);
		fenye.setPageSize(rows);
		return networkConsultantService.selectStu(fenye);
	}
	@RequestMapping(value="/insertStu",method=RequestMethod.POST)
	public Integer insert(Student student) {
		System.out.println(student.toString());
		return networkConsultantService.insertStu(student);
	}
	@RequestMapping(value="/jishitongxun",method=RequestMethod.POST)
	public void jishitongxun(String rowc,String name,String mess) {
		networkConsultantService.jishitongxun(rowc, name, mess);
	}
}
