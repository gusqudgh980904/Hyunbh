package day0129;

/**
 *	�������� ���.<br>
 *	�����ڰ� �����ڸ� �ϳ��� �������� ������ �����Ϸ��� �⺻�����ڸ� �������ش�.<br>
 *	�����ڰ� �ϳ��� ������ �⺻�����ڴ� �������� �ʴ´�.<br>
 * @author user
 */
public class UseConstructor {
	
	public UseConstructor() {
		System.out.println("�⺻ ������");
		test();//���� ������ methodȣ��:method�̸��� �Է�
		new UseConstructor(10);
//		UseConstructor(10);//error �����ڴ� new�� ���� methodó�� ���� ȣ�� �� �� ����.
	}//UseConstructor
	
	public UseConstructor(int i) {
		System.out.println("�Ű����� �ִ� ������");
	}//UseContstructor
	
	public void test() {
		System.out.println("method!~!");
	}//test

	public static void main(String[] args) {
		//�����ڴ� ��üȭ�Ͽ� ȣ�� ����.
		new UseConstructor();
//		UseConstructor uc=new UseConstructor();
//		uc.test();//������ �ٸ��� ��ü�� ����� ��ü�� ���ؼ� method�� ȣ��
		
		
		
		
		

	}//main
}//class
