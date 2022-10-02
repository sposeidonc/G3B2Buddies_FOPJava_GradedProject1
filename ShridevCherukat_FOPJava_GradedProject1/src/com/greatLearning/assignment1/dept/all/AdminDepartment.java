package com.greatLearning.assignment1.dept.all;

import com.greatLearning.assignment1.superDept.SuperDepartment;

public class AdminDepartment extends SuperDepartment {
	/*
	 * Implementation of the functionalities of Admin department.
	 */
	public String departmentName() {
		return "Admin Department";
	}

	public String getTodaysWork() {
		return "Complete your documents Submission";
	}

	public String getWorkDeadline() {
		return "Complete by EOD";
	}
}
