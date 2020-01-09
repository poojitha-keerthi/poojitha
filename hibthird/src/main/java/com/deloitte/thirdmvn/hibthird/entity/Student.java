package com.deloitte.thirdmvn.hibthird.entity;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.List;
@Entity
public class Student 
{
  @Id
  int sid;
  String sname;
  String adress;
  @ManyToMany(mappedBy="slist")
  List<Courses> clist;
  public Student(){}
public Student(int sid, String sname, String adress) 
{
	this.sid = sid;
	this.sname = sname;
	this.adress = adress;
}
public int getSid() {
	return sid;
}
public void setSid(int sid) {
	this.sid = sid;
}
public String getSname() {
	return sname;
}
public void setSname(String sname) {
	this.sname = sname;
}
public String getAdress() {
	return adress;
}
public void setAdress(String adress) {
	this.adress = adress;
}
public List<Courses> getClist() {
	return clist;
}
public void setClist(List<Courses> clist) {
	this.clist = clist;
}
  }
