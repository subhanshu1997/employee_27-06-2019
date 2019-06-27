package com.cg.eis.service;

import java.util.*;

import com.cg.eis.bean.Employee;

public class servicesImplemented implements servicesOffered{
static Map<Integer,Employee> mp=new HashMap<Integer,Employee>();
	@Override
	public void getDetails(int id) {
		if(mp.get(id)==null) {
			System.out.println("Employee Does Not Exist");
		}
		else
		System.out.println(mp.get(id));
	}

	@Override
	public String getInsuranceScheme(double salary,String designation) {
		if(salary>5000 && salary<20000 && designation.equals("Systemassociate")) {
			return "Scheme C";
		}
		else if(salary>=20000 && salary<40000 && designation.equals("Prgrammer")) {
			return "Scheme B";
		}
		else if(salary>=40000 && designation.equals("Manager")) {
			return "Scheme A";
		}
		else if(salary<5000 && designation.equals("Clerk")) {
			return "No Scheme";
		}
		return "No Scheme";
	}

	@Override
	public void getAllEmployeeDetails() {
		if(mp.size()==0) {
			System.out.println("No Employee Exist");
		}
		else {
		Collection<Employee> c=mp.values();
		List<Employee> l=new ArrayList<Employee>(c);
		Collections.sort(l);
		for(Employee em:l) {
			System.out.println(em);
		}}
	}

	@Override
	public boolean addEmployee(Employee e){
		String insuranceScheme=getInsuranceScheme(e.getSalary(),e.getDesignation());
		e.setInsuranceScheme(insuranceScheme);
		mp.put(e.getId(),e);
		System.out.println("Employee Added");
		return true;
	}

	@Override
	public boolean deleteEmployee(int eid) {
		if(mp.get(eid)!=null) {
		mp.remove(eid);
		System.out.println("Employee Deleted");
		return true;}
		return false;
	}

}
