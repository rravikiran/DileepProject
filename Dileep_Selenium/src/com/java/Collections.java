package com.java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Collections {
	
	public static void main(String[] args) {
		
		List<String> val = new ArrayList<String>();
		
		List<String> vall = new ArrayList<String>();
		
		val.add("ravi");
		val.add("Neha");
		val.add(0, "Dileep");
		vall.add("divya");
		vall.addAll(val);
		vall.remove(1);
		val.add(null);
		
		
		for(String v : val) {
			System.out.println("List of first collection" +v);
		}
		
		for(String vv : vall) {
			System.out.println("List of second collection" +vv);
		}
		
		ArrayList<String> list=new ArrayList<String>();//Creating arraylist  
		list.add("Ravi");//Adding object in arraylist  
		list.add("Vijay");  
		list.add("Ravi");  
		list.add("Ajay");  
		//Traversing list through Iterator  
		Iterator itr=list.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  
		
	}

}
