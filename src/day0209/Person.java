package day0209;

/**
 *	사람을 객체모델링하여 공통특징을 추출한 클래스로 직접 객체화 하는 것(abstract class)보다 자식클래스를
 *	만들어 상속을 해주는 목적으로 설계된 클래스.<br>
 *	명사적:눈,코,입,이름<br>
 *	동사적:먹는다.-Overloading<br>
 *	기본형 데이터형:int i=10,20...,참조형 데이터형:new로 heap영역에 담는다.
 *	사용)<br>
 *		클래스명 객체명=new 생성자();<br>
 *		객체명.method명();<br>
 *		
 * @author user
 */
public abstract class Person {
	
	private int eye;
	private int nose;
	private int mouth;
	private String name;
	
	/**
	 * 눈 2개 코 1개 입 1개인 사람을 생성하는 생성자
	 */
	public Person() {
		this(2,1,1);
//		eye=2; 
//		nose=1;
//		mouth=1;
	}//Person
	
	/**
	 * 눈, 코, 입,의 갯수를 설정하여 사람 객체를 생성하는 생성자
	 * @param eye
	 * @param nose
	 * @param mouth
	 */
	public Person(int eye, int nose, int mouth) {
		this.eye=eye;
		this.nose=nose;
		this.mouth=mouth;
	}//person
	
	//값을 설정하는 method:setter method
	public void setEye(int eye) {
		this.eye=eye;
	}//setEye
	
	public void setNose(int nose) {
		this.nose=nose;
	}//setNose
	
	public void setMouth(int mouth) {
		this.mouth=mouth;
	}//setMouth
	
	public void setName(String name) {
		this.name=name;
	}//setName
	
	//값을 얻는 method:getter method
	public int getEye() {
		return eye;
	}//getEye
	
	public int getNose() {
		return nose;
	}//getNose
	
	public int getMouth() {
		return mouth;
	}//getMouth
	
	public  String getName() {
		return name;
	}//getName
	
	/**
	 * 생성된 사람 객체가 집에서 음식 먹는일을 구현하도록 강제성을 부여하는 method
	 * @return	집에서 음식을 먹는일 
	 */
	public abstract String eat();
	
	/**
	 * Method Overload(Overloading)<br>
	 * 생성된 사람 객체가 식당에서 밥을 사먹는 일 구현하도록 강제성을 부여하는 method.
	 * @param menu 사먹는 음식종류
	 * @param price 음식가격
	 * @return 사먹는 일.
	 */
	public abstract String eat(String menu, int price);

	/**
	 * 생성된 사람 객체가 구사하는 언어를 구현하도록 강제성을 부여하는 method
	 * @return 구사할 수 있는 언어들
	 */
	public abstract String[] language();
	
	
	
	
	
}//class
