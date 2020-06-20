package com.hashmap.program;

import java.util.HashMap;
import java.util.Map;

public class HashMapSize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	 Map<String,Integer> hashmap= new HashMap<String,Integer>();
	 hashmap.put("Hiamsnhu",12);
	 hashmap.put("Khaneja", 15);
	 int size=hashmap.size();
	 int hash=hashmap.hashCode();
	 System.out.println(size);

	}

}
