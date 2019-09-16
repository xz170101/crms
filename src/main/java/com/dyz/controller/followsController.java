package com.dyz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.dyz.entity.Fenye;
import com.dyz.entity.NetFollows;
import com.dyz.service.FollowsService;

@RestController
public class followsController {
	@Autowired
	private FollowsService followsService;
	
	@RequestMapping(value="/selectFollows",method=RequestMethod.POST)
	public Fenye select(Fenye fenye,Integer page,Integer rows) {
		fenye.setPage((page-1)*rows);
		fenye.setPageSize(rows);
		
		return followsService.selectFollows(fenye);
	} 
	
	@RequestMapping(value="/insertFollows",method=RequestMethod.POST)
	public Integer insert(NetFollows follows) {
		
		return followsService.insertFollows(follows);
	} 
}
