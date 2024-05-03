package com.becoder.dao;

import java.util.List;

import com.becoder.pojo.Student;

public interface StudentDao {

	public int saveStudent(Student stud);
	
	public Student getStudent(int id);
	
	public List<Student> getAllStudent();
	
	public void updateStudent(Student stud);
	
	public void deleteStudent(int id);
	
}
