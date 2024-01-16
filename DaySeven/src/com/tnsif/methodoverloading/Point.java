package com.tnsif.methodoverloading;

public class Point {
private float x;
private float y;

//constructor 1
public Point(float x, float y) {
	
	this.x = x;
	this.y = y;
}
//constructor 2
public Point(float x) {
	
	this.x = x;
	this.y = x;
}

//constructor 3
public Point() {
	this.x = 0.0f;
	this.y = 0.0f;
}
@Override
public String toString() {
	return "Point [x=" + x + ", y=" + y + "]";
}




}
