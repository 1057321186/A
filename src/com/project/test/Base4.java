package com.project.test;

import java.util.HashMap;
import java.util.Map;

public class Base4 implements Base5{
	public static void main(String[] args) {
			
		Map map=new HashMap();
		map.put("test",Integer.valueOf("123"));
		String string=""+map.get("test");
		System.out.println(6+6+"aa"+6+6);
		int c=4/0;
	}

	@Override
	public int a() {
		// TODO Auto-generated method stub
		return 0;
	}
}
