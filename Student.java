package org.student;


import org.department.Department;

public class Student extends Department{
	
	public void studentName(String name) {
		//name="Thamarai";
		System.out.println("Student name is "+name);
	}
	
	public void studentDept(String deptname) {
		//deptname="IT APPS";
		System.out.println("Department name is "+deptname);
		
	}
	
	public void studentId(int id) {
		//id=430488;
		System.out.println("Student Id number is "+id);
		
	}
	

	public static void main(String[] args) {
		
		Student obj=new Student();
		obj.studentId(430488);
		obj.studentDept("IT APPS");
		obj.studentName("Thamarai");
		obj.deptName("IT APPS");
		obj.collegeCode(322323);
		obj.collegeName("VIT UNIVERSITY");
		obj.collegeRank(8);
		System.out.println("*******Multilevel Inheritance*************");
	}

}
