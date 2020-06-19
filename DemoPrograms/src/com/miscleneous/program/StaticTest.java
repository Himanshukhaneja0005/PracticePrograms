package com.miscleneous.program;

import java.io.Serializable;

public class StaticTest implements Serializable{
	 static int x =5;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		x=10;
		
		System.out.println(x);

	}

}
