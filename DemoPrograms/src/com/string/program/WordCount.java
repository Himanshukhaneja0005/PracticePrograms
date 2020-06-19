package com.string.program;

public class WordCount {

	public static int OUT=0;
	public static int IN=1;
	
	public static int Wordcount(String s)
	{
		int state=OUT;
		int wc=0;
		int i=0;
		
		while(i<s.length())
		{
			if(s.charAt(i) ==' ' || s.charAt(i) == '\n' || s.charAt(i) == '\t')
			{
				state=OUT;
			}
			else if(state == OUT)
			{
				state=IN;
				++wc;
			}
			++i;
		}
		return wc;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="Hello Hello";
		System.out.println(" Word count Is "+Wordcount(s));

	}

}
