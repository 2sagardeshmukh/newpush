package com.torryharris.OCT_13_MySpringJDBCDemo2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Employee;
import com.EmployeeDAO;



public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext ctx = new ClassPathXmlApplicationContext("file:src/main/java/beans.xml");
    	EmployeeDAO dao = (EmployeeDAO)ctx.getBean("employeeDAO");
    Employee employee = new Employee();
    employee.setEmployeeId(07);
    employee.setEmployeeName("Prash");
    employee.setSalary(30000);
    	dao.insert(employee);
    	System.out.println("Employee information inserted");
    }
}
