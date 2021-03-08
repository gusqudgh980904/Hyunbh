package day0126;

/**
 *	method�� 4���� ����.
 * @author user
 */
public class MethodType {
	
	/**
	 * �������� ��.��ȯ�� ����, �Ű����� ���� ��
	 */
	public void typeA() {
		System.out.println("�������� ��.");
	}//typeA
	
	/**
	 * �������� ��.��ȯ�� ����, �Ű����� �ִ� ��.
	 * @param i
	 */
	public void typeB(int i) {
		System.out.println("�������� ��.i="+i);
	}//type b
	
	/**
	 * ���� ��.-��ȯ�� �ְ�, �Ű����� ���� ��.
	 * @return
	 */
	public int typeC() {
		return 2021;
	}//type C
	
	/**
	 * 	���� ��-��ȯ�� �ְ� �Ű����� �ִ� ��.
	 * @param i
	 * @return
	 */
	public int typeD(int i) {
		long l=i;//i*2; int*int=����� int�� �ʰ��ϴ� ���� ���ͼ� �߸��� �������� long������ �Ҵ�.
		l*=2;//l=l*2 long*int=long���� �߻��ǰ� long�������� �������� �������� �Ҵ�.
		if(l>Integer.MAX_VALUE) {//�Էµ� ���� int���������� ���� �ִ������ �ʰ��Ѵٸ� long ������ int���� �ְ� ���� �Ҵ��ϰ�
			l=Integer.MAX_VALUE;
	}//end if
		
		
		return (int)l;//long�� int�� ��ȯ�Ͽ� ��ȯ.
	}//typeD
	
	
	
	
	
	public static void main(String[] args) {
		//1.��üȭ
		MethodType mt=new MethodType();//Ŭ������ ��ü��=new Ŭ������();
		//2.method ȣ��
		mt.typeA();//�������� ��. ��� ȣ���ϵ� ���� ����� ���´�.
		mt.typeB(0);//�������� ��. �Է°��� ���� �ٸ� ����� ���´�.
		
		int temp=mt.typeC();//���� ��. ��� ȣ���ϵ� ������ ����� ��ȯ�ȴ�.		
		System.out.println(temp+" "+mt.typeC());
		
		int temp1=mt.typeD(25);//������. �Է°��� ���� �ٸ� ����� ��ȯ�ȴ�.
		System.out.println("������:"+temp1);
		
	}//main
}//class
