package com.project.算法;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

import com.project.collection.SetTest;

public class 字符串去重 {
	
	//1.有一组字符串，["hello","world","abc","fff","test","world"]，请将其去重。
	public static void main(String[] args) {
		String[] str={"hello","world","abc","fff","test","world"};
		HashSet<String> set=new HashSet();
		
			for(String s:str){
				set.add(s);
			}
			for(String a:set){
				System.out.println(a);
			}
 	}

}
