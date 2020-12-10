package com.em.service;

import com.em.bean.Employee;
import com.em.bean.Address;
import com.em.dao.EmployeeDao;
import com.em.dao.EmployeeDaoMysql;
import com.em.exception.EmployeeException;

public class EmployeeServiceImpt implements EmployeeService {

	private EmployeeDao employeeDao = new EmployeeDaoMysql();

	public int createEmployee(Employee employee, Address address) throws EmployeeException {

		return employeeDao.createEmployee(employee, address);

	}

	public int updateEmployee(int E_ID, Employee employee, Address address) throws EmployeeException {

		return employeeDao.updateEmployee(E_ID, employee, address);
	}

	public void displayEmployee(int E_ID ) throws EmployeeException {
		employeeDao.displayEmployee(E_ID);
	}

	public int deleteEmployee(int E_ID) throws EmployeeException {
		return employeeDao.deleteEmployee(E_ID);
	}

}
