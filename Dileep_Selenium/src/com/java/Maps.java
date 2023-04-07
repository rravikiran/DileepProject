package com.java;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.openqa.selenium.WebElement;

public class Maps {
	public static void main(String[] args) {
		
		Map<Integer,String> map=new HashMap<Integer,String>();  
	    //Adding elements to map  
	    map.put(1,"ravi");  
	    map.put(1,"dileep"); 
	    map.put(5,"Rahul");  
	    map.put(2,"Jai");  
	    map.put(6,"Amit");  
	    //Traversing Map 
	    for(Map.Entry m:map.entrySet()){  
	    	   System.out.println(m.getKey()+" "+m.getValue()); 
	    }  
	}

}
