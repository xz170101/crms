package com.dyz.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.dyz.service.ECharsService;

@RestController
public class ECharsController {
	@Autowired
	private ECharsService eCharsService;
	
	/**
	 * 
	 * @return
	 */
	@RequestMapping(value="/selectUserCount",method=RequestMethod.POST)
	public Integer selectUserCount() {
	 
		return eCharsService.selectUserCount();
	}
	@RequestMapping(value="/selectStudentCount",method=RequestMethod.POST)
	public Integer selectStudentCount() {
		
		return eCharsService.selectStudentCount();
	}
	@RequestMapping(value="/selectTransactionCount",method=RequestMethod.POST)
	public Integer selectTransactionCount() {
		
		return eCharsService.selectTransactionCount();
	}
	@RequestMapping(value="/selectUserCheckCount",method=RequestMethod.POST)
	public Integer selectUserCheckCount() {
		return eCharsService.selectUserCheckCount();
	}
	/**
	 * 查看各角色的人数
	 * @return
	 */
	@RequestMapping(value="/selectRoseCount",method=RequestMethod.POST)
	public List<Map<Integer, String>> selectRoseCount() {
		return eCharsService.selectRoseCount();
	}
	 /**
	  * 饼图查看客户来源
	  * @return
	  */
	@RequestMapping(value="/selectStuSourceUrl",method=RequestMethod.POST)
	public List<Map<Integer, String>> selectStuSourceUrl() {
		return eCharsService.selectStuSourceUrl();
	}
	/**
	 *成交数据对比
	 * @return
	 */
	@RequestMapping(value="/selectIsPay",method=RequestMethod.POST)
	public List<Object> selectWeekCount() {
		List<Object> list=new ArrayList<>();
		//List<Map<Integer, String>> nn=new ArrayList<Map<Integer, String>>(); 
		List<Map<Integer, String>> selectWeekCount = eCharsService.selectWeekCount();
		List<Map<Integer, String>> selectUpWeekCount = eCharsService.selectUpWeekCount();
		//nn.addAll(selectWeekCount);
		//nn.addAll(selectUpWeekCount);
		list.add(selectWeekCount);
		list.add(selectUpWeekCount);
		//return nn;
		return list;
	}
	

}
