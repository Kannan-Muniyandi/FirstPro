package com.subpractice.org;
import java.util.ArrayList;
import java.util.List;

public class Collection_concepts {
	
	public static void main(String[] args) {
		
		List<Object> li = new ArrayList<Object>();
		
		li.add(40);
		li.add("Fourty");
		li.add(10);
		li.add(70);
		
		System.out.println(li);
		
		int size = li.size();
		System.out.println(size);
		
		Object obj = li.get(3);
	    //li.get(3);
		System.out.println(obj);
		
		li.set(3,20);
		System.out.println(li);
		
		Object move = li.remove(2);
		System.out.println(move);
		
		int indexof = li.indexOf("Fourty");
		System.out.println(indexof);
		
		boolean contains = li.contains(40);
		System.out.println(contains);
		
		
		
	}

}
