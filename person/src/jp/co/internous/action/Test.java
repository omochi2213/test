package jp.co.internous.action;

public class Test {

	public static void main(String[]args){
		
		Person taro=new Person();
		taro.name="山田太郎";
		taro.age=20;
		taro.address="東京";
		
		System.out.println(taro.name);
		System.out.println(taro.age);
		System.out.println(taro.address);
		taro.talk();
	}
}
