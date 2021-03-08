package day0126;

/**
 *	method�ۼ�����
 *	method�� ���� �� instance variable�� ����Ͽ� ��ó���� �ϴ� ���.
 *	=>instance method
 *
 *	method�� ���鶧 instance variable�� ������� �ʰ� ��ó���� �ϴ� ���.
 *	=>static method
 * @author user
 */
public class UseMethod {
	int i;//instance variable
	
	/**
	 * instance method
	 */
	public void instanceMethod() {
		System.out.println(i);
	}//instanceMethod
	
	/**
	 * static method
	 */
	public static void Method() {
		System.out.println("static method: i ���Ұ�");
	}//staticMethod

	public static void main(String[] args) {
		//instance method ȣ��.
// 		  instanceMethod();//���� ȣ�� �Ұ�
		//1.��üȭ:Ŭ������ ��ü��=new Ŭ������();
			UseMethod um=new UseMethod();
		//2.method ȣ��:
			um.instanceMethod();
			
		// um.staticMethod();//static method�� Ư�� ��ü�� ���� method�� �ƴϹǷ� ��ü��.method��
		//�� �������� ������� �ʴ´�.
			
		///static method ȣ��: ��üȭ ���� Ŭ������.method������ ȣ��
			UseMethod.Method();
	}//main
}//class
