package day0219;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

/**
 *이름,나이,주소,성별,자바점수를 저장할 수 있는클래스를 작성하세요
 *위에 생성된 클래스를 사용하여 아래의 값을 넣어 객체를 생성하고 List에 추가하여 반환하는 method를 작성하세요
 *강인섭,25 서울시 강남구 역삼동,남,97
 *곽범수,27 서울시 강남구 논현동,남,81
 *권예원,26 서울시 동작구 상도동,여,90
 *김덕영,30 경기도 수원시 영통구,남,82
 *석지원,25 인천광역시 부평구 부평동,여,88
 * @author user
 * 
 * 
  - 위의 method를 호출하여 반환된 List를 매개변수로 받아 아래와 같이 출력하는 method를 작성하고
     호출하여 출력되도록 해보세요.( 데이터에서 여자만 출력한다.)
     권예원 26 서울시 동작구 상도동  	여 90
     석지원 25 인천광역시 부평구 부평동  여 88

 */
public class Homework0219 {
	
	
	public List<String> StuInfor(){
	List<String> list=new ArrayList<String>();
	StudentInformation kis=new StudentInformation("강인섭",25,"서울시 강남구 역삼동","남",97);
	StudentInformation kbs=new StudentInformation("곽범수",27,"서울시 강남구 논현동","남",81);
	StudentInformation kyw=new StudentInformation("권예원",26,"서울시 동작구 상도동","여",90);
	StudentInformation kdy=new StudentInformation("김덕영",30,"경기도 수원시 영통구","남",82);
	StudentInformation sjw=new StudentInformation("석지원",25,"인천광역시 부평구 부평동","여",88);
	
	list.add(kis.toString());
	list.add(kbs.toString());
	list.add(kyw.toString());
	list.add(kdy.toString());
	list.add(sjw.toString());
	
	return list;
	}//StuInfor
	
	
	/**
	 *     - 위의 method를 호출하여 반환된 List를 매개변수로 받아 아래와 같이 출력하는 method를 작성하여
     호출하여 출력해보세요. (Calendar를 사용하여 태어난 해를 구해 출력한다. )
   번호  이름 나이   태어난 해    주소                       자바점수
     1  강인섭 25       1997     서울시 강남구 역삼동     97
     2  곽범수 27       1995     서울시 강남구 논현동     81
     3  권예원 26       1996     서울시 동작구 상도동     90
     4  김덕영 30       1992     경기도 수원시 영통구     82
     5  석지원 25       1997     인천광역시 부평구 부평동   88
	 * @param list
	 */
	public void StuInfor1(List<String> list) {
		Homework0219 hm=new Homework0219();
		list=hm.StuInfor();
//		String[] stuArr=new String[list.size()];
//		list.toArray(stuArr);
		Calendar cal=new GregorianCalendar();
		
		String birthyear="";
		int year=cal.get(Calendar.YEAR);
		birthyear=String.valueOf(year);

		
		
		System.out.println("번호 이름 나이 태어난 해 주소 자바점수");
		for(String temp:list) {
			System.out.println(temp);
		}//for
	}//StuInfor1
	
	
	public void printStuInfor(List<String> list) {//출력method
		for(String temp:list) {
			System.out.println(temp);
		}//for
	}//printStuInfor

	
	public static void main(String[] args) {
		Homework0219 hm=new Homework0219();
		hm.printStuInfor(hm.StuInfor());
		System.out.println("----------------------------");
		hm.StuInfor1(null);
	}//main

}//class
