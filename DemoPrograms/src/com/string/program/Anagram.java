package com.string.program;

import java.util.Arrays;

public class Anagram { 

	public static void ana(String s1,String s2)
	{
	    char[] s= s1.toCharArray();
	    char[] S=s2.toCharArray();
	    Arrays.sort(s);
	    Arrays.sort(S);
		
	    
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ana("save","vase");
	}

}
