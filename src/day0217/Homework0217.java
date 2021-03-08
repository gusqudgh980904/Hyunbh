package day0217;

/**
 * 숙제1. 숫자,영대문자,영소문자로 구성된 임시 비밀번호를 8자로 생성하여
 * char[]로 반환하는 method를 만든다
 * 위의 method를 호출하여 반환된 char[]을 저장하여 출력해보세요
 * @author user
 */
public class Homework0217 {
	
	public Homework0217() {
		double num=(int)(Math.random()*10);//0~9
		char upperCase=((char)((int)(Math.random()*26)+65));//A~Z
		char lowerCase=((char)((int)(Math.random()*26)+97));//a~z
		char[] password = new char[8];
		
		System.out.println(password);
	}//Homework0217

	public static void main(String[] args) {
		new Homework0217();
	}//main

}//class
