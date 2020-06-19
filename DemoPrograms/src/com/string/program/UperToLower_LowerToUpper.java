package com.string.program;

public class UperToLower_LowerToUpper {
	
	static int i;
	
	public static void stringconversion(String s)
	{
		for(int i=0;i<s.length();i++)
		{
			
			int ch=s.charAt(i);
			
			if(ch>64 && ch<91)
			{
				ch=ch+32;
				System.out.print((char)ch);
			}
			else if(ch>96 && ch<123)
			{
				ch=ch-32;
				System.out.print((char)ch);
			}
			if(ch==32)
			{
				System.out.print(" ");
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Original String is");
		System.out.println("HIMANSHU khaneha");
		UperToLower_LowerToUpper.stringconversion("HIMANSHU khaneja");

	}

}
