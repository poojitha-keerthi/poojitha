package com.deloitte.firstmvn.hibfourth;
import java.sql.Date;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import com.deloitte.firstmvn.hibfourth.dao.StudentDAO;
import com.deloitte.firstmvn.hibfourth.entity.Student;
public class App 
{
    public static void main( String[] args )
    {
    	Configuration cfg = new Configuration();
        cfg.configure();
        SessionFactory factory = cfg.buildSessionFactory();
        StudentDAO sdao = new StudentDAO(factory);
        Student s1 = new Student(1,"Varma",new Date(2000,10,11),1200);
        sdao.insertStudent(s1);
         s1 = sdao.getStudent(1);
		session.save(s1);
         session.close(s1);
        factory.close();
    }
}
