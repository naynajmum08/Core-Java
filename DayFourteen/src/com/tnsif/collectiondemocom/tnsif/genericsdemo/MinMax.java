//Program to demonstrate generic interface
package com.tnsif.collectiondemocom.tnsif.genericsdemo;

//Generic Interface
public interface MinMax<T extends Comparable<T>> {

	T min();

	T max();
}

