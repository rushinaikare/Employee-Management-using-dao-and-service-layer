package com.em.main;

import java.util.Scanner;

import com.em.bean.Address;
import com.em.bean.Employee;
import com.em.exception.EmployeeException;
import com.em.service.EmployeeService;
import com.em.service.EmployeeServiceImpt;

public class EmployeeManagementApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		EmployeeService employeeService = new EmployeeServiceImpt();
		// TODO Auto-generated method stub
		try {

			while (true) {
				System.out.println("***************************** Employee Management App *****************************");
				System.out.println("1. Create Employee");
				System.out.println("2. Get Employee");
				System.out.println("3. Update Employee");
				System.out.println("4. Delete Employee");
				System.out.println("5. Exit");
				System.out.println("Enter your choice : ");
				int choice = scanner.nextInt();
				switch (choice) {

				  case 1:
						System.out.println("enter first name");
						String FirstName = scanner.next();
						System.out.println("enter last name");
						String LastName = scanner.next();
						System.out.println(" enter age");
						int Age = scanner.nextInt();
						System.out.println("Enter Street");
						String streetName = scanner.next();
						System.out.println("Enter City");
						String cityName = scanner.next();
						System.out.println("Enter State");
						String stateName = scanner.next();
						System.out.println("Enter postalcode");
						String postalCode = scanner.next();
						Employee employee = new Employee(FirstName, LastName, Age);
						Address address = new Address(streetName, cityName, stateName, postalCode);
						System.out.println("Employee created with Employee ID= "+employeeService.createEmployee(employee, address));
					break;

				case 2:
						System.out.println("Enter Employee ID to get record");
						int E_ID1 = scanner.nextInt();
						employeeService.displayEmployee(E_ID1);
	                  break;

				case 3:
						System.out.println("Enter Employee ID to update data ");
						int E_ID = scanner.nextInt();
						System.out.println("Enter FirstName");
						String newFirstName = scanner.next();
						System.out.println("Enter LastName");
						String newLastName = scanner.next();
						System.out.println("Enter Age");
						int newAge = scanner.nextInt();
	                    System.out.println("Enter Street");
						String newstreetName = scanner.next();
						System.out.println("Enter City");
						String newcityName = scanner.next();
						System.out.println("Enter State");
						String newstateName = scanner.next();
						System.out.println("Enter postalcode");
						String newpostalCode = scanner.next();
						Employee employee2 = new Employee(newFirstName, newLastName, newAge);
						Address address2 = new Address(newstreetName, newcityName, newstateName, newpostalCode);
						employeeService.updateEmployee(E_ID, employee2, address2);
					break;
				case 4:
						System.out.println("Enter Employee ID to delete record");
						int E_ID2 = scanner.nextInt();
						employeeService.deleteEmployee(E_ID2);
					break;
				case 5:
						scanner.close();
						System.exit(0);
					break;
				default:
						System.out.println("Please Enter Valid Choice");
					break;

				}

			}

		} catch (EmployeeException e) {
			System.out.println("exception occured " + e.getMessage());
		}
	}

}
