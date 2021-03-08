package day0120;

public class Homework0120 {
	public static void main(String[] args) {	
//		1.일반논리 연산자 ||에서 전항이 true를 발생하면 후항이 실행되지 않는다는 것을 증명하는
//		   코드를 작성해보세요.
		
		int score=100;
	   System.out.println(((score>90)||(score>100)));
	   
//	   2.삼항연산자를 사용하여 변수에 음수가 할당되었을 때 절대값을 출력하는 코드를 작성해보세요.

	   int num=-5; //삼항연산자는 ? : 이에요
	System.out.println(num<0?(-num):(num));
		
		
		
		
		
	}//main
}//class
