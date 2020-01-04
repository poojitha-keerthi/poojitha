package com.del.entity.courses;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class peopleDAO 
{
public boolean insertCourses(Courses c)
		  {
			  int count=0;
			  Connection con = null;
			  PreparedStatement pst = null;
			  String url="jdbc:oracle:thin:@localhost:1521:orcl";
			  try
			  {
				  Class.forName("oracle.jdbc.driver.OracleDriver");
				  con = DriverManager.getConnection(url,"scott","tiger");
				  pst=con.prepareStatement("insert into courses values(?,?,?,?)");
				  pst.setInt(1, c.getCid());   pst.setString(2, c.getCname());
				  pst.setInt(3, c.getDuration());   pst.setInt(4,  c.getFee());
				  count = pst.executeUpdate();
			  }
			catch(Exception ex)
			  {
				ex.printStackTrace();
			  }
			  finally
			  {
				  try
				  {
					  if(pst!=null) pst.close();
					  if(con!=null) con.close();
				  }
		  		  catch(Exception ex)
		  		  {
		  			  ex.printStackTrace();
		  		  }
		  	  }
		  	  return count==1;
		  }
public boolean modifyCourses(Courses c)
{
	  int count=0;
	  Connection con = null;
	  PreparedStatement pst = null;
	  String url="jdbc:oracle:thin:@localhost:1521:orcl";
	  try
	  {
		  Class.forName("oracle.jdbc.driver.OracleDriver");
		  con = DriverManager.getConnection(url,"scott","tiger");
		  pst=con.prepareStatement("update courses Cname=?,Cduration=?,Cfee=? where empid=?");
		  pst.setString(1, c.getCid());   pst.setString(2, c.getCname());
		  pst.setInt(3, c.getDuration());   pst.setInt(4,  c.getFee());
		  count = pst.executeUpdate();
	  }
	catch(Exception ex)
	  {
		ex.printStackTrace();
	  }
	  finally
	  {
		  try
		  {
			  if(pst!=null) pst.close();
			  if(con!=null) con.close();
		  }
		  catch(Exception ex)
		  {
			  ex.printStackTrace();
		  }
	  }
	  return count ==1 ;
}
public boolean removeCourses(int  Cid)
{
	  int count=0;
	  Connection con = null;
	  PreparedStatement pst = null;
	  String url="jdbc:oracle:thin:@localhost:1521:orcl";
	  try
	  {
		  Class.forName("oracle.jdbc.driver.OracleDriver");
		  con = DriverManager.getConnection(url,"scott","tiger");
		  pst=con.prepareStatement("delete from courses where cid=?");
		 pst.setInt(1,Cid);
		  count = pst.executeUpdate();
	  }
	catch(Exception ex)
	  {
		ex.printStackTrace();
	  }
	  finally
	  {
		  try
		  {
			  if(pst!=null) pst.close();
			  if(con!=null) con.close();
		  }
		  catch(Exception ex)
		  {
			  ex.printStackTrace();
		  }
	  }
return count ==1;
}
public Courses getCourses(int Cid)
{
	  Courses c=null;
	  Connection con = null;
	  PreparedStatement pst = null;
	  ResultSet rs = null;
	  String url="jdbc:oracle:thin:@localhost:1521:orcl";
	  try
	  {
		  Class.forName("oracle.jdbc.driver.OracleDriver");
		  con = DriverManager.getConnection(url,"scott","tiger");
		  pst=con.prepareStatement("select * from courses where id=?");
		  pst.setInt(1, Cid);
		  rs = pst.executeQuery();
		  Courses Cou;
		if(rs.next())
			  Cou = new Courses(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getInt(4));
	  }
	catch(Exception ex)
	  {
		ex.printStackTrace();
	  }
	  finally
	  {
		  try
		  {
			  if(rs!=null) rs.close();
			  if(pst!=null) pst.close();
			  if(con!=null) con.close();
		  }
		  catch(Exception ex)
		  {
			  ex.printStackTrace();
		  }
	  }
	  return cou;
}
public ArrayList<Courses> getCourses()
{
	  ArrayList<Courses> elist=new ArrayList<Courses>();
	  Connection con = null;
	  PreparedStatement pst = null;
	  ResultSet rs = null;
	  String url="jdbc:oracle:thin:@localhost:1521:orcl";
	  try
	  {
		  Class.forName("oracle.jdbc.driver.OracleDriver");
		  con = DriverManager.getConnection(url,"scott","tiger");
		  pst=con.prepareStatement("select * from courses ");
		  rs = pst.executeQuery();
		  while(rs.next())
			clist.add(new Courses(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getInt(4)));
	  }
	catch(Exception ex)
	  {
		ex.printStackTrace();
	  }
	  finally
	  {
		  try
		  {
			  if(rs!=null) rs.close();
			  if(pst!=null) pst.close();
			  if(con!=null) con.close();
		  }
		  catch(Exception ex)
		  {
			  ex.printStackTrace();
		  }
	  }
	  return clist;
}
}