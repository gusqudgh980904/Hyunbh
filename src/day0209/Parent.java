package day0209;

/**
 * 부모클래스->모든 자식클래스가 사용할 공통 특징 정의<br>
 * @author user
 */
public class Parent {
	String name;
	int age;
	//final 접근지정자가 사용되면 자식클래스에서 Override 할 수 없다.
	public /*final*/ void printName() {
		System.out.println("이름"+name);
	}//printName
	
	public void printAge() {
		System.out.println("나이"+age);
	}//printAge
		
	

}//class
