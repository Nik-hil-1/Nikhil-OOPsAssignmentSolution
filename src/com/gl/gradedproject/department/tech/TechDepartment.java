package com.gl.gradedproject.department.tech;

import com.gl.gradedproject.superdepartment.*;

public class TechDepartment extends SuperDepartment {
	
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
    
    public void showInfo() {
    	System.out.println("Welcome to "+departmentName());
    	System.out.println(getTodaysWork());
    	System.out.println(getWorkDeadline());
    	System.out.println(getTechStackInformation());
    	System.out.println(super.isTodayAHoliday());
    }

}
