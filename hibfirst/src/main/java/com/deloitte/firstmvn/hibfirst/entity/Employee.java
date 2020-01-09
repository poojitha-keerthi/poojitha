package com.deloitte.firstmvn.hibfirst.entity;
import java.sql.Date;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
@Entity
	public class Employee 
	{
	      @Id
	      @Column(name="id",columnDefinition="number(4)")
	      int empid;
	      @Column(name="name",length=20)
	      String name;
	   @Column(name="salary",columnDefinition="number(8,2)")   
	      double salary;
	      Date doj;
	      public Employee() {}
	      public Employee(int empid, String name, double salary, Date doj)
	      {
	    	  this.empid = empid;
	    	  this.name = name;
	    	  this.salary = salary;
	    	  this.doj = doj;
	      }
		public int getEmpid() 
		{
			return empid;
		}
		public void setEmpid(int empid) {
			this.empid = empid;
		}
		public String getEname() {
			return name;
		}
		public void setEname(String ename) {
			this.name = ename;
		}
		public double getSalary() {
			return salary;
		}
		public void setSalary(double salary) {
			this.salary = salary;
		}
		public Date getDoj() {
			return doj;
		}
		public void setDoj(Date doj) {
			this.doj = doj;
		}
	}
