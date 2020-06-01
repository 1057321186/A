package com.project.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


//操作数据库
//1、先导jar包 mysql-connector-java-5.0.8-bin.jar  到lib里
public class Base {
	public static void main(String[] args) {
		try {
			//2、记载驱动
			Class.forName("com.mysql.jdbc.Driver");
			//3、建立数据库连接
			Connection c = DriverManager.getConnection(
                            "jdbc:mysql://localhost:3306/booksys?characterEncoding=UTF-8",
                            "root", "root");
			
			System.out.println("数据库驱动加载成功，获取连接对象"+c);
			
			//创建statement			注：使用的是 java.sql.Statement
			Statement s = c.createStatement();
			
			boolean a=s.execute("select count(*) from book");
			System.out.println(a);
		} catch (Exception e) {
		
		}
	}
}
