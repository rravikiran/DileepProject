package com.java;

public class ReturnTypes {
	
	
	
	
	public void nonreturntype() {
		System.out.println("Ravi");
	}
	
	
	public String returntype() {
		return "Ravi";
	}
	
	public Integer returntypeval() {
		return 20;
		
	}
	
	
	public void add(int a, int b)
	{
		int c;
		
		c = a+b;
		System.out.println("The value of c  is"+ c);
	}
	
	
	public static void main(String[] dileep) {
		String name; int a;
		ReturnTypes r = new ReturnTypes();
		
		System.out.println(name= r.returntype());
		
		System.out.println(a = r.returntypeval());
		
		r.add(100, 300);
		
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
