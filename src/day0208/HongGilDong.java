package day0208;

/**
 * 사람의 공통특징을 사용하는 클래스(Person을 상속받는 자식클래스)<br>
 * 눈,코,입,이름,먹는 일은 부모클래스에서 제공하는 것을 사용하고(코드의 재사용성),
 * 자신만의 특징을 정의하는 클래스.
 * @author user
 *
 */
public class HongGilDong  extends Person {
	
	private int level;
	
	/**
	 * 홍길동 클래스의 기본생성자
	 * 객체가 생성될 때 기본적으로 가지고 있어야할 값 설정
	 * 싸움 레벨은 1~10까지 존재하고 홍길동은 싸움 레벨이 높은 상태인 6을 가지고서 태어난다.
	 */
	public HongGilDong() {
		
		level=6;
		
	}//HongGildong
	
	/**
	 * 부모클래스가 제공하는 기능이 자식클래스에서 맞지 않을 때, 자식클래스의 상황과 맞도록 method를 재정의한다.
	 */
	@Override
	public String eat(String menu,int price) {
		//자식 클래스의 name변수가 private 접근지정자를 가지고 있어서,자식클래스에서는 직접 사용할 수 없다.
		//따라서 자식 클래스에 부모클래스의 private 자원을 사용하기 위해 getter method를 사용한다.
		return getName()+"이 주막에서 "+menu+"인 음식을 "+price+"냥 내고 사먹었다.";
	}//eat
	
	/**
	 * 자식클래스의 자신만의 특징(싸우는일)
	 * @param yourLevel
	 * @return
	 */
	public String fight(int yourLevel) {
		String result="";//empty
		
		if(level<yourLevel) {//상대방의 레벨이 높은 경우:지는 경우
			result=yourLevel+"에게 졌다.OTL";
			level--;//레벨감소
			if(level<1) {
				level=1;
			}//if
			
		}else if(level>yourLevel) {//상대방의 레벨이 낮은 경우:이기는 경우
			result=yourLevel+"에게 이겼다.b(^.^)d";
			level++;
			if(level>10) {
				level=10;
			}//if
			
		}else {//비기는 경우
			result=yourLevel+"에게 비겼다.(--+)";
			//레벨의 변화가 없다.
		}//end else
		
		return result;
		
	}//fight
	
	public int getLevel() {
		System.out.println("method를 호출하는 객체의 heap주소"+this);
//		System.out.println("method를 호출하는 객체의 부모 heap주소"+super);
		return level;
	}//getLevel
	

}//class
