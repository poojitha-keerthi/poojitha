package com.Deloitte.java.entity.Employee;
import java.io.FileOutputStream;
public class Test1 {

	public static void main(String[] args) throws Exception
	{
		Student s = new Student(101,"pooja",29,3,50,80,90);
				try(FileOutputStream fos = new FileOutputStream("D:/stu.dat");
						ObjectOutputStream oos = new ObjectOutputStream(fos);)
				{
					oos.writeObject(s);
				}
		catch(IOException ex)
		{
			System.out.println(ex);
		}
						
	}

}
