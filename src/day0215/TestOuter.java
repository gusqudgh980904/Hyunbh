package day0215;

/**
 * ����Ŭ������ �ν��Ͻ� ����ó�� ����� �� ����ϴ� inner class.
 * Ư�� ������ ������ ��ü�ȿ��� �̺�Ʈ�� ó���� ��(������ Ŭ���� �ϳ������ͼӵ� �̺�Ʈ�� ó���� ��)
 * @author user
 */
public class TestOuter {
	int outI;
	
	public TestOuter() {
		System.out.println("�ٱ�Ŭ������ ������");
	}//TestOuter
	
	public void outMethod() {
		System.out.println("�ٱ� Ŭ������ method"+outI);
		//�ٱ�Ŭ���������� ����Ŭ������ �ڿ��� ������� ����� �� ����.
//		inI=10
//		inMethod();
		//�ٱ�Ŭ���������� ����Ŭ������ �ڿ��� ����ҷ��� ��üȭ�� �ؾ��Ѵ�.
		//�ٱ�Ŭ������ ��ü���� this�� ��ü�� �� �ִ�.
//		TestOuter.Inner in=this.new Inner();
		//this�� ��������
		TestOuter.Inner in=new Inner();
		
		
		
		
		
		in.inMethod();
		System.out.println("--------------------outMethod ��------------------");
	}//outMethod
	
	////////////////////////inner class ����/////////////////////////
	public class Inner{
		int inI;
		
		public Inner() {
			System.out.println("���� Ŭ������ ������");
		}//Inner
		
		public void inMethod() {
			System.out.println("����Ŭ������ method:"+inI);
			//����Ŭ���������� �ٱ�Ŭ������ ������ method�� ����� �� �ִ�.
			System.out.println("�ٱ�Ŭ������ method:"+outI);
//			outMethod();
			
		}//inMethod
	}//Inner
	
	////////////////////////inner class ��/////////////////////////

	public static void main(String[] args) {
		//1.�ٱ� Ŭ���� ��üȭ
		TestOuter to=new TestOuter();//�ٱ�Ŭ������ ��üȭ �Ǿ��ٰ� ����Ŭ������ ��üȭ ���� �ʴ´�.
		//�ٱ�Ŭ������ ��ü�δ� ����Ŭ������ �ڿ����� ����� �� ����.
//		to.inI=10
//		to.inMethod();
		to.outMethod();
		//2.���� Ŭ���� ��üȭ:�ٱ�Ŭ������.����Ŭ������ ��ü��=�ٱ�Ŭ������ü��.new ����Ŭ����������();
		Inner in=to.new Inner();
		in.inMethod();
		
		

	}//main
}//class
