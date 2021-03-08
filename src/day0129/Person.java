package day0129;

/**
 *	����� ��ü�𵨸��Ͽ� ����Ư¡�� ������ Ŭ����<br>
 *	�����:��,��,��,�̸�<br>
 *	������:�Դ´�.-Overloading<br>
 *	�⺻�� ��������:int i=10,20...,������ ��������:new�� heap������ ��´�.
 *	���)<br>
 *		Ŭ������ ��ü��=new ������();<br>
 *		��ü��.method��();<br>
 *		
 * @author user
 */
public class Person {
	
	private int eye;
	private int nose;
	private int mouth;
	private String name;
	
	/**
	 * �� 2�� �� 1�� �� 1���� ����� �����ϴ� ������
	 */
	public Person() {
		this(2,1,1);
//		eye=2; 
//		nose=1;
//		mouth=1;
	}//Person
	
	/**
	 * ��, ��, ��,�� ������ �����Ͽ� ��� ��ü�� �����ϴ� ������
	 * @param eye
	 * @param nose
	 * @param mouth
	 */
	public Person(int eye, int nose, int mouth) {
		this.eye=eye;
		this.nose=nose;
		this.mouth=mouth;
	}//person
	
	//���� �����ϴ� method:setter method
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
	
	//���� ��� method:getter method
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
	 * ������ ��� ��ü�� ������ ���� �Դ� ���� ����.
	 * @return	��Դ� ��
	 */
	public String eat() {
		return name+"��(��) ������ ���� �Դ´�.";
	}//eat
	
	/**
	 * Method Overload(Overloading)<br>
	 * ������ ��� ��ü�� �Ĵ翡�� ���� ��Դ� �� ����.
	 * @param menu ��Դ� ��������
	 * @param price ���İ���
	 * @return ��Դ� ��.
	 */
	public String eat(String menu, int price) {
		return name+"�� �Ĵ翡�� "+menu+"��(��) "+price+"�� ���� �Դ´�.";
	}//eat
	
	
	
	
	
}//class
