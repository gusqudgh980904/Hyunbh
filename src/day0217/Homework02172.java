package day0217;

/**
 * ����2.int[] 6���� ���� ����� 1~45������ ���� �� �̾Ƽ� �迭�� ��� �濡 �ְ� ��ȯ�ϴ� method�� �����.(���� ��ȣ�� �迭�� �� �� ����.
 * ���� method�� ȣ���Ͽ� ��ȯ�� �ζ� ��ȣ�� ����ϴ� ���� �ϴ� method�ۼ�
 * @author user
 */
public class Homework02172 {
	
	public Homework02172() {
		double ran=Math.random();
		int[] lotto=new int[6];
		lotto[0]=(int)((ran*45)+1);
		lotto[1]=(int)((ran*45)+1);
		lotto[2]=(int)((ran*45)+1);
		lotto[3]=(int)((ran*45)+1);
		lotto[4]=(int)((ran*45)+1);
		lotto[5]=(int)((ran*45)+1);
		for(int i:lotto) {
			System.out.println(i);
		}
	}//Homework02172

	public static void main(String[] args) {
		new Homework02172();
		
	}//main

}//class
