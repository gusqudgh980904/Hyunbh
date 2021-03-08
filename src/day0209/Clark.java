package day0209;

/**
 * 사람의 공통특징을 사용하는 클래스(Person을 상속받는 자식클래스)<br>
 * 눈,코,입,이름,먹는 일은 부모클래스에서 제공하는 것을 사용하고(코드의 재사용성),
 * 자신만의 특징을 정의하는 클래스.
 * @author user
 *
 */

public class Clark extends Person {
	
	public int power;
	
	/**
	 * 클락 클래스의 기본생성자
	 * 객체가 생성될 때 기본적으로 가지고 있어야할 값 설정
	 * 힘 레벨은 1~100까지 존재하고 클락은 힘의 레벨이 높은 상태인 80을 가지고서 태어난다.
	 */
	public Clark() {
		power=80;
	}//Clark
	
	@Override
	public String eat() {
		return getName()+"가 집에서 빵을 '와앙'하고 먹는다.";
	}//eat
	
	@Override
	public String eat(String menu, int price) {
		return getName()+"가 레스토랑에서 "+menu+"인 음식을 "+price+"$내고 사먹었다.";
	}//eat
	
	/**
	 * 클락의 힘을 설정하는 일. 크립토나이트가 입력되면 힘이 빠진다
	 * @param stone 돌의 종류
	 * @return
	 */
	public String power(String stone) {
		String result=stone;
		
		if (stone.equals("크립토나이트")) {
			power=0;
			result+="힘이 빠진다.~(_._)~";
		}else if(stone.equals("다이아몬드")) {
			power=80;
			result+="감사합니다.o(^^O)(O^^)o";
		}else {
			power=110;
			result+="(--+)";
		}//end else
		
		return result;
	}//power

	/**
	 * 클락은 영어,독일어,외계어 할 수 있다
	 */
	@Override
	public String[] language() {
		//일차원 배열을 기본형 형식으로 생성하고 반환
		String[] lang= {"영어","독일어","외계어"};
		return lang;
	}//language

}//class
