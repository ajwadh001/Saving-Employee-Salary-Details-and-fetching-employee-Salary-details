package com.example.demo.emp;

import javax.persistence.*;

import com.sun.istack.NotNull;

@Entity
public class Emp {
	
	@Id
	@NotNull
	private Integer Id;
	
	@NotNull
	private String Name;
	
	@NotNull
	private String Month;
	
	@NotNull
	private String Salary;
	
	
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getMonth() {
		return Month;
	}
	public void setMonth(String month) {
		Month = month;
	}
	public String getSalary() {
		return Salary;
	}
	public void setSalary(String salary) {
		Salary = salary;
	}
	@Override
	public String toString() {
		return "Emp [Id=" + Id + ", Name=" + Name + ", Month=" + Month + ", Salary=" + Salary + "]";
	}
	
	
	
	

}
