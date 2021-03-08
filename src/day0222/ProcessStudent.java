package day0222;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * 학생정보를저장하는클래스를 사용하여, 학생정보를 처리하는 일을 구현한 클래스.
 * @author user
 */
public class ProcessStudent {
	
	
	/**
	 * 학생의 정보를 저장하기 위한 일.
	 * @return 저장된 학생의 정보.
	 */
	public List<StudentVO> setStudentInfo(){
		List<StudentVO> list=new ArrayList<StudentVO>();
		//리스트에 데이터를 추가
		list.add(new StudentVO("강인섭",25,"서울시 강남구 역삼동","남",97));
		list.add(new StudentVO("곽범수",27,"서울시 강남구 논현동","남",81));
		list.add(new StudentVO("권혜원",26,"서울시 동작구 상도동","여",90));
		list.add(new StudentVO("김덕영",30,"경기도 수원시 영통구","남",82));
		list.add(new StudentVO("석지원",25,"인천광역시 부평구 부평동","여",88));
		
		
		
		
		return list;
	}//setStudentInfo
	
	
	/**
	 * 학생의 정보를 사용하여 출력하는 일.(단순번호,태어난해를 출력)
	 * @param list
	 */
	public void printStudentInfo(List<StudentVO> list) {
		System.out.println("번호\t이름\t나이\t태어난 해\t주소\t\t\t자바점수");
		System.out.println("--------------------------------------------------------------------------------------");

		Calendar cal=Calendar.getInstance();//추상클래스이므로 new로 객체화하지 않는다.
		int nowYear=cal.get(Calendar.YEAR);//태어난 해를 연산하기 위해 사용할 변수
		StudentVO sVO=null;//리스트의 Element 값을 저장하기 위한 객체.
		for(int i=0;i<list.size();i++) {
			sVO=list.get(i);
			System.out.printf("%d\t%s\t%d\t%d\t%s\t%d\n",i+1,sVO.getName(),sVO.getAge(),nowYear-sVO.getAge()+1,
					sVO.getAddress(),sVO.getJavaScore());
		}//for
		
//		if(list.size()==0) 
//		if(sVO==null) 
		if(list.isEmpty()) {//데이터가 없을 시
			System.out.println("데이터가 없어요");
		}//if
		
	}//printStudentInfo
	

	/**
	 * 학생의 정보를 사용하여 성별에 대한 구분 출력을 하는 일.
	 * @param list 학생의 정보
	 * @param gender 출력할 학생의 성별
	 */
	public void printStudentGenderType(List<StudentVO> list,String gender) {
		System.out.println("이름\t나이\t주소\t성별\t점수");
		System.out.println("--------------------------------------------------------------------------------------");
		
		//입력된 성별이 "남"또는 "여"가 아니라면 기본값으로 "남"을 설정
		if (!(gender.equals("남")||gender.equals("여"))) {
			gender="남";
		}//if
		
		for(StudentVO sVO:list) {//인덱스를 사용할 것이 아니므로 개선된 for를 사용
			if(gender.equals(sVO.getGender())) {//입력 성별과 일치한다면 출력을 수행
				System.out.printf("%s\t%d\t%s\t%s\t%d \n",sVO.getName(),sVO.getAge(),sVO.getAddress(),sVO.getGender()
						,sVO.getJavaScore());
			}//if
		}//for
		
		if(list.isEmpty()) {//데이터가 없을 시
			System.out.println("학생정보가 존재하지 않습니다.");
		}//if
		
	}//printStudentGenderType

	
	public static void main(String[] args) {
		ProcessStudent ps=new ProcessStudent();
		List<StudentVO> list=ps.setStudentInfo();//저장된 학생의 정보를 받는다.
		ps.printStudentInfo(list);
		System.out.println();
		ps.printStudentGenderType(list, "남");
	}//main

}//class
