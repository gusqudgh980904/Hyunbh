package day0209;

/**
 * 상속관계에서 부모클래스를 생성할 때
 * @author user
 */
public abstract class AbstractSuper {
	int i;//instance variable
	
	public AbstractSuper() {
		System.out.println("추상클래스의 생성자");
	}//AbstractSuper
	
	public void instanceMethod() {
		System.out.println("일반 method");
	}//instanceMethod
	
	////////추상method/////////
	 public abstract /*final*/ void typeA();//abstract method는 final을 기술할 수없다.
	 public abstract void typeB(String msg);
	 public abstract int typeC();
	 public abstract int typeD(String msg);
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	//public static void main(String[] args) {
		//new AbstractSuper(); 추상클래스는 직접 객체화 할 수 없다
	//}//main
}//class
