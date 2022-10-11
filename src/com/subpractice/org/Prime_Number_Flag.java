package com.subpractice.org;

public class Prime_Number_Flag {

	public static void main(String[] args) {
		
		int n=27;
		boolean flag = true;
		for (int i =2; i < n; i++) {
			
			
			
			if(n%i==0) {
				
				flag=false;
				
			}
		}
		
		if(flag==true) {
			
			System.out.println(n+ " is a Prime Number");
		}else {
			System.out.println(n+ " is a Non-Prime Number");
		}
		
		
		
	}
	
	
	
	
}
