//to demonstrate ArrayList Class methods
package com.tnsif.collectiondemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		List list1=new ArrayList();  //empty list is created //raw data //heterogenous data
		System.out.println(list1.size());
		System.out.println("Is List empty "+list1.isEmpty());
		list1.add(10);
		list1.add(78);
		list1.add("Mauli");
		list1.add(true);
		list1.add(28);
		list1.add('N');
		list1.add(78.88f);
		list1.add(78);
		list1.add(28);
		System.out.println(list1.add(null));
		list1.add(null);
		System.out.println(list1.size());
		System.out.println("Is List empty "+list1.isEmpty());
		System.out.println(list1);
		System.out.println("____________________");
		System.out.println(list1.contains(78));
		System.out.println(list1.indexOf(78));
		System.out.println(list1.lastIndexOf(78));
		
		System.out.println("Removed element is: "+list1.remove(3));
		
		System.out.println(list1.remove(null));
		
		System.out.println(list1);
		
		//Collections.sort(list1);//throws ClassCastException //Run time Exception
		
		list1.clear();
		System.out.println(list1);
		
		List<Integer> obj=new ArrayList<>(); //HOmogeneous data
		obj.add(10);
		obj.add(67);
		//obj.add("Nayna");
		System.out.println(obj);
		
		List<String> names=new ArrayList<>();
		names.add("Pranjali");
		names.add("Sanjivani");
		names.add("Neha");
		names.add("Sarika");
		System.out.println(names);
		
		Collections.sort(names);
		System.out.println(names);

	}

}
