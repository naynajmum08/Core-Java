package com.tnsif.queuedemo;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
		Queue<Integer> num = new LinkedList<>();
		
		
		//System.out.println(num.remove());//Throws NoSuchElementException

		System.out.println(num);

		//System.out.println(num.element());//Throws NoSuchElementException
		System.out.println(num.poll()); //returns null value

		System.out.println(num);

		num.add(13);
		num.add(78);
		num.add(90);
		num.add(56);
		System.out.println(num);

		int removenum = num.remove();
		System.out.println(removenum);

		System.out.println(num);

		int numPoll = num.poll();
		System.out.println(numPoll);

		System.out.println(num);
		
		int numPeek=num.peek();
		System.out.println(numPeek);

		System.out.println(num);
		
		int numElement=num.element();
		
		System.out.println(numElement);

		System.out.println(num);
		
		num.offer(78);
		System.out.println(num);

		
	
	}

}
