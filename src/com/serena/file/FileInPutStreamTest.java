package com.serena.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

//字节输入流
public class FileInPutStreamTest {
	//实现数据读取
	public static void main(String[] args) throws Exception {
		//1.定义要输出文件的File类对象
		File file = new File("f:" + File.separator + "hello" + File.separator + "my.txt");
		//2.实例化inputstream类的一个对象
		InputStream input = new FileInputStream(file);
		//3.数据读取操作
		byte data [] = new byte [1024]; ///水杯
		//int len = input.read(data);     //将数据读取到数组之中
		int foot = 0 ;
		int temp = 0 ;
		while((temp = input.read()) != -1) {
			data[foot++] = (byte)temp;
		}
		System.out.println("读取的内容 : " + new String(data , 0 , foot));
		//4.关闭
		input.close();
	
	}
}
