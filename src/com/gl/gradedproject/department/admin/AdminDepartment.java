package com.gl.gradedproject.department.admin;

import com.gl.gradedproject.superdepartment.*;

public class AdminDepartment extends SuperDepartment {
	
	public String departmentName() {
		return "Admin Department";
	}
	
    public String getTodaysWork() {
		return "Complete your Documents Submission";
	}

    public String getWorkDeadline() {
	    return "Complete by EOD";
    }
    
    public void showInfo() {
    	System.out.println("Welcome to "+departmentName());
    	System.out.println(getTodaysWork());
    	System.out.println(getWorkDeadline());
    	System.out.println(super.isTodayAHoliday());
    }

}
