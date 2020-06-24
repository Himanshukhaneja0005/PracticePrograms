package com.Genric.program;

import java.util.ArrayList;

public class GenricExtendNumberAndStringClass<T> {
	
	
	
	@SuppressWarnings("hiding")
	public <T extends Number> int addInteger(ArrayList<?> l)
	{
	    return (int) l.get(0);
	}
	public <T extends String> String addString(ArrayList<?> s)
	{
		return (String) s.get(0);
	}

	public static void main(String args[])
	{
		
		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(10);
		l.add(10);
		ArrayList<String> s= new ArrayList<>();
		s.add("Himanshu");
		s.add("Khaneja");
		GenricExtendNumberAndStringClass<?> genc = new GenricExtendNumberAndStringClass<>();
		int i =genc.addInteger(l);
		String size=genc.addString(s);
		
		System.out.println(" Size of list is With Integer "+i);
		System.out.println("Size of integer is with String "+size);
	}

}
