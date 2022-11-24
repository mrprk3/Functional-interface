package com.fuctional.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Employee {
	private int id;
	private String name;
	private int salary;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Employee(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	public static void main(String[] args) {
		List<Employee> emp = new ArrayList<Employee>();
		emp.add(new Employee(1, "Chandan", 465422));
		emp.add(new Employee(3, "Deepak", 564345));
		emp.add(new Employee(2, "Ankur", 765465));
		emp.add(new Employee(4, "Anil", 276545));
		emp.add(new Employee(5, "Atim", 987687));
		emp.add(new Employee(7, "Delip", 657968));
		emp.add(new Employee(6, "Mohan", 564235));
		emp.add(new Employee(8, "Sashi", 678675));

		TaxEmp taxEmp = new TaxEmp();
		int ctcPerYear = 750000;
		List<Employee> empList = taxEmp.getTaxableEmployees(emp, ctcPerYear);
		System.out.println(empList);
	}

}

class TaxEmp {
	public List<Employee> getTaxableEmployees(List<Employee> emp, int ctcPerYear) {
		List<Employee> taxEmpList = emp.stream().filter((i) -> i.getSalary() > ctcPerYear).collect(Collectors.toList());
		return taxEmpList;

	}

}
