package day0126.sub;

import day0126.UseAccessModifier;

/**
 *	다른 패키지의 다른 클래스를 상속받고 부모클래스에 존재하는 instance variable을 사용.<br>
 *	부모클래스(UseAccessModifier), 자식클래스 (UseInstanceVariable2)<br>
 *	상속관계일때에는 자식 클래스로 객체화 해야 부모클래스의 변수나 method를 모두 다 사용할 수있다.
 * @author user
 */
public class UseInstanceVariable2 extends UseAccessModifier {

	public static void main(String[] args) {
		//1.자식객체화.(클래스명 객체명=new 클래스명(); )
		UseInstanceVariable2 uiv=new UseInstanceVariable2();
		
		//부모클래스의 public,protected 접근 지정자는 다른 패키지의 자식 클래스에서 사용가능.
		//2.변수사용.(객체명 변수명)
		System.out.println("부모의 public:a"+uiv.a);
		System.out.println("protected:b"+uiv.b);
//		System.out.println("default:c"+uiv.c);
//	    System.out.println("private:d"+uiv.d);
	}//main
}//class
