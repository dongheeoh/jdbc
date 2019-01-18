package com.douzon.jdbc.hr.vo;

import java.util.Date;

public class hrVo {
	private String first_name;
	private String last_name;
	private Date hire_date;
	private int emp_no;
	private int salary;
	public String getFirst_name() {
		return first_name;
	}
	@Override
	public String toString() {
		return "hrVo [first_name=" + first_name + ", last_name=" + last_name + ", hire_date=" + hire_date + ", emp_no="
				+ emp_no + ", salary=" + salary + "]";
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public Date getHire_date() {
		return hire_date;
	}
	public void setHire_date(Date hire_date) {
		this.hire_date = hire_date;
	}
	public int getEmp_no() {
		return emp_no;
	}
	public void setEmp_no(int emp_no) {
		this.emp_no = emp_no;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
}
