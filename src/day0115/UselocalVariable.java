package day0115;
/**
method안에서 선언하는 지역변수의 특징.
*/

class UselocalVariable{
public static void main(String[] args) {
     //1.선언 : 데이터형 변수명;
	 int i;//초기화하지 않은 선언
	 int j=0;//초기화한 선언(권장방법)
	 //같은 이름의 변수를 선언하면 Error
	 //int i;
	 int k=0;
	 //2.값할당 : 변수명=값;
	 i=15;
	 j=1;
	 //3.값 사용 : 출력, 연산, 재할당
	 System.out.println( i );
	 System.out.println( j );
	 i=2021;

	 //값할당 하지 않은 변수를 사용하면 Error
	 System.out.println( k );
	 System.out.println( i );//2021

      int 내나이=0;// 한글변수명은 설정가능하나 사용하지 않는다.
		  내나이=26;

         System.out.println( 내나이 );
     int year=2021;
         System.out.println("올해는 " + year+"년입니다.");

	}//main
}//class
