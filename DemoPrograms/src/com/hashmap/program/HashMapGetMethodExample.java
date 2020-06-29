package com.hashmap.program;

import java.util.HashMap;

class Employee{
	
	String name;
	int rollno;
	public Employee(String name, int rollno) {
		super();
		this.name = name;
		this.rollno = rollno;
	}
	public Employee(int i, String string) {
		// TODO Auto-generated constructor stub
	}
	
	
	
}

public class HashMapGetMethodExample { 
	
	public static void main(String args[])
	{
		Employee e1= new Employee("vinit",1);
		Employee e2= new Employee(1,"vinit");
		
		HashMap<Employee,Integer> hashmap = new HashMap<>();
		hashmap.put(e1, 11);
		
		
		// get method of hashmap always return the value of that particular key while putting into hashmap
		//int i=hashmap.get(e1);
		//System.out.println(i);
		
		
		// if i am not putting anything on to the Put method it means that and call the get method on that e2 objcet that gives null pointer exception
		
		int j =hashmap.get(e2);
		System.out.println(j);
	}

}
