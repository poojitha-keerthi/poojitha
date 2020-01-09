package com.deloitte.fourthmvn.firstspringapp.config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.deloitte.fourthmvn.firstspringapp.beans.Adress;
import com.deloitte.fourthmvn.firstspringapp.beans.Person;
@Configuration
public class AppConfig 
{
   @Bean
   public Adress adress()
   {
	   return new Adress("5-6-7","Bangalore","Karnataka");
   }
   @Bean
   public Person person()
   {
	   return new Person(101,"Ajay",adress());
   }
}
