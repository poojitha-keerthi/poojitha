package com.deloitte.fourthmvn.firstspringapp.beans;
import org.springframework.stereotype.Component;
@Component
public class Person 
{
   int ssn;
   String name;
   Adress adress;
   public Person(){}
   public Person(Adress adress) {this.adress=adress;}
public Person(int ssn, String name, Adress adress) 
{
	this.ssn = ssn;
	this.name = name;
	this.adress = adress;
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
public Adress getAdress() {
	return adress;
}
public void setAdress(Adress adress) {
	this.adress = adress;
}
   
}
