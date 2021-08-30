package com.gl.gradedproject.superdepartment;

public abstract class SuperDepartment {
	
	public String departmentName() {
		return "Super Department";
	}
	
    public String getTodaysWork() {
	    return "No Work as of Now";	
	}

    public String getWorkDeadline() {
	    return "Nil";
    }

    public String isTodayAHoliday() {
	    return "Today is not a holiday";
    }
    
    public abstract void showInfo();

}
