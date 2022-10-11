package com.stringconcepts;

public class StringBuffer_Concept {
	
public static void main(String[] args) {
	

	String names[] = {"Kannan","Muniyandi","Meena","Balasubramanian"};
	String sentence = "";
	StringBuffer sb = new StringBuffer();
	StringBuffer sb2 = new StringBuffer("raajaathiraja");
	sb2.replace(0, 3, "kaa");
	System.out.println(sb2);
	for (String name : names) {
	   sb.append(name);
	  
	   
	   System.out.println(sb.hashCode());
		sentence=sentence+name;
        System.out.println(sentence.hashCode());	
	}
	System.out.println(sentence);
	
	System.out.println(sb);
	
}
	
}
