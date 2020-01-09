package com.deloitte.firstmvn.hibfourth.entity;
import java.sql.Date;
import javax.persistence.Id;
import org.hibernate.annotations.Entity;
@Entity
public class Student 
{
    @Id
    int rno;
    String name;
    Date dob;
    Double fee;
    public Student(){}
	public Student(int sid, String sname, Date dob, Double fee) 
	{
		this.rno = rno;   this.name = name;
		this.dob = dob;     this.fee = fee;
	}
	public int getRno() {
		return rno;
	}
	public void setRno(int rno) {
		this.rno = rno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public Double getFee() {
		return fee;
	}
	public void setFee(Double fee) {
		this.fee = fee;
	}
}
