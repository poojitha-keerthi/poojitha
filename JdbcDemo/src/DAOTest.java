import java.sql.Date;
import com.del.dao.EmployeeDAO;
import com.del.entity.Employee;
public class DAOTest 
{
public static void main(String[] args) 
	{
	EmployeeDAO edao = new EmployeeDAO();
	/*Employee e = new Employee(105,"Babu",2000,new Date(1998,12,03));
	if(edao.modifyEmployee(e))
		System.out.println("Employee Record Modified");
	else
		System.out.println("Modification Failed"); */
    if(edao.removeEmployee(101))
		  System.out.println("Employ Deleted Successfully");
	else 
		System.out.println("Employ with id 101 does not exist");
	}
}
