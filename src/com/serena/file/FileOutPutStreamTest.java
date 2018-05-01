package com.serena.file;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

//�ֽ������
public class FileOutPutStreamTest {
	public static void main(String[] args) throws Exception {
		//1.����Ҫ����ļ���File�����
		File file = new File("f:" + File.separator + "hello" + File.separator + "my.txt");
		//2.����ļ���ʱ���ļ����Բ�����,����Ŀ¼�������
		if(!file.getParentFile().exists()) { //��·��������
			file.getParentFile().mkdirs();	//������·��
		}
		//3.����OutputStream������Ϊ�������ʵ����
		OutputStream output = new FileOutputStream(file);//(file,true)׷�Ӳ���,�ں���׷��
		//4.���������Ϣ
		String msg = "beautiful";  // /r /n ����
		//Ϊ�˷��������Ҫ���ַ��ܱ�Ϊ�ֽ�����
		byte data [] = msg.getBytes();
		//�������
		output.write(data);//(data , 0 ,10 )���10���ֽ�
//		for(int i = 0 ;i < data.length ; i++) { һ��һ�����
//			output.write(data[i]);
//		}
		output.close();
	}
}
