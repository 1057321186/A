package com.project.extend;

public class B extends A{
	
	@Override
	void test() {
		super.test();
		System.out.println("重写父类方法");
	}
	
	public static void main(String[] args) {
//		A a =new B();
//		a.test();
//		a.test1();
		B b=new B();
		b.test1();
		A a2=new B();
		a2.test();
	}

}
