package com.student.Student.Dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.student.Student.Entity.Student;

@Repository
public class Dao {

	@Autowired
	SessionFactory sf;

	public List<Student> getdata() {
		Session ss = sf.openSession();
		Criteria cr = ss.createCriteria(Student.class);
		return cr.list();
	}

	public String insertData(List<Student> s) {
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		for (Student student : s) {
			ss.save(student);

		}

		tr.commit();
		sf.close();

		return "Data inserted successfully...!";
	}

	public String updateData(List<Student> stu) {
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		for (Student student : stu) {
			ss.update(student);
		}
		tr.commit();
		sf.close();
		return "Data Updated successfully...!";
	}

	public String deleteData(int studentId) {
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		Student student	= ss.get(Student.class,studentId );
		ss.delete(student);
		tr.commit();
		sf.close();
		return "Data Deleted successfully...!";

	}

}
