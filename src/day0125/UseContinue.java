package day0125;

/**
 *	continue. 반복문의 실행을 건너 뛸때.
 * @author user
 */
public class UseContinue {

	public static void main(String[] args) {

		//1에서부터 100까지의 수중에 짝수만 출력
		for(int i=1;i<100;i++) {
			if(i%2==1) {
			continue;//증감식으로 실행위치를 변경
			}//end if
			
			System.out.println(i);
		}//end for
		
	}//main
}//class
