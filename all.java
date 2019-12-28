import java.util.Scanner;
class Source 
{
public static void main(String[] args)
{
String[] s={"all","the","best"};
for (int i=0;i<s.length;i++)
{
for (int j=0;j<s[i].length();j++)
System.out.print(s[i].charAt(j)+" ");
System.out.println();
}
}
}
