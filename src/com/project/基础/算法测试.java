package com.project.基础;

import java.util.Arrays;
import java.util.Scanner;
import java.lang.*;
public class 算法测试 {
	public static void main(String[] args) {
		//1.计算从从100-500的和
		int i=100;	
		int sum=0;
		while(i<=500){
			sum+=i;
			i++;
		}
		System.out.println("100-500的和："+sum);
		
		//2.把任何数字转化成二进制
		System.out.println("请输入任意数字：");
		Scanner scanner=new Scanner(System.in);
		int a=scanner.nextInt();
		String b=Integer.toBinaryString(a);
		String c=Integer.toHexString(a);
		String d=Integer.toOctalString(a);
		System.out.println(a+"转换成二进制:"+b);
		System.out.println(a+"转换成八进制:"+c);
		System.out.println(a+"转换成十六进制:"+d);
		
		//3.判断输入的字符是数字，大写字母，小写字母，还是符号
		System.out.println();
		Scanner scanner2=new Scanner(System.in);
		String cha=scanner2.next();
		char [] chaa= cha.toCharArray();
		if(65<=chaa[0]&&chaa[0]<=97){
			System.out.println("是小写字母");
		}
		if(Character.isDigit(chaa[0])){
		//判断是否为数字
			System.out.println(chaa[0]+"是数字");
		}
		//4.遍历数组
		int [] arr={18,2,3,54,11,32,10,5};
		for(int arrr:arr){
			System.out.print(arrr+"\t");
		}
		for(int j=0;j<arr.length;j++){
			
		}
		//获取数组最大值
		int max=arr[0];
		for(int k=0;k<arr.length;k++){
			if(max<arr[k]){
				max=arr[k];
			}
		}
		System.out.println("最大值"+max);
		//数组排序
		Arrays.sort(arr);
		for(int q:arr){
			System.out.print(q+"\t");
		}
	}
	
}
