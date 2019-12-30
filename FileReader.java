import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;
class Test2
{
  public static void main(String[] args)
  {
    try(FileReader fos= new FileReader("abc.dat"))
	{
	int ch;
	while((ch=fis.read())!=-1)
	 System.out.print((char)(ch)+" ");
	 }
	 catch(IOException ex)
	 {
	 System.out.println(ex);
	 }
	 }
	 }
	 