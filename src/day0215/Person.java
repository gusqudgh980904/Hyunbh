package day0215;

/**
 *	����� ��ü�𵨸��Ͽ� ����Ư¡�� ������ Ŭ������ ���� ��üȭ �ϴ� ��(abstract class)���� �ڽ�Ŭ������
 *	����� ����� ���ִ� �������� ����� Ŭ����.<br>
 *	�����:��,��,��,�̸�<br>
 *	������:�Դ´�.-Overloading<br>
 *	�⺻�� ��������:int i=10,20...,������ ��������:new�� heap������ ��´�.
 *	���)<br>
 *		Ŭ������ ��ü��=new ������();<br>
 *		��ü��.method��();<br>
 *		
 * @author user
 */
public abstract class Person {
	
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
	 * ������ ��� ��ü�� ������ ���� �Դ����� �����ϵ��� �������� �ο��ϴ� method
	 * @return	������ ������ �Դ��� 
	 */
	public abstract String eat();
	
	/**
	 * Method Overload(Overloading)<br>
	 * ������ ��� ��ü�� �Ĵ翡�� ���� ��Դ� �� �����ϵ��� �������� �ο��ϴ� method.
	 * @param menu ��Դ� ��������
	 * @param price ���İ���
	 * @return ��Դ� ��.
	 */
	public abstract String eat(String menu, int price);

	/**
	 * ������ ��� ��ü�� �����ϴ� �� �����ϵ��� �������� �ο��ϴ� method
	 * @return ������ �� �ִ� ����
	 */
	public abstract String[] language();
	
	
	
	
	
}//class
