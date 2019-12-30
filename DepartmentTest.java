class Employee
{
private int empid;
private String ename;
private double salary;
public Employee(){}
public Employee(int empid,String ename,double salary)
{
this.empid=empid;
this.ename=ename;
this.salary=salary;
}

public void setEmpid(int empid)
{
this.empid=empid;
}
public void setEName(String ename)
{
this.ename=ename;
}
public void setSalary(double salary)
{
this.salary=salary;
}
public int getEmpid()
{
return empid;
}
public String getEname()
{
return ename;
}
public double getSalary()
{
return salary;
}
public boolean equals(Object obj)
{
Employee e=(Employee)obj;
return empid==e.empid && ename.equals(e.ename) && salary==e.salary;
}
}

class Department
{
private int Deptno;
private String Deptname;
Employee[] e;
public Department() {}
public Department(int Deptno,String Deptname,Employee[] e)
{
this.Deptno=Deptno;
this.Deptname=Deptname;
this.e=e;
}
public void setDeptno(int deptno)
{
this.Deptno=Deptno;
}
public void setDeptname(String dname)
{
this.Deptname=Deptname;
}
public void setEmployee(Employee[] e)
{
this.e=e;
}
public String getDeptname()
{
return Deptname;
}
public Employee[] getEmployee()
{
return e;
}
}
class Test
{
public static void main(String[] args)
{
Employee e1=new Employee(101,"Ajay",1000);
Employee e2=new Employee(101,"Ajay",1000);
System.out.println(e1.equals(e2));
}
}
