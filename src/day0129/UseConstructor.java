package day0129;

/**
 *	생성자의 사용.<br>
 *	개발자가 생성자를 하나도 정의하지 않으면 컴파일러가 기본생성자를 정의해준다.<br>
 *	생성자가 하나라도 있으면 기본생성자는 생성되지 않는다.<br>
 * @author user
 */
public class UseConstructor {
	
	public UseConstructor() {
		System.out.println("기본 생성자");
		test();//같은 영역의 method호출:method이름만 입력
		new UseConstructor(10);
//		UseConstructor(10);//error 생성자는 new를 빼고 method처럼 직접 호출 할 수 없다.
	}//UseConstructor
	
	public UseConstructor(int i) {
		System.out.println("매개변수 있는 생성자");
	}//UseContstructor
	
	public void test() {
		System.out.println("method!~!");
	}//test

	public static void main(String[] args) {
		//생성자는 객체화하여 호출 가능.
		new UseConstructor();
//		UseConstructor uc=new UseConstructor();
//		uc.test();//영역이 다르면 객체를 만들고 객체를 통해서 method를 호출
		
		
		
		
		

	}//main
}//class
