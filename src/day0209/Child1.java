package day0209;

/**
 * Parent의 자식클래스
 * @author user
 */
public class Child1 extends Parent {
	
	int child1;
	
	
	@Override
	public void printName() {
		System.out.println("자식이 Override한 method");
	}//printName

}//class
