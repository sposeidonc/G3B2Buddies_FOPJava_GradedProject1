package com.greatLearning.assignment1.dept.all;

import com.greatLearning.assignment1.superDept.SuperDepartment;

public class HrDepartment extends SuperDepartment {
	/*
	 * Implementation of the functionalities of HR department.
	 */
	public String departmentName() {
		return "Hr Department";
	}

	public String getTodaysWork() {
		return "Fill today's timesheet and mark your attendance";
	}

	public String getWorkDeadline() {
		return "Complete by EOD";
	}

	public String doActivity() {
		return "Team Lunch";
	}
}
