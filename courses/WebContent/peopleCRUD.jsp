<%@page import="com.del.entity.courses,com.del.entity.dao.peopleDAO" %>
<% 
   Courses c = (Courses)request.getAttribute("c");
   if(c==null) c = new Courses();
%>
<!DOCTYPE html>
<html>
<body>
    <form action="CoursesCrudServlet">
    <table align=center width=50% bgcolor=lightblue>
    <tr>
    <th>Courses Id</th>
    <td><input type=text name=cid  value=<%=c.getCid()%>></td>
    </tr>
    <tr>
    <th>Course Name</th>
    <td><input type=text name=cname value=<%=c.getCname()%>></td>
    </tr>
    <tr>
    <th>Course Duration</th>
      <td><input type=text name=duration  value=<%=c.getDuration()%>></td>
      </tr>
      <tr>
      <th>Course Fee</th>
      <td><input type=date name=fee value=<%=c.getFee()%>></td>
      </tr>
      <tr>
      <td><input type=submit value=Add_Courses name="sub"></td>
      <td><input type=submit value=Show_Courses name="sub"></td>
      </tr>
      <tr>
      <td><input type=submit value=Delete_Courses name="sub"></td>
      <td><input type=submit value=Modify_Courses name="sub"></td>
      </tr>
    </table>
    </form>
</body>
</html>