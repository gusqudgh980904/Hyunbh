package day0209;

/**
 * �θ�Ŭ����->��� �ڽ�Ŭ������ ����� ���� Ư¡ ����<br>
 * @author user
 */
public class Parent {
	String name;
	int age;
	//final ���������ڰ� ���Ǹ� �ڽ�Ŭ�������� Override �� �� ����.
	public /*final*/ void printName() {
		System.out.println("�̸�"+name);
	}//printName
	
	public void printAge() {
		System.out.println("����"+age);
	}//printAge
		
	

}//class
