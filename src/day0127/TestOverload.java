package day0127;

/**
 *	클래스에서 같은 이름의 method를 여러개 만들 수 있는 Overload사용<br>
 *	규칙)접근지정자, 반환형은 달라도 되고 같아도 된다. 
 *	method명은 같아야 하고 매개변수는 반드시 달라야 한다.
 *	
 * @author user
 */
public class TestOverload {
	
	
	/**
	 * 별 한개를 출력하는 일
	 */
	public void printStar() {
		System.out.println("★");
	}//printStar
	
	/**
	 * 입력받은 수대로 별을 출력하는 일.
	 * method Overload(Overloading)
	 * @param count 출력한 별의 갯수
	 */
	public void printStar(int count) {
		for(int i=0;i<count;i++) {
			System.out.print("☆");	
		}//endfor
	}//printStar
	

	public static void main(String[] args) {
		TestOverload to=new TestOverload();
		to.printStar();//고정 일.(반환형 없고 매개변수 없는 형)
		to.printStar(1);//가변 일.(반환형 없고 매개변수 있는 형)
		/*
		 * Overload 된 printStar method를 사용하여 아래와 같은 형태로 ☆ 출력
		 *  ☆ 
		 *  ☆ ☆
		 *  ☆ ☆ ☆
		 *  ☆ ☆ ☆ ☆
		 *  ☆ ☆ ☆ ☆ ☆
		 */
		for(int i=0;i<5;i++) {
			to.printStar(i);
			System.out.println();
		}//for
			
	}//main
}//class
