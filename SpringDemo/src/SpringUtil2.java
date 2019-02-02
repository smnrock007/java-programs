import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.Employee;

public class SpringUtil2 {
	public static void main(String arg[])
	{
	Resource resource=new ClassPathResource("SpringConfig2.xml");  
	BeanFactory factory=new XmlBeanFactory(resource);
	
	Employee employee=(Employee)factory.getBean("employee");
	
	System.out.println("Employee ID:"+employee.getEmployeeId());
	System.out.println("Employee Name:"+employee.getEmployeeName());
	System.out.println("Employee Address:"+employee.getEmployeeaddr());
	System.out.println("Employee Salary:"+employee.getEmployeesalary());
	}
}
