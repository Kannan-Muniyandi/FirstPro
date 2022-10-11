package com.variables;

public class Variables {

	static int a=1; // class variable
	static int f= 5;
	
	public void add() {
		int b= 4; //local variable
		float c= 0.4f;
         float e= a+b+c;
		System.out.println(e);

	}
	public static void main(String[] args) {
		Variables obj = new Variables();
		obj.add();
		
		System.out.println(f);
	}
	
	
	
	
	
}
