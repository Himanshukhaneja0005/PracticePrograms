package com.array.program;

public class MissingNumber {
	
	
	public static int MissNumber(int arr[], int n)
	{
		int i,total;
		
		total=(n+1) * (n+2) / 2;
		for(i=0; i < n; i++)
			
		      total= total-arr[i];
		return total;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {1,2,3,5,6};
		int result=MissNumber(arr,5);
		System.out.println("Missing Number is "+result);

	}

}
