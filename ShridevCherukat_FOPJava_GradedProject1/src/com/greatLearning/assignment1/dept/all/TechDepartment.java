package com.greatLearning.assignment1.dept.all;

import com.greatLearning.assignment1.superDept.SuperDepartment;

public class TechDepartment extends SuperDepartment {
	/*
	 * Implementation of the functionalities of Tech department.
	 */
	public String departmentName() {
		return "Tech Department";
	}

	public String getTodaysWork() {
		return "Complete coding of module 1";
	}

	public String getWorkDeadline() {
		return "Complete by EOD";
	}

	public String getTechStackInformation() {
		return "Core Java";
	}

}
