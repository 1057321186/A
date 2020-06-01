package com.project.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;

import com.sun.org.apache.xerces.internal.util.EntityResolver2Wrapper;



public class IoTest {
	
	public static void main(String[] args) throws IOException  {
		//创建文件对象
		File file=new File("C:\\Users\\Administrator\\Desktop\\文件写入.txt");
		try {
			//创建文件输入流
			InputStream inputStream=new FileInputStream(file);
			//创建字节数组
			byte[] con=new byte[1024];
			//将
				int lenth=inputStream.read(con);
				String string=new String(con,0,lenth);
			System.out.println(lenth+"读取到的信息：\r\n"+string);
			ArrayList<String> arrayList=new ArrayList<>();
			for(String string2:string.split(",")){
				arrayList.add(string2);
			}
			for(String s:arrayList){
				System.out.println(s);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
	}
}
