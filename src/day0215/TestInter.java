package day0215;

/**
 * �������̽�:���� ����� ������ ����ϱ� ���ؼ�.<br>
 * ������� �������� ��ü���� �������� ���̱� ���ؼ�.
 * @author user
 */
public interface TestInter {
	
//	int i; //��ü�� ũ�⿡ ������ �ִ� �ν��Ͻ� ������ ���� �� ����.
	public static final int i=100;//���
	
//	public TestInter() {//��ü�� ������ �� ���� ���� �� �̾��� �����ڸ� ���� �� ����. 
//	}
	
//	public void test() {//���� �� �� �ִ� �Ϲ� method�� ���� �� ����.
//	}
	
	//abstract�� �� abstract method
	public abstract void methodA();
	
	//abstract�� ���� ���� abstract method
	public void methodB();
	
	//default method:body�� �ִ� method(���� �� �� �ִ� method)
	public default void methodC(int i) {
		System.out.println("default method:i="+i);
	}//methodC



}//interface
