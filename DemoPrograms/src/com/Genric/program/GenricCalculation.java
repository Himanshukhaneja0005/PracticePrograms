package com.Genric.program;

 class GenDemo<T>
{
	T a;

	public GenDemo(T a) {
		super();
		this.a = a;
		
	}
	
	public void print()
	{
		System.out.println(" The class we are loading "+a.getClass().getName());
	}
	
	public T add()
	{
		return a;
		
		
	}
}

public class GenricCalculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GenDemo<String> gn = new GenDemo<String>("Himanshu");
		gn.print();
		System.out.println(gn.add());
		
		GenDemo<Double> gndoubl = new GenDemo<Double>(10.5);
		gndoubl.print();
		System.out.println(gndoubl.add());
	}

}
