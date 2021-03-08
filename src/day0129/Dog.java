package day0129;

/**
 *	0129 ����
 * @author user
 */
public class Dog {
	
	public int eye;
	public int nose;
	public int tail;
	public int mouth;
	public String name;
	
	public Dog() {//�⺻ ������
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
		return name+"��(��) �ֱ��� �θ���";
	}//bark
	
	/**
	 * @param man ~����
	 * @param time ���
	 * @return	¢����
	 */
	public String bark(String man,int time) {
		return name+"��(��) "+man+"���� "+time+"��"+" ¢�´�";
	}//bark

}//class
