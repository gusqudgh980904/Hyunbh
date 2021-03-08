package day0219;

/**
 * 학생정보저장용 클래스.
 *이름,나이,주소,성별,자바점수를 저장할 수 있는클래스를 작성하세요
 *위에 생성된 클래스를 사용하여 아래의 값을 넣어 객체를 생성하고 List에 추가하여 반환하는 method를 작성하세요
 *강인섭,25 서울시 강남구 역삼동,남,97
 *곽범수,27 서울시 강남구 논현동,남,81
 *권예원,26 서울시 동작구 상도동,여,90
 *김덕영,30 경기도 수원시 영통구,남,82
 *석지원,25 인천광역시 부평구 부평동,여,88
 *setter method가 없는 이유/객체가 생성할 때 값을 넣어주고, 제시된 작업 중에는 값을 변경한는 일이 없기 때문에 별도의 setter method를 만들 필요가 없다. 
 * @author user
 */
public class StudentInformation {
	
	private String name;
	private int age;
	private String address;
	private String sex;
	private int javaScore;
	
	
	public StudentInformation() {
		
	}//StudentInformation
	
	
	public StudentInformation(String name, int age, String address,String sex, int javaScore) {
		this.name=name;
		this.age=age;
		this.address=address;
		this.sex=sex;
		this.javaScore=javaScore;
		
	}//StudentInformation


	public String getName() {
		return name;
	}


//	public void setName(String name) {
//		this.name = name;
//	}


	public int getAge() {
		return age;
	}


//	public void setAge(int age) {
//		this.age = age;
//	}


	public String getAddress() {
		return address;
	}


//	public void setAddress(String address) {
//		this.address = address;
//	}


	public String getSex() {
		return sex;
	}


//	public void setSex(String sex) {
//		this.sex = sex;
//	}


	public int getJavaScore() {
		return javaScore;
	}


//	public void setJavaScore(int javaScore) {
//		this.javaScore = javaScore;
//	}


	@Override
	public String toString() {
		return name+", " +age+","+address+","+sex+','+javaScore;
	}
	
	


}//class
