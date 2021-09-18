package org.student;

import org.department.Department;

public class Student extends Department {
	public void studentName(String studentName) {
		System.out.println("Student Name is"+studentName);
	}
	public void studentDept(String dept) {
		System.out.println("The student department is:"+dept);

	}
	public void studentId(int id) {
		System.out.println("The student id is"+id);

	}
	public static void main(String[] args) {
		Student obj = new Student();
		obj.studentName("Jennifer");
		obj.studentDept("Electrical and electronics");
		obj.studentId(1009);
		obj.collegeNamae("Stanford");
		obj.collegeCode(3101);
		obj.collegeRank(2);
		obj.deptName("EEE");
		
	}
}
