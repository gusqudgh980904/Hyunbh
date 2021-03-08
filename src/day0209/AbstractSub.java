package day0209;

/**
 * 추상클래스의 자식클래스
 * 반드시 부모클래스의 abstract method를 모두 구현해야한다
 * @author user
 */
public class AbstractSub extends AbstractSuper {
	
	public AbstractSub() {
		System.out.println("자식클래스의 생성자");
	}//AbstractSub
	
	//abstract method 구현(Override)
	@Override
	public  void typeA() {
		System.out.println("고정 일:반환형 없고,매개변수 없고 형");
	}//typeA
	
	@Override
	public  void typeB(String msg) {
		//instanceMethod();//부모클래스의 일반 method
		System.out.println("가변일:반환형 없고,매개변수 있는 형");
//		super.typeA();//추상method는 직접 호출할 수 없다
	}//typeB
	
	@Override
	public  int typeC() {//고정값:반환형있고,매개변수 없는 형
		return 0;
	}//typeC
	
	public int typeD(String m) {//가변값:반환형있고,매개변수 있는 형
		return m.length();
	}

	public static void main(String[] args) {
//		new AbstractSuper();//직접 객체화 될 수 없다.
		AbstractSub as=new AbstractSub();//자식클래스를 객체화 했을 때에만 객체가 생성된다.
		as.typeB("가변 일");
		
		
		

	}//main
}//class
