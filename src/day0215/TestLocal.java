package day0215;

/**
 * method�ȿ� Ŭ������ �����ϴ� ����Ŭ����
 * @author user
 */
public class TestLocal {
	int outI;
	
	public TestLocal() {
		System.out.println("�ٱ�Ŭ������ ������");
	}//TestLocal
	
	
	//parameter�� final�� ���̸� method ���ο����� �������� ����, �Է��� �״�ҳ� ����ϰ� �ȴ�.
	public void methodA(int paramA,final int paramB) {
		int locA=0;
		final int locB=0;
		
		////////////////////////����Ŭ���� ����//////////////////////
		class Local{
			
			int i;
			public Local() {
				System.out.println("����Ŭ���� ������");
			}//Local
			
			public void locMethod() {
				System.out.println("����Ŭ������ method,����Ŭ������ instance ����:"+i);
//				paramA=10;//final�� �پ����� ���� �Ű�����,�������� ������ ������ �Ұ�
//				locA=100;
				System.out.println("method�� �Ű�����"+paramA+", final:"+paramB);
				System.out.println("method�� ��������"+locA+",final:"+locB);
			}//locMethod
			
		}//Local
		////////////////////////����Ŭ���� ��//////////////////////
		//����Ŭ������ ��üȭ
		Local loc=new Local();
		loc.locMethod();//����Ŭ���� method ȣ��
	}//methodA
	
	public void methodB() {
		//�ܺ� method �ȿ����� ����Ŭ������ ����� �� ����.
//		methodA().
	}//methodB

	public static void main(String[] args) {
		TestLocal tl=new TestLocal();
		tl.methodA(2021, 2);
		
		
		

	}//main
}//class
