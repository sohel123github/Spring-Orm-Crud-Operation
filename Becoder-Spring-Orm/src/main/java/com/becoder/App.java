package com.becoder;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.becoder.dao.StudentDao;
import com.becoder.pojo.Student;

public class App {
	public static void main(String[] args) {
//    	System.out.println("Hello Sohel");
		ApplicationContext context = new ClassPathXmlApplicationContext("com/becoder/xml/orm.cfg.xml");

//		HibernateTemplate temp = context.getBean("template", HibernateTemplate.class);
//		System.out.println(temp);

		StudentDao dao = context.getBean("stDao", StudentDao.class);

//		Student s = new Student();
//		s.setId(2);
//		s.setName("Abhay");
//		s.setAddress("Pune");

		// create student -
//		int i = dao.saveStudent(s);
//		System.out.println("Insert Successfully.. " + i);

		// get student -
//		Student st = dao.getStudent(1);
//		System.out.println(st);

		// update student -
//		st.setName("Abhay");
//		st.setAddress("Pune");
//		dao.updateStudent(st);
//		System.out.println("Update Sucessfully");

		// delete student -
//		dao.deleteStudent(1);
//		System.out.println("Deleted successfully..");

		// get all student -
		List<Student> list = dao.getAllStudent();
		for (Student sts : list) {
			System.out.println(sts);
		}

	}
}