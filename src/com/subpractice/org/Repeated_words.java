package com.subpractice.org;

import java.util.HashMap;
import java.util.Map;

public class Repeated_words {
	
	public static void main(String[] args) {
		
		String p = "Good blood bad blood";
	    String[] sp = p.split(" ");
		System.out.println(sp);
		
		Map<String,Integer> m = new HashMap<String, Integer>();
		System.out.println(m);
		
		for (String str : sp) 
			//System.out.println(str);
		
			if(m.containsKey(str)) {
				Integer i = m.get(str);
				m.put(str, i+1);
				
		}else {
		
			m.put(str ,1);
		}
		System.out.println(m);
	   }

}
