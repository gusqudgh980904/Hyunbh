package day0203;

/**
 *	this 키워드를 method형식으로 사용<br>
 *	this(값,,,)<br>
 *	생성자의 첫번쨰 줄에서만 사용<br>
 *	클래스안의 다른 생성자 호출 용
 * @author user
 */
public class UseThis {
	public UseThis() {
//		this(10);
		System.out.println("기본생성자(Default Constructor)");
	}//UseThis
	
	public UseThis(int i) {
		this();
		System.out.println("Overload된 생성자");
	}//UseThis

	public static void main(String[] args) {
//		new UseThis();
		new UseThis(2021);
	}//main
}//class
