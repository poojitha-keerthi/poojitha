package com.Deloitte.java.entity.Employee;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
public class Test2 
{
public static void main(String[] args)  throws Exception
	{
		Student st = null;
		try(FileInputStream fis = new FileInputStream("D:/stu.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);)
		{
			st = (Student)ois.readObject();
			System.out.println(st.getSsn()+" "+st.getName()+" "+st.getAge()+" "+st.getRno()+" ")
					
		}
	

	}

}
