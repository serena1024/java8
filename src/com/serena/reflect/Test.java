package com.serena.reflect;

//接口
interface Fruit{
	public void eat();
}

//实现类
class Apple implements Fruit{

	@Override
	public void eat() {
		System.out.println("**** 吃苹果");
	}
	
}

//工厂类
class Factory{
	public static Fruit getInstance(String className) {

		try {
			//通过反射来实例化是体类
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
