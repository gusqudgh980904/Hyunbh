package day0122;

/**
 *	일치하는 정수를 비교할 때 사용하는 switch~case문<br>
 *	문법)
 *		switch(변수명){
 *			case 상수 : 실행문장;<br>
 *			case 상수 : 실행문장;<br>
 *			case 상수 : 실행문장;<br>
 *							.
 *							.
 *							.
 *			default : 실행문장<br>
 *	}
 * @author user
 */
public class TestSwitchCase {

	public static void main(String[] args) {
		
//		int i=1; // byte short int long(X) char
//		switch ( i ) {//정수를 저장한 변수만 사용 할 수 있다.
//		case 0:System.out.println("ZERO");
//		case 1:System.out.println("ONE");
//		case 2:System.out.println("TWO");
//		default:System.out.println("일치하는 상수 없음.");
//		}//end switch

		/////////case의 상수는 입력되는 데이터형의 범위까지만 사용할 수 있다.///////////
//		int i=0; // byte short int long(X) char
//		switch ( i ) {//정수를 저장한 변수만 사용 할 수 있다.
//		case -2147483648:System.out.println("ZERO");
//		case 1:System.out.println("ONE");
//		case 2:System.out.println("TWO");
//		default:System.out.println("일치하는 상수 없음.");
//		}//end switch

		/////////////////char형////////////
//		char i='A'; // char는 입력되는 문자에 대응하는 Unicode값을 저장.
//		switch ( i ) {//정수를 저장한 변수만 사용 할 수 있다.
//		case 'A':System.out.println("ZERO");
//		case 'B':System.out.println("ONE");
//		case 'C':System.out.println("TWO");
//		default:System.out.println("일치하는 상수 없음.");
//		}//end switch
		
		/////////////////////String////////////
		String i="Oracle"; // JavaSE 7(JDK1.7)부터 지원
		switch ( i ) {//
		case "Java":System.out.println("완벽한 OOP언어");
		case "Oracle":System.out.println("대용량 데이터베이스");
		case "HTML":System.out.println("마크업 언어");
		default:System.out.println("일치하는 상수 없음.");
		}//end switch
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}//main
}//class
