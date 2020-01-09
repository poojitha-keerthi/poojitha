package com.deloitte.fourthmvn.firstspringapp;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.deloitte.fourthmvn.firstspringapp.beans.Person;
import com.deloitte.fourthmvn.firstspringapp.config.AppConfig;
public class App 
{
    public static void main( String[] args )
    {
      AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
   // Wisher w1 = (Wisher)context.getBean("wish1");
      Person p = context.getBean(Person.class,"per1");
      System.out.println(p.getSsn()+" "+p.getName());
      System.out.println(p.getAdress().getHno()+" "+p.getAdress().getCity());
      System.out.println(p.getAdress().getState());
       context.close();
    }
}
