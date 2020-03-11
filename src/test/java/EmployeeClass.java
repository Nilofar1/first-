package com.cursors;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class EmployeeClass {

	public static void main(String[] args) {

		List<String> list1 = new ArrayList<>();
		list1.add("A");
		list1.add("S");
		list1.add("H");
		list1.add("O");

		/*System.out.println(list1);
		
		
		System.out.println("Using For Itertor:");
		Iterator<String> it = list1.iterator();
		while(it.hasNext())
		{
			String s1 = it.next();
			System.out.println(s1);		
			
		}*/
		
		ListIterator<String> liIt = list1.listIterator();
		while(liIt.hasNext())
		{
			System.out.println(liIt.next());
		}
		
		
		Vector<Integer> v = new Vector<>();
		v.add(10);
		v.add(20);
		v.add(60);
		v.add(5);
		
		Enumeration<Integer> enum1 = v.elements();
		while(enum1.hasMoreElements())
		{
			System.out.println(enum1.nextElement());
		}
		
		
		/*

		System.out.println("Using For Loop \n :");
		for (int i = 0; i < list1.size(); i++) {

			System.out.println(list1.get(i));
		}
		
		System.out.println("Using For ForEach \n :");
		for(String s:list1)
		{
			System.out.println(s);
			
		}


		
		*/
		
		
	}
}
