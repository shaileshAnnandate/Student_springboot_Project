package com.student.Student.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.student.Student.Entity.Student;
import com.student.Student.service.Service;

@RestController
public class Controller {

	@Autowired
	Service ss;
	
	@GetMapping("/Getdata")
	public List<Student> getdata(){
		return ss.getdata();
	}
	
	@PostMapping("/InsertData")
	public String insertData(@RequestBody List<Student> s){
		return ss.insertData(s);
	}
	
	@PutMapping("/UpdateData")
	public String updateData(@RequestBody List<Student> stu) {
		return ss.updateData(stu);
	}
	
	@DeleteMapping("/DeleteData/{StudentId}")
	public String deleteData(@PathVariable int StudentId){
		return ss.deleteData(StudentId);
	}
}
