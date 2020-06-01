package com.project.test;

public class Base7 {
	String str=new String("hello");
    char[]ch={'a','b'};
    public static void main(String args[]){
        Base7 ex=new Base7();
        ex.change(ex.str,ex.ch);
        System.out.print(ex.str+" and ");
        System.out.print(ex.ch);
    }
    public void change(String str,char ch[]){
        str="test ok";
        ch[0]='c';
    }
}
