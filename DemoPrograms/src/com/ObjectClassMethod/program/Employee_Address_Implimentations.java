package com.ObjectClassMethod.program;

import java.util.HashMap;
import java.util.Map;

 class Employee {

}
 
class Address{
	
}

public class Employee_Address_Implimentations {
    static Employee emp;
	static Employee emp1;
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		emp = new Employee();
		emp1 = new Employee();
		Address Adr = new Address();
		Map<Object,Integer> hashmap=new HashMap<>();
		hashmap.put(emp,1);
		hashmap.put(emp1,1);
		hashmap.put(Adr, 2);
		int emphash=emp.hashCode();
		int emp1hash=emp1.hashCode();
		int adrhash=Adr.hashCode();
		
		System.out.println("Employee hashCode "+emphash);
		System.out.println("Employee_1 hashCode "+emp1hash);
		System.out.println("Address hashcode "+adrhash);
		
		// overide the equals methods
		
		if(emp.equals(emp1))
		{
			System.out.println("Two objects are euqusl");
		}
		

	}

}
