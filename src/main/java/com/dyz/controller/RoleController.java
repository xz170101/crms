package com.dyz.controller;


import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.dyz.entity.Fenye;
import com.dyz.entity.Role;
import com.dyz.service.RoleService;
import com.dyz.util.TreeModel;


@RestController
public class RoleController {
	@Autowired
	private RoleService roleService;
	
	/**
	 * 分页查询所有角色
	 * @param fenye
	 * @return
	 */
	@RequestMapping(value="/selectRole",method=RequestMethod.POST)
	public Fenye selectRole(Fenye fenye) {
		Integer row = Integer.parseInt((String)fenye.getRows().get(0));
		fenye.setPage((fenye.getPage()-1)*row);
		fenye.setPageSize(row);
 		return roleService.getRole(fenye);
	}
	/**
	 * 修改角色信息
	 * @param role
	 * @return
	 */
	@RequestMapping(value="/updateRole",method=RequestMethod.POST)
	public Integer updateRole(Role role) {
		return  roleService.updateRole(role);
	}
	/**
	 * 添加角色
	 * @param role
	 * @return
	 */
	@RequestMapping(value="/insertRole",method=RequestMethod.POST)
	public Integer insertRole(Role role) {
		return  roleService.insertRole(role);
	}
	/**
	 * 删除角色
	 * @param roles_Id
	 * @return
	 */
	@RequestMapping(value="/delRole",method=RequestMethod.POST)
	public Integer delRole(Integer roles_Id) {
		return  roleService.delRole(roles_Id);
	}
	/**
	 * 根据id查询角色具有的模块
	 * @param roles_Id
	 * @return
	 */
	@RequestMapping(value="/selectModuleByRoleId",method=RequestMethod.POST)
	public ArrayList<TreeModel> selectRoleMod(Integer roles_Id) {
		return  roleService.selectRoleModules(roles_Id);
	}
	/**
	 * 保存该角色的 模块
	 * @param modules_Ids
	 * @param roles_Id
	 * @return
	 */
	@RequestMapping(value="/saveRoleMod",method=RequestMethod.POST)
	public Integer saveRoleMod(String modules_Ids,Integer roles_Id) {
		 
		return  roleService.insertRoleModules(modules_Ids,roles_Id);
	}
}
