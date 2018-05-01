package com.serena.reflect;

//�ӿ�
interface Fruit{
	public void eat();
}

//ʵ����
class Apple implements Fruit{

	@Override
	public void eat() {
		System.out.println("**** ��ƻ��");
	}
	
}

//������
class Factory{
	public static Fruit getInstance(String className) {

		try {
			//ͨ��������ʵ����������
			return (Fruit)Class.forName(className).newInstance();
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return null;
		
	}
}
public class Test {
	public static void main(String[] args) throws Exception {
		Fruit f = Factory.getInstance("com.serena.reflect.Apple");
		f.eat();
	}

}
