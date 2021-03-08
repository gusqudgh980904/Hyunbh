package day0126;

/**
 *	method작성기준
 *	method를 만들 때 instance variable를 사용하여 일처리를 하는 경우.
 *	=>instance method
 *
 *	method를 만들때 instance variable를 사용하지 않고 일처리를 하는 경우.
 *	=>static method
 * @author user
 */
public class UseMethod {
	int i;//instance variable
	
	/**
	 * instance method
	 */
	public void instanceMethod() {
		System.out.println(i);
	}//instanceMethod
	
	/**
	 * static method
	 */
	public static void Method() {
		System.out.println("static method: i 사용불가");
	}//staticMethod

	public static void main(String[] args) {
		//instance method 호출.
// 		  instanceMethod();//직접 호출 불가
		//1.객체화:클래스명 객체명=new 클래스명();
			UseMethod um=new UseMethod();
		//2.method 호출:
			um.instanceMethod();
			
		// um.staticMethod();//static method는 특정 객체에 속한 method가 아니므로 객체명.method명
		//의 형식으로 사용하지 않는다.
			
		///static method 호출: 객체화 없이 클래스명.method명으로 호출
			UseMethod.Method();
	}//main
}//class
