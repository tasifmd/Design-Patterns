package com.tasif.prototypepattern;

import java.util.ArrayList;
import java.util.List;

public class Employee implements Cloneable {
	private List<String> employeeList;
	public Employee(){
		employeeList = new ArrayList<String>();
	}
	public Employee(List<String> mylist) {
		this.employeeList = mylist;
	}
	public void loadData() {
		employeeList.add("Tasif");
		employeeList.add("Jaspreet");
		employeeList.add("Aman");
		employeeList.add("Lokesh");
	}
	public List<String> getEmpList() {
		return employeeList;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		List<String> mylist = new ArrayList<String>();
		for(String s : this.getEmpList()) {
			mylist.add(s);
		}
		return new Employee(mylist);
	}
	
}
