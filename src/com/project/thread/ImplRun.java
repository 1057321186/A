package com.project.thread;

public class ImplRun implements Runnable{

	//实现Runnable接口的线程类需要 new一个Thread类来启动线程
	
	//1、实现Runnable接口
	//2、重写
	//3、新建类实例和Thread实例，将类实例传入给Thread(类实例)
	//4、通过Thread实例调用start()启动线程
	private int count=10;
	@Override
	public void run() {
			
		try {
			
			for(int i=1,j=1;j<=9;i++){
				Thread.sleep(1000);
				System.out.print(i+"*"+j+"="+i*j+" ");
			if(i==j){
				i=0;
				j++;
				System.out.println("");
			}
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		

	}
	

	public static void main(String[] args) {
		ImplRun implRun=new ImplRun();
		Thread thread=new Thread(implRun,"嘿嘿嘿");
		thread.start();
		

		//		ImplRun base2=new ImplRun();		//线程的执行体（任务）
//		Thread thread=new Thread(base2);//产生线程的对象
//		
//		thread.start();//启动线程
//		System.out.println("name:"+thread.getName());
//		System.out.println("执行主线程");	//主线程执行完再开启线程
	}
	

}
