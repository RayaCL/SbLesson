package cn.et.lesson01.service;

import java.util.Map;

import cn.et.lesson01.entity.Emp;

public interface EmpService {
	public Map getEmp(String empId);
	public String saveEmp(Emp emp);
	public Emp queryEmp();
	public void deleteEmp(Integer empId);
	public void updateEmp(Emp emp);
}
