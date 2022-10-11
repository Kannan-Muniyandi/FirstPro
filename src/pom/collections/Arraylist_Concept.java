package pom.collections;


import java.util.ArrayList;
import java.util.List;

public class Arraylist_Concept {

	public static void main(String[] args) {
	List<Object> al= new ArrayList<>();
		al.add(10);
		al.add("Kannan");
		al.add(true);
		al.add('C');
		
		System.out.println(al);
		System.out.println(al.contains("Kannan"));
	}
	
	
	
}
