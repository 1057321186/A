package com.project.thread;

/**
 *	死锁： 只要指在多个线程执行中，因争夺资源而造成互相等待的现象。若没有外部处理，他们都将无限的等待下去。（相互将对象锁起来）
* 	
* 		死锁案例
*/
public class DeadLock implements Runnable{
	public int index=0;
	public static Object A = new Object();
	public static Object B = new Object();
	
	//主线程
	public static void main(String[] args) {
		DeadLock d1=new DeadLock();
		d1.index=1;
		Thread thread1=new Thread(d1,"线程1");
		thread1.start();
		
		DeadLock d2=new DeadLock();
		d2.index=0;
		Thread thread2=new Thread(d2,"线程2");
		thread2.start();
	}
	
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+"index:"+index);	
		/**
			 * 第一个线程要执行的内容
			 * synchronized(this)代表当前对象 A锁
			 * */
		if(index==1){
			//先锁A，再锁B
			synchronized (A) {
				System.out.println(Thread.currentThread().getName()+"锁住A");
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				synchronized (B) {
					System.out.println(Thread.currentThread().getName()+"锁住B");
					System.out.println("index:"+index);	
				}
			}
		}if (index==0) {
			//先锁B，再锁A
			synchronized (B) {
				System.out.println(Thread.currentThread().getName()+"锁住B");
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				synchronized (A) {
					System.out.println(Thread.currentThread().getName()+"锁住A");
				System.out.println("index:"+index);	
				}
			}
		}
	}
	
	
	
}
