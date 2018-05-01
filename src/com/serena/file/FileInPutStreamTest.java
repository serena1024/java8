package com.serena.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

//�ֽ�������
public class FileInPutStreamTest {
	//ʵ�����ݶ�ȡ
	public static void main(String[] args) throws Exception {
		//1.����Ҫ����ļ���File�����
		File file = new File("f:" + File.separator + "hello" + File.separator + "my.txt");
		//2.ʵ����inputstream���һ������
		InputStream input = new FileInputStream(file);
		//3.���ݶ�ȡ����
		byte data [] = new byte [1024]; ///ˮ��
		//int len = input.read(data);     //�����ݶ�ȡ������֮��
		int foot = 0 ;
		int temp = 0 ;
		while((temp = input.read()) != -1) {
			data[foot++] = (byte)temp;
		}
		System.out.println("��ȡ������ : " + new String(data , 0 , foot));
		//4.�ر�
		input.close();
	
	}
}
