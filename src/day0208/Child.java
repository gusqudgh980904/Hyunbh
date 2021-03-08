package day0208;

/**
 * Parent의 자식클래스
 * @author user
 */
public class Child extends Parent {
	public Child() {
		this(100);
		System.out.println("자식의 기본생성자");
	}//Child
	
	public Child(int i) {
		super();
		System.out.println("자식의 인자생성자"+i);
		
	}//Child



}//class
