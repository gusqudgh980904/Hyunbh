package day0217;

/**
 * ����1. ����,���빮��,���ҹ��ڷ� ������ �ӽ� ��й�ȣ�� 8�ڷ� �����Ͽ�
 * char[]�� ��ȯ�ϴ� method�� �����
 * ���� method�� ȣ���Ͽ� ��ȯ�� char[]�� �����Ͽ� ����غ�����
 * @author user
 */
public class Homework0217 {
	
	public Homework0217() {
		double num=(int)(Math.random()*10);//0~9
		char upperCase=((char)((int)(Math.random()*26)+65));//A~Z
		char lowerCase=((char)((int)(Math.random()*26)+97));//a~z
		char[] password = new char[8];
		
		System.out.println(password);
	}//Homework0217

	public static void main(String[] args) {
		new Homework0217();
	}//main

}//class
