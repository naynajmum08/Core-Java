package com.tnsif.firstpackage;

public class Executor extends Base{

	public static void main(String[] args) {
		Base b=new Base();
		
		b.methodDefault();
		b.methodProtected();
		b.methodPublic();
		
		b.vardefault=37;
		b.varProtected=56;
		b.varPublic=78;
		//b.varPrivate=12;
		
		b.methodDefault();
		b.methodProtected();
		b.methodPublic();
		
		

	}

}
