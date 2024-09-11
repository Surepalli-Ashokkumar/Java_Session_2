package com.cisco.collection;

import java.util.LinkedHashSet;

public class LinkedHasSet 
{

         public static void main(String[] args) 
  {
		
		LinkedHashSet<String> linkedHashSet= new LinkedHashSet<String>();
		linkedHashSet.add("A");
		linkedHashSet.add("B");
		linkedHashSet.add("C");
		linkedHashSet.add("D");
		
		//DO NOT ALLOWS DUPLICATE VALUES
		linkedHashSet.add("A");
		
		linkedHashSet.add("E");
		
		System.out.println("Size: "+linkedHashSet.size());
		
		
		/// methods: contains, remove
		
		//iterate using for loop
		
		System.out.println(linkedHashSet);
		
	}

}
