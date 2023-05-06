package com.corejavaprojects.collections.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class EmployeeMapMain {

	public static void main(String[] args) {

		Address address1 = new Address();

		address1.setAddress1("3rd Cross");
		address1.setAddress2("Neeladri Nagar");
		address1.setCity("Bangalore");
		address1.setState("Karnataka");

		Address address2 = new Address();

		address2.setAddress1("5th Cross");
		address2.setAddress2("Seesadri Nagar");
		address2.setCity("Pune");
		address2.setState("Maharashtra");

		Address address3 = new Address();

		address3.setAddress1("9th Cross");
		address3.setAddress2("Jai Nagar");
		address3.setCity("Ranchi");
		address3.setState("Jharkhand");

		Employee employee1 = new Employee();

		employee1.setEmpId(101);
		employee1.setName("Sunny");
		employee1.setOrganization("TCS");

		Employee employee2 = new Employee();

		employee2.setEmpId(102);
		employee2.setName("Ritesh");
		employee2.setOrganization("CG");

		Employee employee3 = new Employee();

		employee3.setEmpId(103);
		employee3.setName("Nandini");
		employee3.setOrganization("IBM");

		Employee employee4 = new Employee();

		employee4.setEmpId(104);
		employee4.setName("Sarvan");
		employee4.setOrganization("Mindtree");

		Map<Employee, Address> mapEmployee = new LinkedHashMap<>();
		mapEmployee.put(employee1, address1);
		mapEmployee.put(employee2, address2);
		mapEmployee.put(employee3, address2);
		mapEmployee.put(employee4, address2);

		System.out.println("-------------- Displaying Details ---------");
		mapEmployee.forEach((key, value) -> System.out.println(key + " : " + value));

	}

}
