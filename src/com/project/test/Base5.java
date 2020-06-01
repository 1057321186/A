package com.project.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.*;
import java.util.Random;

public interface Base5 {
	int a();
	int aa=1;
	default int c() {
		return 0;
	}

	public static void main(String[] args) {
		System.out.println("?"+aa);
		//输入一行字符，统计英文字母，数字，空格和其他字符的个数
		//打印 30到50之间的随机数
        int min = 30;
        int max = 50;
        for(int i=0;i<10;i++){
            System.out.println(new Random().nextInt(max-min)+min);
        }
        System.out.println((int)(Math.random()*10));
        int x,y;

        x=5>>2;

        y=x>>>2;

        System.out.println(":"+y);
    
	}
}
