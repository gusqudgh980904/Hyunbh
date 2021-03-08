package day0126;

/**
 *	instance variable의 기본값(default value).
 * @author user
 */
public class DefaultValue {
	//instance variable:클래스 안에 instance 영역에서는 그냥 사용할 수 있는 변수.
	///기본형 데이터형
	int a;//정수형 기본값:0
	char b;//문자형 기본값:\u0000(Unicode)는 코딩창에서 직접 사용할 수 없다. 
	float c;//실수형 기본값:0.0
	boolean d;//불린형 기본값:false
	///참조형 데이터형///
	DefaultValue dv;//class 기본값:null
	String s;//String 기본값:null
	int[] arr;//array 기본값:null
	
	
	/**
	 * instance method
	 */
	public void methodA() {//instance 영역에서는 instance variable을 객체명 없이 사용할 수 있다.
		System.out.println(a);
	}//methodA
	
	/**
	 * static method
	 */
	public static void methodB() {
	//	System.out.println(a); static 영역에서는 instance variable을 반드시 객체화하여 사용해야한다.
	}//methodB
	

	public static void main(String[] args) {
		//java DefaultValue로 클래스를 실행하면 main method가 가장 처음 실행된다.
		//(class field를 실행하지 않는다.-인스턴스 변수가 메모리에 올라가지 않는다.)
		//System.out.println(dv);
		//객체화 : 클래스명 객체명=new 클래스명(); - 인스턴스 변수가 메모리에 올라간다.-사용가능
		DefaultValue dv=new DefaultValue();
		//변수의 사용:객체명.변수명
		System.out.println("정수형:"+dv.a);
		System.out.println("문자형:["+dv.b+"]");
		System.out.println("불린형:"+dv.d);
		System.out.println("class:"+dv.dv);
		System.out.println("String:"+dv.s);
		System.out.println("array:"+dv.arr);
		System.out.println("--------------------");
		//instance 변수는 객체마다 생성되고 사용되는 변수.
		DefaultValue dv1=new DefaultValue();
		DefaultValue dv2=new DefaultValue();
		
		dv1.a=200;
		
		System.out.println("dv1.a:"+dv1.a);
		System.out.println("dv2.a:"+dv2.a);
		
		
		
		
		
	}//main
}//class
