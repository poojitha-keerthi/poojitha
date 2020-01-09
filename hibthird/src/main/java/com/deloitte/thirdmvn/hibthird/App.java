package com.deloitte.thirdmvn.hibthird;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.deloitte.thirdmvn.hibthird.entity.Courses;
import com.deloitte.thirdmvn.hibthird.entity.Department;
import com.deloitte.thirdmvn.hibthird.entity.Employee;
import com.deloitte.thirdmvn.hibthird.entity.Student;
public class App 
{
    public static void main( String[] args )
    {
       Configuration cfg = new Configuration();
       cfg.addAnnotatedClass(Courses.class);
       cfg.addAnnotatedClass(Student.class);
       cfg.configure();
       SessionFactory factory = cfg.buildSessionFactory();
       Session session = factory.openSession();
       Query qry = session.createQuery("from Department");
       List<Department> dlist = qry.list();
       for (Department d : dlist)
       {
    	     System.out.println(d.getDeptno()+" "+d.getDname());
                List<Employee> elist =d.getElist();
                for(Employee e : elist)
                	System.out.println(e.getEmpid()+"  "+e.getEname()+" "+e.getSalary());
       }
     /*  Courses c = session.get(Courses.class, 7001);
       if(c!=null)
       {
    	   System.out.println(c.getCname()+"  "+c.getDuration());
    	      for(Student s : c.getSlist())
    	    	  System.out.println(s.getSid()+" "+s.getSname()+" "+s.getAdress());
  }
       Student s = session.get(Student.class, 103);
       if(s!=null)
       {
    	   System.out.println(s.getSname()+" "+s.getAdress());
    	     for(Courses c1 : s.getClist())
    	    	 System.out.println(c1.getCid()+" "+c1.getCname()+"  "+c1.getDuration());
       } */
      session.close();
      factory.close();
      
      }
}