package com.string.program;

public class ReverseString {
	
	public static void reverse(String s)
	{
		char[] strarr=s.toCharArray();
		
		for(int i=strarr.length-1;i>=0;i--)
		{
			System.out.print(strarr[i]);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ReverseString.reverse("Himanshu");

	}

}
