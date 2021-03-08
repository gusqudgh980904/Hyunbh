package day0127;


public class Homework0127 {
	//1.숫자를 매개변수로 입력받아 입력받은 숫자까지의 누적합을 구해서 반환하는 method를 작성한 후 호출하여 반환
	//값을 받고 출력해보세요.
	public int hbh(int a) {//a=어디까지 더할지
		int sum=0;//총합을 저장하는 변수
		for(int c=0;c<=a;c++) {
			sum+=c;//총합
		}//for
		return sum;
		}//hbh
	
	
	
	
	//2.숫자를 매개변수로 입력받아 입력받은 숫자가 10보다 컸을 때에 해당 숫자까지 3의 배수 합을 구해 출력하는 일을
	//하는 method를 작성하세요(입력받은 숫자가 10보다 작다면"10보다 큰 값을 입력해주세요"를 출력합니다.)
	//2번 숙제는 가변일이에요. 반환형이 존재하는 문제가 아니에요,
	public void number(int b) {//범위지정
		int sum1=0;
		if(b>10) {//이렇게 짜셔합니다. 감사합니다   조건을 넣어보세요
		for(int d=0;d<=b;d++) {//d를 b까지 더한다.
			if(d>10&&d%3==0) {//d가 10보다크고&&3으로 나눠질때
				System.out.println(sum1+=d);//총합을 더한다
			}//if
		}//for
		}else{
				System.out.println("10보다 큰 값을 입력해주세요");
		}//else if
			}//number
	
	//3.나이를 매개변수로 입력받아 태어난 해를 반환하는 method를 작성한 후 호출하여 반환되는 값을 받아 출력
		public int year(int e) {
			int birth=0;
			birth=2021-e;//태어난해=지금년도-지금나이
			return birth;
		}//year
		
	//4.구구단 전체단을 출력하는 일을 하는 method를 작성하세요
		public void x() {
			for(int i=2;i<10;i++) {//단
				System.out.print(i+"단시작 ");
				for(int j=1;j<10;j++) {//곱해지는수
				System.out.print(i+"X"+j+"="+i*j+" ");
			}//end for
				System.out.println(i+"단끝");
		}//end for
		}//x
		
	//5.입력받은 구구단 하나만 출력하는 일을 하는 method를 작성하세요.(4번 5번의 method는 Override사용)
		public void x(int i) {
				if(i<10) {
				System.out.print(i+"단시작 ");
				for(int j=1;j<10;j++) {//곱해지는수
				System.out.print(i+"X"+j+"="+i*j+" ");
			}//end for
				System.out.println(i+"단끝");
		}//end for
			
		}

	
	public static void main(String[] args) {
		//1.
		Homework0127 hw=new Homework0127();
		System.out.println(hw.hbh(100));
		System.out.println();
		//2.
		hw.number(15);
		System.out.println();
		//3.
		System.out.println("당신이 태어난 해는 "+hw.year(23)+"년도 입니다.");
		System.out.println();
		//4.
		hw.x();
		System.out.println();
		//5.
		hw.x(7);
	}//main
}//class
