package day0201;

public class UseWork0201 {

	public static void main(String[] args) {

		String ssn="980904-2111111";
		
		Work0201 work=new Work0201(ssn);
		
		if(work.chkSsnLength()) {//주민번호의 글자수가 14자인지 체크
			if(work.chkHyphen()) {//주민번호의 -위치 체크
				System.out.println("입력주민번호:"+work.getSsn());
				System.out.println("생년월일:"+work.getBirth());
				System.out.println("나이:"+work.getAge());
				System.out.println("성별:"+work.getGender());
				System.out.println("띠:"+work.getZodiac());
			}else {
				System.out.println("머선129");
			}//if else
			System.out.println("글자수 맞는 경우");
		}else {
			System.out.println(work.getSsn()+"은(는) 주민번호의 글자수가 맞지 않습니다 글자수를 확인해주세요.");
		}//if else
		
		
		
		
		
		
	}//main
}//class
