package com.practice;

import java.util.Scanner;

public class Substring_Concept {
public static void main(String[] args) {
	
    System.out.println("Enter the string :");
	@SuppressWarnings("resource")
	Scanner d = new Scanner(System.in);
	String str = d.nextLine();
	System.out.println(str);
	
	System.out.println("Enter a value");
	@SuppressWarnings("resource")
	Scanner d1 = new Scanner(System.in);
	 int beginindex =d1.nextInt();
	 
	 System.out.println("Enter a value ");
	 @SuppressWarnings("resource")
	Scanner sca2 = new Scanner(System.in);
	 int endindex = sca2.nextInt();
	 
	 String finalstr = str.substring(beginindex,endindex);
	 System.out.println(finalstr);
} 	
	
}
