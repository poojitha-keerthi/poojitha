package com.Deloitte.java.entity.Employee;

public class Person 
{
   int ssn;
   String name;
   int age;
   public Person() {}
public Person(int ssn, String name, int age) {
	super();
	this.ssn = ssn;
	this.name = name;
	this.age = age;
}
public int getSsn() {
	return ssn;
}
public void setSsn(int ssn) {
	this.ssn = ssn;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
   
}
