package com.greatLearning.assignment1.client;

import com.greatLearning.assignment1.dept.all.AdminDepartment;
import com.greatLearning.assignment1.dept.all.HrDepartment;
import com.greatLearning.assignment1.dept.all.TechDepartment;

public class Main {
	public static void main(String[] args) {

		// Creation of AdminDepartment class object and calling it's functionalities.
		AdminDepartment adminObj = new AdminDepartment();
		System.out.println("Welcome to " + adminObj.departmentName());
		System.out.println(adminObj.getTodaysWork());
		System.out.println(adminObj.getWorkDeadline());
		System.out.println(adminObj.isTodayAHoliday());

		System.out.println("");

		// Creation of HrDepartment class object and calling it's functionalities.
		HrDepartment hrObj = new HrDepartment();
		System.out.println("Welcome to " + hrObj.departmentName());
		System.out.println(hrObj.doActivity());
		System.out.println(hrObj.getTodaysWork());
		System.out.println(hrObj.getWorkDeadline());
		System.out.println(hrObj.isTodayAHoliday());

		System.out.println("");

		// Creation of TechDepartment class object and calling it's functionalities.
		TechDepartment techObj = new TechDepartment();
		System.out.println("Welcome to " + techObj.departmentName());
		System.out.println(techObj.getTodaysWork());
		System.out.println(techObj.getWorkDeadline());
		System.out.println(techObj.getTechStackInformation());
		System.out.println(techObj.isTodayAHoliday());
	}
}
