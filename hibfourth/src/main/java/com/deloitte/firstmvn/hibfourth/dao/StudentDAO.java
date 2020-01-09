package com.deloitte.firstmvn.hibfourth.dao;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import com.deloitte.firstmvn.hibfourth.entity.Student;
public class StudentDAO 
{
	 SessionFactory factory=null;
	 public StudentDAO(SessionFactory factory)
	 {
		 this.factory=factory;
	 }
	 public boolean insertStudent(Student s)
	 {
		 Session session = factory.openSession();
		 Transaction trans = session.beginTransaction();
		 session.save(s);
		 trans.commit();
		 session.close();
		 return true;
	 }
	 public Student getStudent(int rno)
	 {
		 Session session = factory.openSession();
		 Student s = session.get(Student.class, rno);
		 return s;
	 }
	 public boolean updateStudent(Student s)
	 {
		 Session session = factory.openSession();
		 Transaction trans = session.beginTransaction();
		 session.update(s);
		 trans.commit();
		 session.close();
		 return true;
	 }
		 public Student deleteStudent(int rno)
		 {
			 Session session = factory.openSession();
			 Student s = new Student();
			 s.setRno(rno);
			 Transaction trans = session.beginTransaction();
			 session.delete(s);
			 trans.commit();
			 session.close();
			 return s;
		 }
		 
	 }
		 