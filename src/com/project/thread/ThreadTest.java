package com.project.thread;

public class ThreadTest extends Thread{
	
	//继承Thread类
	//线程体，多线程任务都在run里面执行
	private int a=9;
	@Override
	public void run() {
		try {
			
			for(int i=0;i<a;i++){
				Thread.sleep(1000);
				System.out.print(i+" ");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		ThreadTest base1=new ThreadTest();
		ThreadTest base2=new ThreadTest();
		ThreadTest base3=new ThreadTest();
		base1.start();
		//base2.start();
		//base3.start();
		//base.run();//指点调用润run()方法相当于调用普通方法
		//getPriority():查看线程优先级
		//setPriority():设置线程优先级  有数字1-10表示:主线程默认为5，值越大优先级越高(也可能不一定)
		//System.out.println("查看线程优先级"+base.getPriority());	
		//base.setPriority(7);
	}
}
