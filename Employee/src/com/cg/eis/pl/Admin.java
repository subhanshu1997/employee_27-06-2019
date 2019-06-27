package com.cg.eis.pl;
import java.io.*;

import com.cg.eis.bean.Employee;
import com.cg.eis.service.Validator;
import com.cg.eis.service.*;

public class Admin {
public static void main(String[] args) throws IOException {
	while(true) {
	System.out.println("1. Add Employee");
	System.out.println("2. Delete Employee");
	System.out.println("3. Get Employee Details");
	System.out.println("4. Get All Employee Details");
	System.out.println("5. Get Insurance Scheme");
	System.out.println("6. exit");
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	String choice=br.readLine();
	servicesOffered so=new servicesImplemented();
	switch(choice) {
	case "1":{
		int eid=0;
		String name="";
		double salary;
		String designation;
		String insurancescheme;
		System.out.println("Enter Employee Id");
		while(true) {
			String input=br.readLine();
			boolean ch=Validator.validate(input,Validator.eidpattern);
			if(ch==true) {
				try {
				eid=Integer.parseInt(input);
				break;
				}catch(NumberFormatException e) {
					System.out.println("Account number must be numeric");
				}
			}
			else {
				System.out.println("Enter valid Employee number");
			}
		}
		System.out.println("Enter Employee Name");
		while(true) {
			String input=br.readLine();
			boolean ch=Validator.validate(input,Validator.namepattern);
			if(ch==true) {
				name=input;
				break;
			}
			else {
				System.out.println("Enter valid Employee Name");
			}
		}
		System.out.println("Enter Employee Designation");
		while(true) {
			String input=br.readLine();
			boolean ch=Validator.validate(input,Validator.namepattern);
			if(ch==true) {
				designation=input;
				break;
			}
			else {
				System.out.println("Enter valid Employee Designation");
			}
		}
		System.out.println("Enter Employee Salary");
		while(true) {
		String input=br.readLine();
		boolean ch=Validator.validate(input,Validator.salary);
		if(ch==true) {
			salary=Double.parseDouble(input);
			break;
		}
		else {
			System.out.println("Enter Valid Salary");
		}
		}
//		System.out.println("Enter Employee InsuranceScheme");
//		input=br.readLine();
//		while(true) {
//			boolean ch=Validator.validate(input,Validator.namepattern);
//			if(ch==true) {
//				insurancescheme=input;
//				break;
//			}
//			else {
//				System.out.println("Enter valid Employee Designation");
//			}
//		}
		Employee e=new Employee(eid, name, salary, designation,null);
		so.addEmployee(e);
//		Employee e=new Employee(id, name, salary, designation, InsuranceScheme)
	}break;
	case "2":{
		int eid;
		System.out.println("Enter Employee Id");
		while(true) {
			String input=br.readLine();
			boolean ch=Validator.validate(input,Validator.eidpattern);
			if(ch==true) {
				try {
				eid=Integer.parseInt(input);
				break;
				}catch(NumberFormatException e) {
					System.out.println("Account number must be numeric");
				}
			}
			else {
				System.out.println("Enter valid Employee number");
			}
		}
		if(so.deleteEmployee(eid)==false) {
			System.out.println("Employee does not exist");
		}
	}break;
	case "3":{
		int eid;
		System.out.println("Enter Employee Id");
		while(true) {
			String input=br.readLine();
			boolean ch=Validator.validate(input,Validator.eidpattern);
			if(ch==true) {
				try {
				eid=Integer.parseInt(input);
				break;
				}catch(NumberFormatException e) {
					System.out.println("Account number must be numeric");
				}
			}
			else {
				System.out.println("Enter valid Employee number");
			}
		}
		so.getDetails(eid);	
	}break;
	case "4":{
		so.getAllEmployeeDetails();
	
	}break;
	case "5":{
		double salary;
		String designation;
		System.out.println("Enter Employee Designation");
		while(true) {
			String input=br.readLine();
			boolean ch=Validator.validate(input,Validator.namepattern);
			if(ch==true) {
				designation=input;
				break;
			}
			else {
				System.out.println("Enter valid Employee Designation");
			}
		}
		System.out.println("Enter Employee Salary");
		String input=br.readLine();
		salary=Double.parseDouble(input);
		so.getInsuranceScheme(salary,designation);	
	}break;
	case "6":{
		System.exit(0);
	}break;
	}
	}
}
}
