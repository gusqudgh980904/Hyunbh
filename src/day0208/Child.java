package day0208;

/**
 * Parent�� �ڽ�Ŭ����
 * @author user
 */
public class Child extends Parent {
	public Child() {
		this(100);
		System.out.println("�ڽ��� �⺻������");
	}//Child
	
	public Child(int i) {
		super();
		System.out.println("�ڽ��� ���ڻ�����"+i);
		
	}//Child



}//class
