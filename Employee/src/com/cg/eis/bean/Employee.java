package com.cg.eis.bean;

public class Employee implements Comparable<Employee>{
	private int id;
	private String name;
	private double salary;
	private String designation;
	private String InsuranceScheme;
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public Employee(int id,String name,double salary,String designation,String InsuranceScheme) {
		this.designation=designation;
		this.id=id;
		this.InsuranceScheme=InsuranceScheme;
		this.name=name;
		this.salary=salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getInsuranceScheme() {
		return InsuranceScheme;
	}
	public void setInsuranceScheme(String insuranceScheme) {
		InsuranceScheme = insuranceScheme;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", designation=" + designation
				+ ", InsuranceScheme=" + InsuranceScheme + "]";
	}
	@Override
	public int compareTo(Employee o) {
		int diff=this.id-o.id;
		if(diff>0)
			return 1;
		else if(diff<0) {
			return -1;
		}
		return 0;
	}
	
	
}
