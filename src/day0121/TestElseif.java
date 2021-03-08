package day0121;

/**
 *	else if, 다중 if<br>
 *	연관된 여러 조건을 비교할 때 사용<br>
 *	문법)<br>
 *	if(조건식){<br>
 *		조건에 맞을 때 수행할 문장들,,,<br>
 *	}else if(조건식){<br>
 *		조건에 맞을 때 수행할 문장들,,,<br>
 *		.<br>
 *		.<br>
 *	}else}
 *		모든 조건에 맞지 않을 때 수행할 문장들,,,<br>
 *	}
 * @author 현병호
 */
public class TestElseif {

	public static void main(String[] args) {
		int score=Integer.parseInt(args[0]);//-1,0,50,100,101
		
		System.out.println("입력점수["+score+"]점 입니다.");
		if(score<0 ) {
			System.out.println("0점보다 작아서 실패.");
		}else if(score>100) {
			System.out.println("100보다 커서 실패.");
		}else {
			System.out.println("입력성공");
		}
		
		System.out.println();
		////점수를 입력받아 점수판정.
		//0~39까지는 -과락
		//40~59까지는 - 다른점수 확인
		//60~100까지는 -합격
		
		int score2=Integer.parseInt(args[1]);
		System.out.println("입력점수["+score2+"]점 입니다.");
		if(score2>-1 && score2<40 ) {
			System.out.println("과락");
		}else if(score2>39 && score2<60 ){//= (score<60)
			System.out.println("다른점수 확인.");
		}else if(score2>59 && score2<101 ) {//= (score<101)
			System.out.println("합격.");
		}//end if else
		
		System.out.println();
		//args[2]에는 이름이 들어오는데 입력되는 이름은 현병호,이학민,곽범수,박기범,권예원, 정은아 중 하나가 입력될 수 있다.
		//입력이름이 현병호나 이학민 이라면 "A강의장학생",곽범수나 박기범이라면 "B강의장학생"
		//권예원, 정은아 라면 "C강의장학생" 그렇지 않다면 "D강의장학생"을 출력.
		System.out.println(args[2]);
		if(args[2].equals("현병호")||args[2].equals("이학민")) {
		System.out.println("A강의장학생");
			}
		else if(args[2].equals("곽범수")||args[2].equals("박기범")) {
			System.out.println("B강의장학생");
			}
		else if(args[2].equals("권예원")||args[2].equals("정은아")) {
			System.out.println("C강의장학생");
			}
		else {
			System.out.println("D강의장학생");
			}//else if end
		
		
		
	}//mian
}//class
