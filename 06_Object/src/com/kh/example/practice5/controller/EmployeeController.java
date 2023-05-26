package com.kh.example.practice5.controller;

import com.kh.example.practice5.model.Employee;

public class EmployeeController {
	private Employee emp = new Employee();
	
	
	// 오버로딩
	public void add(int empNo, String name, char gender, String phone) {
		emp.setEmpNo(empNo);
		emp.setName(name);
		emp.setGender(gender);
		emp.setPhone(phone);
	}
	
	public void add(int empNo, String name, char gender, String phone, String dept, int salary, double bonus) {
		emp.setEmpNo(empNo);
		emp.setName(name);
		emp.setGender(gender);
		emp.setPhone(phone);
		// == add(empNo, name, gender, phone);
		emp.setDept(dept);
		emp.setSalary(salary);
		emp.setBonus(bonus);
	}
	
	public void modify(String phone) {
		emp.setPhone(phone);
	}
	
	public void modify(int salary) {
		emp.setSalary(salary);
	}
	
	public void modify(double bonus) {
		emp.setBonus(bonus);
	}
	
	public Employee info() {
		return emp;
	}
}
