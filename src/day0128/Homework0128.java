package day0128;

public class Homework0128 {
	
	private int eye;
	private int nose;
	private int mouth;
	private String name;
	
	public void setEye(int eye) {
		eye=2;
	}//setEye
	
	public int getEye() {
		return eye;
	}//getEye
	
	public void setNose(int nose) {
		nose=1;
	}//setNose
	
	public int getNose() {
		return nose;
	}//getNose
	
	public void setMouth(int mouth) {
		mouth=2;
	}//setMouth
	
	public int getMouth() {
		return mouth;
	}//getMouth
	
	public void setName(String name) {
		name="현병호";
	}//setName
	
	public String getName() {
		return name;
	}//getName
	
	/**
	 * @param eat 집에서 밥먹기
	 * @return	name+"가 집밥을 먹는다";
	 */
	public  String eat() {
		return name+"가 집밥을 먹는다";
	}//eat
	
	/**
	 * @param restaurant 식당이름
	 * @param price	가격
	 * @return 사먹기
	 */
	public String eat(String restaurant,int price) {
		return name+"가 식당에서"+restaurant+"에서 "+price+"원 내고 먹는다.";
	}//Override eat
	
	
	
}//class
