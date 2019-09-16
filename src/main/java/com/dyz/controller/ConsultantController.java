package com.dyz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.dyz.entity.Fenye;
import com.dyz.entity.Student;
import com.dyz.service.ConsultantService;

@RestController
public class ConsultantController {
	@Autowired
	private ConsultantService consultantService;
	
	@RequestMapping(value="/selectCon",method=RequestMethod.POST)	
	public Fenye select(Fenye fenye,Integer page,Integer rows) {
		fenye.setPage((page-1)*rows);
		fenye.setPageSize(rows);
		return consultantService.selectStuAll(fenye);
	}
	
	@RequestMapping(value="/updateStu",method=RequestMethod.POST)
	public Integer updateStu(Student student) {
			System.out.println("进来了========"+consultantService.updateStu(student));
		return consultantService.updateStu(student);
	}

}
