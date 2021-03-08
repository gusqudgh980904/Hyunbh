package day0126;

public class Homework0126 {
	//method의 이름은 소문자로 시작합니다.
	
	//1.자신의 이름을 출력 하는 일을 하는 method.
	public void MyName() {
		System.out.println("현병호");
	}//MyName
	
	//2.자신의 이름 이니셜 첫 글자만 반환하는 method.
	public char Initial( ) {
		return 'H';
	}//Initial
	
	//3.점수를 입력받아 점수의 판정을 출력하는 method.
		//점수는 0~100점 사이라면 판정을 내린다.
		//그렇지 않으면 "잘못된 점수"를 출력한다.
		//판정 0~39=과락 40~59=다른 과목 참조 60~100=합격
	public void score(int i) {
		if(i>0&&i<40) {
			System.out.println("과락");
		}//end if
		else if(i>39&&i<60) {
			System.out.println("다른 과목 참조");
		}//end if
		else if(i>59&&i<101) {
			System.out.println("합격");
		}//end if
		else{
			System.out.println("잘못된 점수");
		}//end else
	}//end score
	
	//4.문자를 입력받아 해당 문자가 "대문자","소문자","숫자"인지를 판단하여 출력하는 method.
	public void Unicode(char a) {
		if(a>63&&a<91) {
		System.out.println(a+"의 문자는 대문자");
		}//if
		if(a>96&&a<125) {
			System.out.println(a+"의 문자는 소문자");
		}//if
		else {
			System.out.println(a+"의 문자는 숫자");
		}//else
	}//Unicode
	
	//5.태어난 해를 입력받아 나이를 반환하는 method.
		//(나이 구하는 식:올해-나이+1)
	public int years() {
		int s=1968;
		return (int)2021-s+1;
	}//years
	
	//6.두 개의 수를 입력 받아 둘 중 큰 수를 반환하고  같은 수 라면 처음 수를 반환하는 method.
	public int number(int q,int w) {
		q=200;
		w=198;
		if(q>w) {
			return q;
		}//if
		else if(w>q) {
			return w;
		}//else if
		else {
			return q;
		}//else
	}//number
	
	
	public static void main(String[] args) {
		Homework0126 mn=new Homework0126();
		//1.
		mn.MyName();
		//2.
		mn.Initial();
		//3.
		mn.score(100);
		//4.
		mn.Unicode('g');
		//5.
		int temp1=mn.years();
		System.out.println(temp1);
		//6.
		System.out.println(mn.number(1, 2));
	}//main
}//class
