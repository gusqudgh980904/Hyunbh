package day0204;

import java.awt.Frame;

/**
 * Parent Ŭ������ �ڽ�Ŭ����
 * @author user
 */
public class Child extends Parent {
	int j;
	
	public  Child() {
		System.out.println("�ڽ�Ŭ������ ������");
	}//Child
	
	public void useJ() {
		System.out.println("�ڽ�Ŭ������ method:"+j);
	}//useJ
	

	public static void main(String[] args) {
		//�ڽ�Ŭ������ ����Ͽ� ��üȭ
		Child c=new Child();
		//�ڽ�Ŭ������ ��ü�� ���� �θ� Ŭ������ �ڿ��� ����� �� �ִ�
		System.out.println("�ڽ��� ����:"+c.j);
		c.useJ();
		//�ڵ��� �� ��뼺:�θ�Ŭ������ �ڿ�(����,method)
		System.out.println("�θ��� ����:"+c.i);
		c.useI();
		//Object method ȣ��:toString()->��ü�� �ּҸ� ���ڿ��� ��ȯ�ϴ� ��
		System.out.println(c.toString());
		//java.lang.Object Ŭ�������� �����ϴ� ��� method�� ��� Ŭ�������� ����� �� �ִ�
		//�ڵ��� ���뼺
		Integer i=new Integer(10);
		System.out.println(i.toString());
		String s=new String("Hello");
		System.out.println(s.toString());
		Frame f=new Frame();
		System.out.println(f.toString());
		
		
		
		
		
	}//main
}//class
