package day0121;

/**
 *	if~else<br>
 *	둘 중 하나의 코드를 싱행해야할 때 사용.<br>
 *	문법<br>
 *	if(조건식){<br>
 *		조건에 맞을 때 수행할 문장들,,<br>
 *	}else{
 *		조건에 맞지 않을 때 수행할 문장들,,<br>
 *	}
 * @author 현병호
 */
public class TestifElse {

	public static void main(String[] args) {
			//수를 입력받아 입력받은 수를 출력한 후 홀수인지 짝수인지를 출력
			int num=Integer.parseInt(args[0]);//값을 입력받아 수로 변환
			System.out.print(num+"은(는)");
		
			if(num%2==0) {
				System.out.print("짝수");
			}else {
				System.out.print("홀수");
			}//end else
			
			System.out.println();
			//수가 "양수"인지 "음수"인지를 출력하는 코드
			int num1=Integer.parseInt(args[0]);
			System.out.print(num1+"은(는)");
			if(num1>=0) {
				System.out.print("양수");
			}else {
				System.out.print("음수");
			}//end else
			
				System.out.println();
			//args[1]의 값을 받아서 int형의 score변수에 저장하고 점수가 0~100 사이라면 "유효점수"를 출력하고
			//그렇지 않다면 "무효점수" 출력하세요. 범위비교
				
			int score=Integer.parseInt(args[1]);//경곗값 테스트
			
			System.out.print(score+"점");
			if(score>-1&&score<101) {
				System.out.print("유효점수");
			}else {
				System.out.print("무효점수");
			}//end else
		
	}//main
}//class
