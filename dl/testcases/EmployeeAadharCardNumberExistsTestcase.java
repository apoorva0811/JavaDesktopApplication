import com.thinking.machines.hr.dl.exceptions.*;
import com.thinking.machines.hr.dl.interfaces.dto.*;
import com.thinking.machines.hr.dl.interfaces.dao.*;
import com.thinking.machines.hr.dl.dto.*;
import com.thinking.machines.hr.dl.dao.*;
import java.util.*;
import java.text.*;
import java.math.*;
public class EmployeeAadharCardNumberExistsTestcase
{
public static void main(String gg[])
{
String aadharCardNumber=gg[0];
try
{
EmployeeDAOInterface employeeDAO;
employeeDAO=new EmployeeDAO();
System.out.println("Aadhar card number : "+aadharCardNumber+" exists : "+employeeDAO.aadharCardNumberExists(aadharCardNumber));
}catch(DAOException daoException)
{
System.out.println(daoException.getMessage());
}
}
}