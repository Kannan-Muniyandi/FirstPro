package com.arrayconcepts;

import java.util.Scanner;

public class Array_Concepts {
   public static void main(String[] args) {
	   int date [] = new int[5];
	   

	for (int i = 0; i < args.length; i++) {
		System.out.println("Enter a Value");	
	
	@SuppressWarnings("resource")
	Scanner scanner  = new Scanner(System.in);
	int a = scanner.nextInt();
	date[i] = a;

	
	

	System.out.println("date[0] is: "+a);
	
	}
	
   }
	
	
}
