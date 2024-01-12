package com.tnsif.secondpackage;

import com.tnsif.firstpackage.Base;

public class Executor extends Base {

	public static void main(String[] args) {
		Base b=new Base();
		
		//b.methodDefault();
		//b.methodProtected();
		b.disp();
		b.methodPublic();
		
		//b.vardefault=37;
		//b.varProtected=56;
		b.varPublic=78;
		//b.varPrivate=12;
		
	//	b.methodDefault();
		//b.methodProtected();
		b.disp();
		b.methodPublic();

	}

}
