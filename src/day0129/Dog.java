package day0129;

/**
 *	0129 숙제
 * @author user
 */
public class Dog {
	
	public int eye;
	public int nose;
	public int tail;
	public int mouth;
	public String name;
	
	public Dog() {//기본 생성자
		eye=2;
		nose=1;
		mouth=1;
		tail=1;
	}//dog
	
	public Dog(int eye, int nose, int mouth, int tail) {
		this.eye=eye;
		this.nose=nose;
		this.mouth=mouth;
		this.tail=tail;
	}//Dog
	
	public void setEye(int eye) {
		this.eye=eye;
	}//setEye
	
	public void setNose(int nose) {
		this.nose=nose;
	}//setNose
	
	public void setMouth(int mouth) {
		this.mouth=mouth;
	}//setMouth
	
	public void setTail(int tail) {
		this.tail=tail;
	}//setTail
	
	public void setName(String name) {
		this.name=name;
	}//setName
	
	
	public int getEye() {
		return eye;
	}//getEye
	
	public int getNose() {
		return nose;
	}//getNose
	
	public int getMouth() {
		return mouth;
	}//getMouth
	
	public int getTail() {
		return tail;
	}//setTail
	
	public  String getName() {
		return name;
	}//getName
	
	
	public String cute() {
		return name+"가(이) 애교를 부린다";
	}//bark
	
	/**
	 * @param man ~에게
	 * @param time 몇번
	 * @return	짖는일
	 */
	public String bark(String man,int time) {
		return name+"가(이) "+man+"에게 "+time+"번"+" 짖는다";
	}//bark

}//class
