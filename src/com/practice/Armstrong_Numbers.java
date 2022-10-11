package com.practice;

public class Armstrong_Numbers {
public static void main(String[] args) {
	
	int a = 153;
	int Sum=0;
	int temp=a;
    while(a>0) {
    	
	  int rem=a%10;
      Sum = (rem*rem*rem)+Sum;
      a=a/10;
}
    if(temp==Sum) {
    	System.out.println("Armstrong number");
    }else {
    	System.out.println("Not an Armstrong number");
    }
	}
	}
