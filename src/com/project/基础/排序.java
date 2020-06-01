package com.project.基础;

public class 排序 {
public static void main(String[] args) {
	
	//
	int a=52;
	StringBuffer sBuffer=new StringBuffer();
	while(a!=0){
		//取余
		sBuffer.append(a%2);
		a=a/2;
	}
	
	System.out.println(sBuffer);
	
	//冒泡:
	int [] arr={23,11,324,10,2,31};
//	for(int i=0;i<arr.length;i++){
//		for(int j=0;j<arr.length-i-1;j++){
//			if(arr[j]>arr[j+1]){
//				//交换数据
///*				int temp=arr[j];
//				arr[j]=arr[j+1];
//				arr[j+1]=temp;
//*/			
//			arr[j]=arr[j+1]+arr[j];
//			arr[j+1]=arr[j]-arr[j+1];
//			arr[j]=arr[j]-arr[j+1];
//			}
//		}
//	}
	

	
	for(int d:arr){
		System.out.print(d+"\t");
	}
	
}
}
