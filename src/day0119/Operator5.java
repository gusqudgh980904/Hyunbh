package day0119;
/**
논리연산자<br>
일반 논리<br>
&&(AND),||(OR)<br>

비트 논리
*/

class Operator5 {
	public static void main(String[] args) {
		////////일반논리////////////////////////
    boolean flag1=true,flag2=false,flag3=true,flag4=false;
	System.out.println("----------------------&&--------------------------");//전항이 false일 때에는 후항을 계산하지 않는다
	System.out.println(flag1+"&&"+flag3+"="+(flag1&&flag3));
	System.out.println(flag1+"&&"+flag2+"="+(flag1&&flag2));
	System.out.println(flag2+"&&"+flag1+"="+(flag2&&flag1));
	System.out.println(flag2+"&&"+flag4+"="+(flag2&&flag4));


	System.out.println("----------------------||--------------------------");//전항이 true일 때에는 후항을 계산하지 않는다.
	System.out.println(flag1+"||"+flag3+"="+(flag1||flag3));
	System.out.println(flag1+"||"+flag2+"="+(flag1||flag2));
	System.out.println(flag2+"||"+flag1+"="+(flag2||flag1));
	System.out.println(flag2+"||"+flag4+"="+(flag2||flag4));

	//&&는 전항이 거짓이면 후항을 계산하지 않는다.
	flag1=false;
	flag2=false;
	flag3=false;
    flag3=(flag1=3<2) && (flag2=5<6);
	System.out.println("flag1:"+flag3+", flag2: "+flag1+", flag3:"+flag2);

	 int score=101;
	 //위의 score변수 할당된 값이 0~100 사이라면 true를 그렇지 않다면 false를 출력
	 //일반 논리 연산자를 사용하여 출력
	 //비교
	 System.out.println((score>-1)&&(score<=100));

	 System.out.println("------------------비트논리연산----------------------");
		 int i=25;
	     int j=13;

	System.out.println(i+"&"+j+"="+(i&j));//9

	     i=37;
		 j=7;
	System.out.println(i+"|"+j+"="+(i|j));//39
	     i=17;
		 j=12;
	System.out.println(i+"^"+j+"="+(i^j));//29


	}//main
}//class
