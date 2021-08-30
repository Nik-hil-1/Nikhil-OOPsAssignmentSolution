package com.gl.gradedproject.main;

import com.gl.gradedproject.superdepartment.SuperDepartment;
import com.gl.gradedproject.department.admin.AdminDepartment;
import com.gl.gradedproject.department.hr.HrDepartment;
import com.gl.gradedproject.department.tech.TechDepartment;

public class Driver {

	public static void main(String[] args) {
		SuperDepartment admin = new AdminDepartment();
		SuperDepartment hr = new HrDepartment();
		SuperDepartment tech = new TechDepartment();
		
		System.out.println();
		admin.showInfo();
		System.out.println("\n-----------------------------------------------------\n");
		hr.showInfo();
		System.out.println("\n-----------------------------------------------------\n");
		tech.showInfo();
	}
	
}
