package day0209;

/**
 * �߻�Ŭ������ �ڽ�Ŭ����
 * �ݵ�� �θ�Ŭ������ abstract method�� ��� �����ؾ��Ѵ�
 * @author user
 */
public class AbstractSub extends AbstractSuper {
	
	public AbstractSub() {
		System.out.println("�ڽ�Ŭ������ ������");
	}//AbstractSub
	
	//abstract method ����(Override)
	@Override
	public  void typeA() {
		System.out.println("���� ��:��ȯ�� ����,�Ű����� ���� ��");
	}//typeA
	
	@Override
	public  void typeB(String msg) {
		//instanceMethod();//�θ�Ŭ������ �Ϲ� method
		System.out.println("������:��ȯ�� ����,�Ű����� �ִ� ��");
//		super.typeA();//�߻�method�� ���� ȣ���� �� ����
	}//typeB
	
	@Override
	public  int typeC() {//������:��ȯ���ְ�,�Ű����� ���� ��
		return 0;
	}//typeC
	
	public int typeD(String m) {//������:��ȯ���ְ�,�Ű����� �ִ� ��
		return m.length();
	}

	public static void main(String[] args) {
//		new AbstractSuper();//���� ��üȭ �� �� ����.
		AbstractSub as=new AbstractSub();//�ڽ�Ŭ������ ��üȭ ���� ������ ��ü�� �����ȴ�.
		as.typeB("���� ��");
		
		
		

	}//main
}//class
