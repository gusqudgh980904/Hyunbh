package day0115;
    /**115숙제입니다
	*/
	
//*클래스명은 숫자로 시작할 수 없습니다.
class Homework0115 {
	public static void main(String[] args) {
		//오늘은 2021년 1월 15일 입니다.
		int year=2021;//년도
		int month=1;//월
		int day=15;//일    *변수명은 a b c로 하지 말고 의미를 알 수 있게 영어단어로 설정해보세요. 
		System.out.println("오늘은 "+ year+'년'+month+'월'+day+'일'+"입니다.");


		//내 이름의 이니셜은 HBH입니다.
		char FirstAndLastInitial='H';
		char SecondInitial='B';
		System.out.println("내 이름의 이니셜은 "+FirstAndLastInitial+SecondInitial+FirstAndLastInitial+"입니다.");//*int 사용시 문자가 아닌 코드로 출력됨


		//왼눈 시력0.4 오른눈 시력0.3 양안시력은 0.7입니다.  
		double leftEye=0.4;//왼눈 시력  *변수명에 공백을 넣을 수 없어요
		double rightEye=0.3;//오른눈 시력
		float bothEye=0.7f;//양안 시력
		System.out.println("왼눈 시력"+leftEye+" 오른눈 시력"+rightEye+" 양안 시력은"+bothEye+"입니다.");

        
	   //기본형 데이터형인 boolean형은 기본 값이 false로 설정됩니다.
	  // boolean T=true;
       boolean F=false;
	   System.out.print("기본형 데이터형인 boolean형은 기본 값이 "+F+"로 설정됩니다.");
	
	  
	  }//main //local 변수
}//class //instance 변수, static 변수
