package com.tnsif.streamapidemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamBasics {

	public static void main(String[] args) {
		//creating stream from set of values//way 1
		Stream<Integer> streamInt=Stream.of(10,20,40,50,60);
		
		Long c=streamInt.count();
		System.out.println(c);
		
		//create a Stream from Array//way 2
		Integer[] arr=new Integer[] {3,8,9,7,4,12,8,9,2,5,3};
		
		 streamInt=Arrays.stream(arr);
		 
		 //map
		// streamInt.map(num->num*num).map(num->num+1).forEach(System.out::println);
		 Stream<Integer> sqStream=streamInt.map(num->num*num).map(num->num+1);
		 
		// sqStream.forEach(System.out::println);
		 
		 //Limit //skip
		//Arrays.stream(arr).limit(5).skip(2).forEach(System.out::println);
		//System.out.println(c1);
		
		//distinct
		 streamInt=Arrays.stream(arr);
		 streamInt.map(num->num*num).distinct().forEach(System.out::println);
		 
		 
		 //way 3-Collection
		 
		 List<String> names=new ArrayList<String>();//mutable list
		 names.add("Rutuja");
		 names.add("Sarika");
		 Stream<String> stNames=names.stream();
		 
		 List<String> s1=stNames.map(name->name.toUpperCase()).collect(Collectors.toList());
		 System.out.println(s1);
		 
		 List<String> s=Arrays.asList("Hello","Java","Programming"); //immutable list
		// s.add("Nayna");
		List<String> s2= s.stream().map(name->name.toLowerCase()).collect(Collectors.toList());
		System.out.println(s2);
						
		
		
	}

}
