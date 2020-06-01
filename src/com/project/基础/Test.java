package com.project.基础;

import java.util.Scanner;

import com.sun.org.apache.xerces.internal.util.EntityResolver2Wrapper;
import com.sun.xml.internal.ws.api.server.SDDocument;

public class Test {
	public static void main(String[] args) {

		
	
		
		
		System.out.println((25 << 1) * 5);
		System.out.println((25 << 3) + (25 << 1));
		if(97=='a'){
			System.out.println("A的ASCII为65");
		}
		System.out.println();
		
		System.out.print("请输入:");
		Scanner scanner=new Scanner(System.in);
		String value=scanner.next();
		System.out.println("输入的东西:"+value);
		Test test=new Test(100);
		
	
		
	}
	
	public Test(int a){
		System.out.println(""+a);
	}
}
