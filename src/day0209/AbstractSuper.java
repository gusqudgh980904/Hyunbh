package day0209;

/**
 * ��Ӱ��迡�� �θ�Ŭ������ ������ ��
 * @author user
 */
public abstract class AbstractSuper {
	int i;//instance variable
	
	public AbstractSuper() {
		System.out.println("�߻�Ŭ������ ������");
	}//AbstractSuper
	
	public void instanceMethod() {
		System.out.println("�Ϲ� method");
	}//instanceMethod
	
	////////�߻�method/////////
	 public abstract /*final*/ void typeA();//abstract method�� final�� ����� ������.
	 public abstract void typeB(String msg);
	 public abstract int typeC();
	 public abstract int typeD(String msg);
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	//public static void main(String[] args) {
		//new AbstractSuper(); �߻�Ŭ������ ���� ��üȭ �� �� ����
	//}//main
}//class
