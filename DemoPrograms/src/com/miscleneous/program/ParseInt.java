package com.miscleneous.program;

public class ParseInt {
	
	public static void parseint(String S)
	{
		try
		{
		 //int i=Integer.parseInt(S);
		Integer i=Integer.valueOf(S);
		//long i = Long.parseLong(S);
		//double i=  Double.parseDouble(S);
		      
		
		if(i==123)
		{
			System.out.println("parse int convert sucessfully"+i);
		}
		else
			System.out.println("Not convert sucessfully");
	 }
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		parseint("123");

	}

}
