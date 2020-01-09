package com.deloitte.firstmvn.hibfirst;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import java.sql.Date;
import java.util.Properties;
import org.hibernate.cfg.Configuration;

import com.deloitte.firstmvn.hibfirst.dao.EmployeeDAO;
import com.deloitte.firstmvn.hibfirst.entity.Employee;
public class App 
{
    public static void main( String[] args )
    {
    	Configuration cfg = new Configuration();
       cfg.configure();
       SessionFactory factory = cfg.buildSessionFactory();
       EmployeeDAO edao = new EmployeeDAO(factory);
       Employee e1 = new Employee(111,"Varma",11000,new Date(2000,10,11));
       edao.insertEmployee(e1);
        e1 = edao.getEmployee(102);
    	 if(e1!=null)
    		 System.out.println(e1.getEname()+"   "+e1.getSalary()+"  "+e1.getDoj());
       factory.close();
    }
}
