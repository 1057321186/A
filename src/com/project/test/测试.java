package com.project.test;

public class 测试 {
	public static void main(String[] args) {
		short s1=1;
		//s1=s1+1;	//会报错 cannot convert from int to short
		s1+=1;		//正常运行
		System.out.println(s1);
		//1、对于short s1 = 1; s1 = s1 + 1;。 s1 是short类型的变量，在和int类型的1进行运算时会自动的将short->int, 然后执行复制操作符“=”,就会发生类型的错误，左边是short类型，右边是int类型的变量。而在java中规定低位的数据类型向高位的数据类型可以进行自动转换(隐式)转换，而高位向低位类型转换要进行强制的类型说明。因为在高位向低位数据类型的转换时容易发生数据精度的丢失。
				
		//2、对于short s1 = 1; s1 += 1;由于 +=是java语言规定的运算符，java编译器会对它进行特殊处理，因此可以正确编译。
		int i;
		//i+=1;//未初始化错误
		StringBuffer str=new StringBuffer();
		str.append("a");
		final StringBuffer a=str;//当final修饰的成员变量为引用数据类型时，在赋值后其指向地址无法改变，但是对象内容还是可以改变的。
		System.out.println(a);
		str.append("b");
		System.out.println(a);
	}
}
