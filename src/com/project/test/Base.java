package com.project.test;

public class Base {
	
	// ^：异或：不同为真，否则为假
	// &与&&:与： 同真为真，否则为假, 
	// |与||：或：同假为假，否则为真，
	
	public static void main(String[] args) {
		int i = 1;
		boolean b = !(i++ == 3) ^ (i++ ==2) && (i++==3);
		System.out.println(b);
		System.out.println(i);
		
		System.out.println(":"+new Base().test());
	}
	boolean test(){
		int x=1;
		return x==1?true:false;
	}
	
	
}

