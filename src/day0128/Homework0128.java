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
		name="����ȣ";
	}//setName
	
	public String getName() {
		return name;
	}//getName
	
	/**
	 * @param eat ������ ��Ա�
	 * @return	name+"�� ������ �Դ´�";
	 */
	public  String eat() {
		return name+"�� ������ �Դ´�";
	}//eat
	
	/**
	 * @param restaurant �Ĵ��̸�
	 * @param price	����
	 * @return ��Ա�
	 */
	public String eat(String restaurant,int price) {
		return name+"�� �Ĵ翡��"+restaurant+"���� "+price+"�� ���� �Դ´�.";
	}//Override eat
	
	
	
}//class
