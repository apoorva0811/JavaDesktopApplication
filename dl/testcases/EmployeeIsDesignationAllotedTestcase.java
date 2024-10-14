import com.thinking.machines.hr.dl.exceptions.*;
import com.thinking.machines.hr.dl.interfaces.dto.*;
import com.thinking.machines.hr.dl.interfaces.dao.*;
import com.thinking.machines.hr.dl.dto.*;
import com.thinking.machines.hr.dl.dao.*;
import java.util.*;
import java.text.*;
import java.math.*;
public class EmployeeIsDesignationAllotedTestcase
{
public static void main(String gg[])
{
int designationCode=Integer.parseInt(gg[0]);
try
{
EmployeeDAOInterface employeeDAO;
employeeDAO=new EmployeeDAO();
System.out.println("Employee with designation code : "+designationCode+" exists : "+employeeDAO.isDesignationAlloted(designationCode));

}catch(DAOException daoException)
{
System.out.println(daoException.getMessage());
}
}
}