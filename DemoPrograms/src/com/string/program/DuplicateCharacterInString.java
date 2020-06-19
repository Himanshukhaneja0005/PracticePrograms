package com.string.program;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateCharacterInString {
	
	//Duplicate Character using hashMap
	public static void duplicatecharusinghashmap(String s)
	{
		Map<Character,Integer> hashMap=new HashMap<Character,Integer>();
		
		char[] chararr=s.toCharArray();
		
		for(Character ch:chararr)
		{
			if(ch== ' ')
				continue;
			if(hashMap.containsKey(ch))
			{
				hashMap.put(ch, hashMap.get(ch)+1);
			}
			else
			{
				hashMap.put(ch, 1);
			}
		}
		Set<Character> st=hashMap.keySet();
		for(Character ch:st)
		{
			if(hashMap.get(ch)>1)
			{
				System.out.println(ch+" is "+hashMap.get(ch)+" times");
			}
			
		}
		
		
	}
	
	public static void duplicatecharwithountusinghashmap(String s)
	{
		int count = 0;
		
		char arr[]=s.toCharArray();
		
		for(int i=0; i<s.length();i++)
		{
			for(int j=i+1; j<s.length(); j++)
			{
				if(arr[i]==arr[j])
				{	
				System.out.print(arr[j]);
				count++;
				break;
			    }
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DuplicateCharacterInString.duplicatecharusinghashmap("HIMANSHU KHANEJA");
		//DuplicateCharacterInString.duplicatecharwithountusinghashmap("HIMANSHU KHANEJA");
		

	}

}
