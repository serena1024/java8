package com.serena.file;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

//字节输出流
public class FileOutPutStreamTest {
	public static void main(String[] args) throws Exception {
		//1.定义要输出文件的File类对象
		File file = new File("f:" + File.separator + "hello" + File.separator + "my.txt");
		//2.输出文件的时候文件可以不存在,但是目录必须存在
		if(!file.getParentFile().exists()) { //父路径不存在
			file.getParentFile().mkdirs();	//创建父路径
		}
		//3.利用OutputStream的子类为父类进行实例化
		OutputStream output = new FileOutputStream(file);//(file,true)追加操作,在后面追加
		//4.输出文字信息
		String msg = "beautiful";  // /r /n 换行
		//为了方便输出需要将字符窜变为字节数组
		byte data [] = msg.getBytes();
		//输出数据
		output.write(data);//(data , 0 ,10 )输出10个字节
//		for(int i = 0 ;i < data.length ; i++) { 一个一个输出
//			output.write(data[i]);
//		}
		output.close();
	}
}
