package day0121;

/**
 * 단일 if사용<br>
 * 조건에 맞을 경우에만 코드를 실행할 때<br>
 * 문법<br>
 *     if( 조건식 ){<br>
 *         조건에 맞을 때 수행할 문장들...<br>
 *         }
 *         
 * @author 현병호
 */
public class Testif {

	public static void main(String[] args) {
         int num=Integer.parseInt(args[0]);
         
         if(num<0 ) {
		num=-num;//절대값으로 변환하는 코드, 상황에 맞는 경우에만 실행되어야한다.
         }//end if
		
		System.out.println(args[0]+"의 절대값은"+num);
		
		//args[0]이 "홀수"인 경우에만 1이 더해진 짝수로 만들어 출력
		if(num%2==1) {
		System.out.println(num+1);//++num,num+=1,
		}
		
		
		//args[1]를 출력한 후 args[1]이 "둘리"인 경우에만 "어! 도우너 어서오고"를 출력,
		System.out.println(args[1]);
		if(args[1].equals("둘리")) {
			System.out.println("어! 도우너 어서오고");			
		}//end if
		
		
	}//main
}//class
