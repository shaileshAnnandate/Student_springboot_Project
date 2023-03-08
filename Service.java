package com.student.Student.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.student.Student.Dao.Dao;
import com.student.Student.Entity.Student;

@org.springframework.stereotype.Service

public class Service {
	
	@Autowired
	Dao dao ;

	public List<Student> getdata() {
		
		return dao.getdata();
	}

	public String insertData(List<Student> s) {
		
		return dao.insertData(s);
	}

	public String updateData(List<Student> stu) {
		
		return dao.updateData(stu);
	}

	public String deleteData(int studentId) {
		
		return dao.deleteData(studentId);
	}




}
