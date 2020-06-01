package com.project.test;



 class Base3 {
	static int  a=1;
	//打印99乘法表
	void count(){
	
		for(int i=1,j=1;j<=9;i++){
			System.out.print(i+"*"+j+"="+i*j+" ");
			if(i==j){
				j++;
				i=0;
				System.out.println();
				}
		}
	}
	//
	public static void main(String[] args) {
		//new Base3().count();
		//new ThreadTest().start();
		int i=12;
		System.out.println(a);
		System.out.println(i+=i-=i*=i);
		
	}

}
