class Employee implements Comparable<Employee>
{
int empid;
String ename;
double salary;
public Employee() {}
public Employee(int empid,String ename,double salary)
{
this.empid=empid;
this.ename=ename;
this.salary=salary;
}
public void display()
{
System.out.println(empid+" " +ename+" " +salary);
}
public int hashCode()
{
  return empid;
  }
  public boolean equals(Object obj)
  {
  Employee e =(Employee)obj;
  return empid==e.empid && ename.equals(e.ename) && salary==e.salary;
  }
  public int compareTo(Employee e)
  {
  return empid- e.empid;
  }
  }