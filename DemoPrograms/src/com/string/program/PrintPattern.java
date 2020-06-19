package com.string.program;

public class PrintPattern {
	
	public static void pattern(String s)
	{
		char[] arr=s.toCharArray();
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>66 && arr[i]<91 || arr[i]>96 && arr[i]<123)
			{
				System.out.print(arr[i]);
			}
			
			else if(arr[i]>0)
			{
				System.out.print(arr[i]);
			}
			
			else
			{
				System.out.print(arr[i]);
			}
		}
	}
	
	public static void main(String args[])
	{
		pattern("Clie@nt123");
	}

}
