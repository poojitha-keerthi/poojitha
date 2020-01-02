import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.del.entity.Student;

public class StudentDAO 
{
    public boolean insertStudent(Student st)
    { int count=0;
	  Connection con = null;
	  PreparedStatement pst = null;
	  String url="jdbc:oracle:thin:@localhost:1521:orcl";
	  try
	  {
		  Class.forName("oracle.jdbc.driver.OracleDriver");
		  con = DriverManager.getConnection(url,"scott","tiger");
		  pst=con.prepareStatement("insert into Student values(?,?,?,?)");
		  pst.setInt(1, st.getRno());   pst.setString(2, st.getName());
		  pst.setInt(3, st.getAge());   pst.setDate(4,  st.getDob());
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
public boolean modifyStudent(Student st)
{
	  int count=0;
	  Connection con = null;
	  PreparedStatement pst = null;
	  String url="jdbc:oracle:thin:@localhost:1521:orcl";
	  try
	  {
		  Class.forName("oracle.jdbc.driver.OracleDriver");
		  con = DriverManager.getConnection(url,"scott","tiger");
		  pst=con.prepareStatement("update Student set name=?,age=?,dob=? where rno=?");
		  pst.setString(1, st.getName());  pst.setInt(2, st.getAge());
		  pst.setDate(3, st.getDob()); 
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
public boolean removeStudent(int  rno)
{
	  int count=0;
	  Connection con = null;
	  PreparedStatement pst = null;
	  String url="jdbc:oracle:thin:@localhost:1521:orcl";
	  try
	  {
		  Class.forName("oracle.jdbc.driver.OracleDriver");
		  con = DriverManager.getConnection(url,"scott","tiger");
		  pst=con.prepareStatement("delete from Student where rno=?");
		 pst.setInt(1,rno);
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
public Student getStudent(int rno)
{
	  Student st=null;
	  Connection con = null;
	  PreparedStatement pst = null;
	  ResultSet rs = null;
	  String url="jdbc:oracle:thin:@localhost:1521:orcl";
	  try
	  {
		  Class.forName("oracle.jdbc.driver.OracleDriver");
		  con = DriverManager.getConnection(url,"scott","tiger");
		  pst=con.prepareStatement("select * from Student where rno=?");
		  pst.setInt(1, rno);
		  rs = pst.executeQuery();
		  if(rs.next())
			  st = new Student(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getDate(4));
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
	  return st;
}
	  
public ArrayList<Student> getStudent()
{
ArrayList<Student> elist=new ArrayList<Student>();
Connection con = null;
PreparedStatement pst = null;
ResultSet rs = null;
String url="jdbc:oracle:thin:@localhost:1521:orcl";
try
{
	  Class.forName("oracle.jdbc.driver.OracleDriver");
	  con = DriverManager.getConnection(url,"scott","tiger");
	  pst=con.prepareStatement("select * from Student ");
	  rs = pst.executeQuery();
	  while(rs.next())
		elist.add(new Student(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getDate(4)));
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
return elist;
}
}
	  




 
