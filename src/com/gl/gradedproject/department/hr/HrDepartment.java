package com.gl.gradedproject.department.hr;

import com.gl.gradedproject.superdepartment.*;

public class HrDepartment extends SuperDepartment {
	
	public String departmentName() {
		return "HR Department";
	}
	
    public String getTodaysWork() {
		return "Fill today's timesheet and mark your attendance";
	}

    public String getWorkDeadline() {
	    return "Complete by EOD";
    }
    
    public String doActivity() {
    	return "Team Launch";
    }
        
    public void showInfo() {
    	System.out.println("Welcome to "+departmentName());
    	System.out.println(doActivity());
    	System.out.println(getTodaysWork());
    	System.out.println(getWorkDeadline());
    	System.out.println(super.isTodayAHoliday());
    }

}
