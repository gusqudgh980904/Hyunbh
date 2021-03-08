package day0122;

/**
 *	반복문:특정코드를 여러번 실행 시키는 문장.
	for:코드의 시작과 끝을 알 때 사용하는 반복문.<br>
	문법)<br>
		for(초기값;조건식;증.감소식){<br>
			반복수행문장들...<br>
			}
 * @author user
 */
public class TestFor {

	public static void main(String[] args) {
		
//		for(int i=0;i<10;i++) {
//		 System.out.println("안녕하세요?"+i);	
//		}//end for
		
//		System.out.println();
//		//1~100까지 1씩 증가하는 수를 옆으로 출력.
//		for(int j=1; j<101; j++) {
//		System.out.print(j+" ");
//		}//end for
		
//		System.out.println();
//		//100~1까지 1씩 감소하는 수를 옆으로 출력.
//		for(int j=100; j>0; j--) {
//			System.out.print(j+" ");
//		}//end for
		
		System.out.println();
		//1~100까지 홀수만 옆으로 출력
		int count=0;
		for(int k=1; k<101;k=k++) {//k++,k=k+1,k+=1
			count++;
			//if(k%2!=0) {
			System.out.print(k+" ");
			//}//end for
		}//end for
		System.out.println();
		System.out.println("반복횟수:"+count);
		
		//1~9씩증가하는 for.
		//구구단 2단 출력.
		for(int a=1;a<10;a++) {
			System.out.print("2X"+a+"="+2*a+" ");
		}//end for
		
		System.out.println();
		//대문자 A~Z까지 출력
		for(char a='A';a<='Z';a++) {
			System.out.print(a+" ");
		}//end for
		
		System.out.println();
		//1~65535 사이의 숫자, 영문자 대문자,영문자 소문자를 출력
		for(int m=1;m<65534;m++) {//'0'=48,'A'=65,'a'=97 데이터형이 char이면 65534
			if(m>47&&m<58||(m>64&&m<91)||(m>96&&m<123)) {//m>47&&m<58(숫자유니코드), m>64&&m<91(영대문자범위)
			System.out.print((char)m+" ");									//m>96&&m<123(영소문자범위)
		}//end if
		}//end for
		
		System.out.println();
		//1에서부터 100까지의 합출력. 1+2+3+4+5+6+...+1000=5050
		int sum=0;//누적합
		for(int a=1; a<101;a++) {
			sum+=a;//sum=sum+a;
		}//end for
		System.out.print("1~100까지의 합 :"+sum);
		
		
		
		
		
		
		
	}//main
}//class
