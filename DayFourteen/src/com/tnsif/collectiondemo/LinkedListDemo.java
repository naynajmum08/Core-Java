package com.tnsif.collectiondemo;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<Integer> num=new LinkedList<>(); 
		
		num.add(10);
		num.add(50);
		num.add(68);
		num.add(45);
		//num.add(null);
		num.add(50);
		num.add(2,90);
		num.addFirst(26);
		num.addLast(67);
		num.add(45);
		System.out.println(num);

		
		System.out.println(num.get(7));
		System.out.println(num.getFirst());
		System.out.println(num.getLast());
		
		num.remove();
		System.out.println(num);
		num.removeLast();
		System.out.println(num);
		
		ListIterator<Integer> numIt=num.listIterator(num.size());
		while(numIt.hasPrevious())
		{
			int no = numIt.previous();
			System.out.println(no);
			
						
		}
		Collections.sort(num);
		System.out.println(num);
		
		Collections.reverse(num);
		System.out.println(num);
	
	}
	
}
