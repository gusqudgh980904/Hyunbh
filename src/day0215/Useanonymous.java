package day0215;

/**
 * �͸�Ŭ������ ���
 * @author user
 */
public class Useanonymous {
	
	public void useSuperInterA(SuperInterA sia) {
		sia.methodA();
	}//useSuperInterA
	
	public void  useSuperInterB(SuperInterB sib) {
		sib.methodA();
		sib.methodB();
	}
	

	public static void main(String[] args) {
		//��üȭ
		Useanonymous ua=new Useanonymous();
		//anonymous inner class�� ����Ͽ� method ȣ��
		ua.useSuperInterA(new SuperInterA(){
			@Override
			public void methodA() {
				test();
			}//methodA
			@Override
			public void methodB() {
				test();
			}//methodB
			//Ŭ������ �̸��� �����Ƿ� �����ڸ� ������ �� ����.
			
			//���ǵ� method�� anonymous inner class�ȿ����� ȣ��� �� �ִ�,.
			public void test() {
				System.out.println("anonymous inner class���� ������ method");
			}
		});
		
		ua.useSuperInterB(new SuperInterB(){
			@Override
			public void methodA() {
				System.out.println("methodA");
			}
			@Override
			public void methodB() {
				System.out.println("methodA");
			}
			
		});

	}//main
}//class
