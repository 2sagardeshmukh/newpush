package com;

import java.sql.ResultSet;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeDAO implements CRUDOperations {
private JdbcTemplate jdbcTemplate;

public EmployeeDAO(JdbcTemplate jdbcTemplate) {
super();
this.jdbcTemplate = jdbcTemplate;
}



public JdbcTemplate getJdbcTemplate() {
return jdbcTemplate;
}



public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
this.jdbcTemplate = jdbcTemplate;
}



@Override
public void insert(Employee employee) {
	// TODO Auto-generated method stub
	if(null!=employee)
	{
	jdbcTemplate.update("insert into employee values(?,?,?)",
	new Object[] {employee.getEmployeeId(),employee.getEmployeeName(),employee.getSalary()});
	}
}



@Override
public List<Employee> selectAll() {
	// TODO Auto-generated method stub
	return jdbcTemplate.query("select * from employee", new RowMapper<Employee>() {
		// ResultSet rs = st.executeQuery("Select * from employee");


		@Override
		public Employee mapRow(ResultSet resultSet, int arg1) throws SQLException {
		Employee book = new Employee();
		book.setEmployeeId(resultSet.getInt(1));
		book.setEmployeeName(resultSet.getString(2));
		book.setSalary(resultSet.getInt(3));
		return book;
}



@Override
public Employee selectAEmployee(int id) {
	// TODO Auto-generated method stub
	return null;
}






}