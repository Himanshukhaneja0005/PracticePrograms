package com.string.program;

public class Pattern {
	
	public static void himanshu(String S)
	{
		char arr[]=S.toCharArray();
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]>64 && arr[i]<91 || arr[i]>96 && arr[i]<123 )
			{
				System.out.println(arr[i]);
				
			}
			else if(arr[i]>=0)
			{
				System.out.println(arr[i]);
			}
			else
			{
				System.out.println(arr[i]);
			}
		}
	}

}
