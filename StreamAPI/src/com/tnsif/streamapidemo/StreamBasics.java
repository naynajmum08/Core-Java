package com.tnsif.streamapidemo;

import java.util.stream.Stream;

public class StreamBasics {

	public static void main(String[] args) {
		//creating stream from set of values
		Stream<Integer> streamInt=Stream.of(10,20,40,50,60);
		
		Stream<Integer> si=streamInt.skip(3);
		si.forEach(System.out::println);

		/*
		 * //Terminal -count Long countInt=streamInt.count();
		 * System.out.println(countInt);
		 */
	}

}
