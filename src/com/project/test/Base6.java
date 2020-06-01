package com.project.test;

public class Base6 {
	
	public static String replaceSpace(StringBuffer str){
		StringBuffer stringBuffer=new StringBuffer();
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i)==' ')	
			{
				stringBuffer.append("%20");
			}else {
				stringBuffer.append(str.charAt(i));
			}
		}
		return stringBuffer.toString();
	}
	
	
	public static void main(String[] args) {

	
	StringBuffer str=new StringBuffer("We are heiheihei");
	System.out.println(replaceSpace(str));
	
	
	}
	
}
