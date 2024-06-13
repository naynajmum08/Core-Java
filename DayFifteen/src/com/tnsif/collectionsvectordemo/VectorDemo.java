package com.tnsif.collectionsvectordemo;

import java.util.Iterator;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		Vector<String> animals=new Vector<>();
		
		animals.add("Tiger");
		animals.add("Lion");
		animals.add("Horse");
		
		System.out.println(animals);
		 
		System.out.println(animals.get(2));
		
		Iterator<String> animalIt=animals.iterator();
		while(animalIt.hasNext())
		{
			System.out.println(animalIt.next());
		}
		
		animals.remove(1);
		System.out.println(animals);
		
		animals.clear();
		System.out.println(animals);
	}

}
