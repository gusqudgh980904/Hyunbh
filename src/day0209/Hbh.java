package day0209;

 
/**
 * 0208 숙제
 * 자신과 타인을 차별화 할 수 있는 특징을 생각하고, Person클래스를 상속받아
 * 자신의 특징을 정의한 클래스를 생성하세요.
 * @author user
 */
public class Hbh extends Person {
	
	private int height;
	
	/**
	 * 기본생성자 내 키
	 */
	public Hbh() {
		
		height=180;
	}//Hbh
	
	@Override
	public String eat() {
		return getName()+"가 집에서 밥을 먹는다.";
	}//eat
	
	
	@Override
	public String eat(String menu,int price) {
		return getName()+"가 집에서 "+menu+"인 음식을 "+price+"원 내고 배민에서 시켜먹는다.";
	}//eat
	
	/**
	 * 상대방과 내 키를 비교
	 * @param yourheight
	 * @return
	 */
	public String compare(int yourheight) { //비교하는 일을 잘하는 건가요?
		String result="";
		if(height<yourheight) {
			result=yourheight+"보다 내가 작다.";
		}else if(height>yourheight) {
			result=yourheight+"보다 내가 크다.";
		}else {
			result=yourheight+"랑 똑같다.";
		}//end if
		
		return result;
	}//compare

	@Override
	public String[] language() {
		String[] lang= {"한국어","영어","일본어"};
		return lang;
	}//language
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}//Homework0208 extends Person
