import java.sql.Date;
public class StudentTest 
{
public static void main(String[] args) 
	{
		
		Student p = new Student(02,"Suresh",21,new Date(1998,12,03));
		StudentDAO sdao = new StudentDAO();
		if(sdao.insertStudent(p))
			System.out.println("Student Record Inserted");
		else
			System.out.println("Student Record Not Inserted"); 
}
}