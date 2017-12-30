package cn.et.lesson01.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import cn.et.lesson01.dao.EmpRepository;
import cn.et.lesson01.entity.Emp;
import cn.et.lesson01.service.EmpService;
@Service
public class EmpServiceImpl implements EmpService {
	/*
	 * 只需要配置application.properties的四要素 即可使用该类
	 * spring.datasource.url=jdbc:mysql://localhost/food
		spring.datasource.username=root
		spring.datasource.password=123
		spring.datasource.driver-class-name=com.mysql.jdbc.Driver
	 */
	@Autowired
	JdbcTemplate jdbc;
	/**
	 * 自定义一个接口继承自CrudRepository即可
	 * interface EmpRepository entends CrudRepository<操作试题类型,主键类型>
	 */
	@Autowired
	EmpRepository er;
	
	public Map hello(){
		Map map=new HashMap();
		map.put("id", 1);
		map.put("name", "zs");
		return map;
	}
	
	public Map getEmp(String empId){
		List<Map<String, Object>> list=jdbc.queryForList("select * from emp where id="+empId);
		return list.get(0);
	}
	
	
	public String saveEmp(Emp emp){
		
		er.save(emp);
		return "1";
	}
	
	public Emp queryEmp(){
		Emp emp=er.findOne(2);
		return emp;
	}
	public void deleteEmp(Integer empId){
		er.delete(empId);
	}
	public void updateEmp(Emp emp){
		er.save(emp);
	}
	
}
