package com.project.设计模式;

public class Single {
	private static Single single;
	private Single(){}
	public static  Single getInstance(){
		single=new Single();
		return single;
				
	}
}
