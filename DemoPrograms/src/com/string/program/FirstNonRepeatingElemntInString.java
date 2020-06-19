package com.string.program;

public class FirstNonRepeatingElemntInString {

	public static int No_of_char=256;
	
	static char count[]=new char[No_of_char];
	
	public static void getCharachterCount(String s) // count the occurence of char in string like Himanshu, h is repeat 2 times
	{
		for(int i=0;i<s.length();i++)
			count[s.charAt(i)]++;
		
		
	}
	
	public static int nonrepeatingelment(String s)
	{
		getCharachterCount(s);
		int index= -1,i;
		
		for(i=0;i<s.length();i++)
		{
			if(count[s.charAt(i)]==1)
			{
				index=i;
				break;
			}
		}
		return index;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String str="HimansHu";
		int Reuslt =nonrepeatingelment(str);
		
		System.out.println(Reuslt == -1?"Either all character are repeating or string is empty":"First non "
				+ "repeating character is "+str.charAt(Reuslt));
	}

}
