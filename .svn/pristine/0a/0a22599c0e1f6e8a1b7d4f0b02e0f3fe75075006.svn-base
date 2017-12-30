package cn.et.lesson02.controller;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.et.lesson02.entity.Emp;
import cn.et.lesson02.mapper.EmpMapper;



@RestController

public class SbController {
	@Autowired
	DataSource dataSource;
	@Autowired
	EmpMapper mapper;
	
	@RequestMapping("/sysoSource")
	//必须添加SpringBootApplication启动spring的自动配置
	public String hello(){
		return dataSource.toString();
	}
	
	@RequestMapping("/queryAll")
	//必须添加SpringBootApplication启动spring的自动配置
	public List<Emp> queryAll(){
		return mapper.queryEmp();
	}
	@RequestMapping("/emp/{id}")
	public Emp queryById(@PathVariable Integer id){
		return mapper.queryById(id);
	}
}
