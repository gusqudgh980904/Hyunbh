package day0203;

/**
 *	�� ����: �Ű������� ���������������� ����Ѵٸ�, ������ü�� �ּҰ� �״�� ���޵ȴ�.
 * @author user
 */
public class CallByReference {
	
	private int i;
	private int j;
	
	public void swap(CallByReference cbr) {
		int temp=0;
		temp=cbr.i;
		cbr.i=cbr.j;
		cbr.j=temp;
		System.out.println("swap method �� i:"+cbr.i+",cbr.j:"+cbr.j);
	}//swap

	public static void main(String[] args) {
		CallByReference cbr=new CallByReference();
		cbr.i=100;
		cbr.j=200;
		System.out.println("swap �� cbr.i:"+cbr.i+",cbr.j:"+cbr.j);
		cbr.swap(cbr);
		System.out.println("swap �� cbr.i:"+cbr.i+",cbr.j:"+cbr.j);
	}//main
}//class
