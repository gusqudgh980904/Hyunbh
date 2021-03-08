package day0127;

/**
 *	Ŭ�������� ���� �̸��� method�� ������ ���� �� �ִ� Overload���<br>
 *	��Ģ)����������, ��ȯ���� �޶� �ǰ� ���Ƶ� �ȴ�. 
 *	method���� ���ƾ� �ϰ� �Ű������� �ݵ�� �޶�� �Ѵ�.
 *	
 * @author user
 */
public class TestOverload {
	
	
	/**
	 * �� �Ѱ��� ����ϴ� ��
	 */
	public void printStar() {
		System.out.println("��");
	}//printStar
	
	/**
	 * �Է¹��� ����� ���� ����ϴ� ��.
	 * method Overload(Overloading)
	 * @param count ����� ���� ����
	 */
	public void printStar(int count) {
		for(int i=0;i<count;i++) {
			System.out.print("��");	
		}//endfor
	}//printStar
	

	public static void main(String[] args) {
		TestOverload to=new TestOverload();
		to.printStar();//���� ��.(��ȯ�� ���� �Ű����� ���� ��)
		to.printStar(1);//���� ��.(��ȯ�� ���� �Ű����� �ִ� ��)
		/*
		 * Overload �� printStar method�� ����Ͽ� �Ʒ��� ���� ���·� �� ���
		 *  �� 
		 *  �� ��
		 *  �� �� ��
		 *  �� �� �� ��
		 *  �� �� �� �� ��
		 */
		for(int i=0;i<5;i++) {
			to.printStar(i);
			System.out.println();
		}//for
			
	}//main
}//class
