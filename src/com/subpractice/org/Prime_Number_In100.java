package com.subpractice.org;

public class Prime_Number_In100 {
	
	
	
	 public static void main(String[] args) {
		int count=0;
		 for (int n = 2; n <=100; n++) {
			boolean flag = true;
		    for (int i =2; i < n; i++) {
		    if(n%i==0) {
				flag=false;
				}
				}
				if(flag==true) {
				System.out.println(n+ " is a Prime Number");
			    count++;
				}
				else {
				System.out.println(n+ " is a Non-Prime Number");
				}
				}
		        System.out.println("Total no of Prime Number : " +count);
           }
	   }
