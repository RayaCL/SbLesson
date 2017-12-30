package cn.et.lesson01.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.et.lesson01.entity.Emp;
import cn.et.lesson01.service.EmpService;

@RestController

public class SbController {
	@Autowired
	EmpService service;
	/**
	 * helloworld例子
	 * @return
	 */
	@RequestMapping("/hello")
	//必须添加SpringBootApplication启动spring的自动配置
	public Map hello(){
		Map map=new HashMap();
		map.put("id", 1);
		map.put("name", "zs");
		return map;
	}
	@RequestMapping("/emp/{empId}")
	public Map getEmp(@PathVariable String empId){

		return service.getEmp(empId);
	}
	
	@RequestMapping("/saveEmp")
	public void saveEmp(){
		Emp emp=new Emp();
		emp.setEname("ww");
		emp.setSal(12.4);
		emp.setDeptid(4);
		service.saveEmp(emp);
	}
	@RequestMapping("/queryEmp")
	public Emp queryEmp(){
		
		return service.queryEmp();
	}
	@RequestMapping("/deleteEmp/{empId}")
	public void deleteEmp(@PathVariable Integer empId){
		service.deleteEmp(empId);;
	}
	@RequestMapping("/updateEmp")
	public void updateEmp(){
		Emp emp=new Emp();
		emp.setId(25);
		emp.setEname("hh");
		emp.setSal(12.4);
		emp.setDeptid(4);
		service.updateEmp(emp);
	}
	
}
