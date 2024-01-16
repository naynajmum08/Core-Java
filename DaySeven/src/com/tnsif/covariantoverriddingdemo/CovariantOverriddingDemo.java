package com.tnsif.covariantoverriddingdemo;

class Color {
	protected Color getColor() {
		Color c = new Color();
		return c;
	}
}

class Red extends Color {
	@Override
	public Red getColor() {
		Red r = new Red();
		return r;
	}
}

class Yellow extends Color {
	@Override
	public Yellow getColor() {
		Yellow y = new Yellow();
		return y;
	}
}

public class CovariantOverriddingDemo {

	public static void main(String[] args) {
		Color c1 = new Color();
		Color c2 = c1.getColor();
		System.out.println(c2);

		Red r1 = new Red();
		Red r2=r1.getColor();
		System.out.println(r2);

	}

}
