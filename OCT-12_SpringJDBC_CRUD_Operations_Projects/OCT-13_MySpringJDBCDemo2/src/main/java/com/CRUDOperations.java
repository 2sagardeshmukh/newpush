package com;

import java.util.List;

public interface CRUDOperations {
	
	void insert(Employee employee);
	List<Employee> selectAll();
	Employee selectAEmployee(int id);
	
	

}
