package day0201;

/**
 *	주민번호를 입력받아서 길이체크, -의 위치 체크, 생년월일, 성별, 나이, 띠를 구하는 일들을
 *	구현한 class<br>
 *	매개변수 있는 생성자를 사용하여 객체화한 후 사용<br>
 *	사용예)<br>
 *	Work0201 객체명=new Work0201("주민등록번호");<br>
 *	객체명.method명();으로 구현된 일을 사용.<br>
 *	강사님 풀이
 * @author user
 */
public class Work0201 {
	
	private String ssn;
	
	/**
	 * 입력받은 주민번호를 instance variable에 설정하는 생성자
	 * @param ssn 설정할 주민등록번호.
	 */
	public Work0201(String ssn) {//default constructor
		this.ssn=ssn;
	}//Work0201
	
	/**
	 * 객체(instance)가 가지고 있는 값(instance variable)을 반환하는 일
	 * @return 입력된 주민번호
	 */
	public String getSsn() {
		return ssn;
	}//getSsn
	
	/**
	 * instance variable에 설정되어있는 주민번호의 길이가 14자인지를 체크하는 일
	 * @return 주민번호 길이의 가부판정
	 */
	public boolean chkSsnLength() {//boolean형이기 때문에 어차피 true false가 나오기 때문에 
		//굳이 if문을 안써도 된다.
//		boolean ssnFlag=false;
//		if(ssn.length()==14) {
//			ssnFlag=true;
//		}//if
		return ssn.length()==14;//상수로 넣어주면 가독성 올라감
	}//chkSsnLength
	
	/**
	 * instance variable에 설정되어있는 주민번호의-이 정확한 위치에 존재하는지 체크하는 일
	 * @return 위치 가부
	 */
	public boolean chkHyphen() {
		return ssn.indexOf("-")==6;//상수로 넣어주면 가독성 올라감
	}//chkHyphen
	
	/**
	 * 주민번호에서 태어난 해를 연산한여 반환하는 일
	 * @return
	 */
	private int getBirthYear() {
		
		int birth=0;
		
		int tempYear=1800;
		int ssnYear=Integer.parseInt(ssn.substring(0,2));
		int genderFlag=ssn.charAt(7)-48;//880101-1
		
		if(genderFlag==1||genderFlag==2||genderFlag==5||genderFlag==6) {
			tempYear=1900;
		}else if(genderFlag==3||genderFlag==4||genderFlag==7||genderFlag==8) {
				tempYear=1800;
		}//
		birth=tempYear+ssnYear;
		
		return birth;
	}//getBirthYear
	
	/**
	 * 주민번호에서 생년월일을 구하여 반환하는 일
	 * @return 구해진 생년월일
	 */
	public String getBirth() {
		int year=getBirthYear();
		String month=ssn.substring(2, 4);
		String day=ssn.substring(4, 6);
		
		return year+"년"+month+"월"+day+"일";
	}//getBirth
	
	/**
	 * 주민번호에서 나이를 구하여 반환하는 일
	 * @return
	 */
	public int getAge() {
		return 2021-getBirthYear()+1;
	}//getAge
	
	/**
	 * 주민번호에서 성별을 구하여 반환하는 일
	 * @return
	 */
	public String getGender() {
		String gender="남자";
		int genderFlag=ssn.charAt(7)-48;//880101-1
		
		if(genderFlag%2==0) {
			gender="여자";
		}//if
		
		return gender;
	}//getGender
	
	/**
	 * 주민번호에서 띠를 구하여 반환하는 일
	 * @return
	 */
	public String getZodiac() {
		
		String[] zodiac= {"원숭이","닭","개","돼지","쥐","소","호랑이","토끼","용","뱀","말","양"};
		return zodiac [getBirthYear()%12];
	}//getZodiac
	

}//class
