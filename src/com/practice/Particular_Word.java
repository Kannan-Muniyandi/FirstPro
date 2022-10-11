package com.practice;

public class Particular_Word {
public static void main(String[] args) {
	String s = "Software Test Engineer";
	String st = s +" ";
	int l=st.length();
	int p =0;
	for (int i = 0; i < l; i++) {
		
		char ch = st.charAt(i);
		if(ch==' ') {
			String s1 =st.substring(p,i);
		    System.out.println(s1);
		    p=i+1;
		}
		}
	
}
	
	
	
}
