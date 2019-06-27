package com.cg.eis.service;

import java.util.Map;

import com.cg.eis.bean.Employee;

public interface servicesOffered {
public void getDetails(int id);
public String getInsuranceScheme(double salary,String designation);
public void getAllEmployeeDetails();
public boolean addEmployee(Employee e);
public boolean deleteEmployee(int eid);
}
