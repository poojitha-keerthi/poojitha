package com.del.entity.courses;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class peoplecrudservlet 
{
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String submit = request.getParameter("sub");
		CoursesDAO cdao = new CoursesDAO();
		Courses c=new Courses();
		String message="Successfully";
		c.setcid(Integer.parseInt(request.getParameter("cid")));
     RequestDispatcher rd = request.getRequestDispatcher("peopleCRUD.jsp");
		if(submit.equals("Add_Courses") || submit.equals("Modify_Courses"))
		{
			c.setcname(request.getParameter("ename"));
			c.setDuration(Double.parseDouble(request.getParameter("duration")));
			c.setFees(Date.valueOf(request.getParameter("fees")));
			if(submit.equals("Add_Courses")) 
			{
				cdao.insertCourse(c);
				message=message+" Inserted Record";
			}
			else
			{
				cdao.modifyCourse(c);
				message=message+"Modified Record";
			}
		}
		else if(submit.equals("Delete_Course")) 
		{
			if(cdao.removeCourse(c.getcid()))
				message=message+"Record Deleted";
			else
				message="Deletion Failed";
		}
		else if(submit.equals("Show_Course"))
		{
		  c=cdao.getCourse(c.getcid());
				  request.setAttribute("cou",c);
		}
		out.print("<h1><center>"+message+"</center></h1>");
		  rd.include(request,response);
}
}