package day0215;

/**
 * �������̽��� ����ϱ� ���� Ŭ����
 * �������̽��� Ŭ������ ����(implements)�Ͽ� ����� �� �ִ�.(��ü������)
 * @author user
 */
public  class UseInterface implements TestInter {
	
	//���� �������̽��� �߻�method�� �ݵ�� Override�ؾ��Ѵ�.
	@Override
	public void methodA() {
		System.out.println("methodA");
	}//methodA
	
	@Override
	public void methodB() {
		System.out.println("���������� ���� ������ ���������ڷ� �޶����� �ǰ�,��ȯ��,method��,�Ű������� ���ƾ� ��");
	}//methodB
	
	@Override
	public void methodC(int i) {
		System.out.println("default method�� Override:"+i);
	}//methodC
		

	public static void main(String[] args) {
		//�������̽��� ���� ��üȭ�� �� �� ����.
//		TestInter ti=new TestInter();
		//���� Ŭ������ �ּҸ� ������ �� �ִ�.(��ü������)
		TestInter ti=new UseInterface();
		System.out.println(ti);
		ti.methodA();//����Ŭ������ method�� ȣ�� �ȴ�.(�������̽��� �߻�method�� ȣ��Ǵ� ���� �ƴϴ�.)
		ti.methodB();//����Ŭ������ method�� ȣ�� �ȴ�.(�������̽��� �߻�method�� ȣ��Ǵ� ���� �ƴϴ�.)
		ti.methodC(2021);//default method
		
	}//main
}//class
