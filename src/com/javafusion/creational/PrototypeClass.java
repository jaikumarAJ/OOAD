package com.javafusion.creational;

public class PrototypeClass implements Cloneable {

	private int id;
	private String name, designation;
	private double salary;
	private String address;

	public PrototypeClass() {
	}

	public PrototypeClass(int id, String name, String designation, double salary, String address) {
		this();
		this.id = id;
		this.name = name;
		this.designation = designation;
		this.salary = salary;
		this.address = address;
	}

	/*
	 * This is important because it will be used to access new object rather then creating
	 * new object using new operator because it is a costly affair.
	 */
	@Override
	public Object clone() throws CloneNotSupportedException {
		return new PrototypeClass(id, name, designation, salary, address);
	}

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

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	
	
}
