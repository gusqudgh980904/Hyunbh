package day0218;

import java.util.Random;

public class UseRandom {
	
	public UseRandom() {
		
		//1.��üȭ
		Random random=new Random((int)(Math.random()*100)); //seed random
		//2.��
		//������ �����
		int i=random.nextInt();
		System.out.println("�߻��� ����:"+i);
		System.out.println("������ ����:"+i%10);
		System.out.println("������ �������� ���밪:"+Math.abs(i%10));
		
		//������ ��� ��
		int j=random.nextInt(10);
		System.out.println("�߻��� ����:"+j);
		
		//�Ǽ��� ��� ��
		double d=random.nextDouble();
		System.out.println("�߻��� �Ǽ�:"+d);
		System.out.println("�߻��� �Ǽ����� ����:"+d*5);
		System.out.println("�߻��� �Ǽ����� ��������.�������:"+(int)(d*5));
		
		//�Ҹ����
		boolean b=random.nextBoolean();
		System.out.println("�߻��� boolean:"+b);
		
		
		
		
	}//UseRandom

	public static void main(String[] args) {
		new UseRandom();

	}//main
}//class
