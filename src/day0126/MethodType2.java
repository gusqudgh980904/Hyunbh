package day0126;

public class MethodType2 {
	
	//항상 같은 인사"안녕하세요?최홍만입니다."를 출력하는 method를 만들기.
	public void hello() {
		System.out.println("안녕하세요? 최홍만입니다.");
	}//hello

	//항상 올해를 반환하는 method.고정 값
	public int year() {
		return 2021;
	}//year
	
	//입력된 문자의 Unicode값 출력하는 method.가변 일.
	public void printUnicode(char c) {
		System.out.println(c+"의 unicode 값:"+(int)c);
	}//printUnicode
	
	//실수를 정수로 변환하는 반환하는 method.가변 값.
	public int casting(double d) {
		return (int)d;
	}//casting

	public static void main(String[] args) {
		//1.객체화
		MethodType2 mt2=new MethodType2();
		//2.method 호출
		mt2.hello();//고정 일.
		
		int value=mt2.year();//고정 값.
		System.out.println(value);
		
		mt2.printUnicode('0');//가변 일
		
		value=mt2.casting(2021.0126);//가변 값
		System.out.println(value);
		
	}///main
}//class
