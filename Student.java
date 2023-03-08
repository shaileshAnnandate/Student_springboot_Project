package com.student.Student.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
   
	@Id
	private int StudentId;
	private String studName;
	private String studAddres;
	private String studClass;

	public int getStudentId() {
		return StudentId;
	}

	public void setStudentId(int studentId) {
		StudentId = studentId;
	}

	public String getStudName() {
		return studName;
	}

	public void setStudName(String studName) {
		this.studName = studName;
	}

	public String getStudAddres() {
		return studAddres;
	}

	public void setStudAddres(String studAddres) {
		this.studAddres = studAddres;
	}

	public String getStudClass() {
		return studClass;
	}

	public void setStudClass(String studClass) {
		this.studClass = studClass;
	}

	@Override
	public String toString() {
		return "Student [StudentId=" + StudentId + ", studName=" + studName + ", studAddres=" + studAddres
				+ ", studClass=" + studClass + "]";
	}

}
