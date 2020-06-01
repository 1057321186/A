package com.project.equlas;



public class Test {
	
	
//比较基本类型只能用==,比较结果你看到的字面值相等就会相等,什么叫基本类型?
//byte,short,int,long,char,float,double这几种就是基本类型.基本类型不是对象所以不存在用equals比较.
//	凡是比较引用类型(对象),==比较的是两个引用是不是指向同一个内存地址,equals比较的是两个引用的字面值是不是相同,什么叫字面值?
//  你能看到的值就是字面值,比如:String s="abc"; abc就是字面值.
//	基本类型的包装类型是对象类型,所以除非两个相同字面值的引用指向同一内存地址,值才会相等,比如:
//	Integer a=new Integer(3);Integer b=a;//互相赋值
//	这样用等号或equals比较都会得出true,记住一点,凡是两个引用都用了new去初始化,那==比较的结果都只会是false,互相之间有了赋值,比较结果就为true.
//	比较不好理解的一点:
//	String a="abc";
//	String b="abc";
//	a==b和a.equals(b);结果都会为true,因为没有用new去新建对象,其实a和b都指向的是同一个String对象"abc",改成:
//	String a=new String("abc");
//	String b=new String"abc");
//	后==的结果就是false了.总之参照上面的说明,不难理解.	
	public static void main(String[] args) {
		User user1=new User(10,"王春");
		User user2=new User(10,"王春");
		User user3=user1;
		System.out.println(user1==user2);
		System.out.println(user1.equals(user2));
		System.out.println(user1==user3);
		System.out.println(user1.equals(user3));
		
		String str1="abcd";
		String str2="abcd";
		String str3=new String("aaa");		
		String str4=new String("aaa");
		System.out.println(str1==str2);
		System.out.println(str1.equals(str2));
		//比较基本类型只能用==
		//凡是比较引用类型(对象),==比较的是两个引用是不是指向同一个内存地址,equals比较的是两个引用的字面值是不是相同,
		System.out.println(str3==str4);		//凡是两个引用都用了new去初始化,那==比较的结果都只会是false
		System.out.println(str3.equals(str4));	//equals比较的是两个引用的字面值是否相等
	}
	
}
class  User{
	int age;
	String name;
	public User() {
		// TODO Auto-generated constructor stub
	}
	public User(int age,String name) {
		super();
		this.age=age;
		this.name=name;
	}
	
}
