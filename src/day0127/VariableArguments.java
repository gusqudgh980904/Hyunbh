package day0127;

/**
 *	�ϳ��� �Ű������� �������� ���� �־ ����ϴ� Variable Arguments
 * @author user
 */
public class VariableArguments {
	
	public void year(int...a) {
//		V.A�� method �ȿ��� �迭�� ó���ȴ�.
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}//for
	}//year
	
	
	//�Ű������� ���� �� ���� �� �� V.A�� ���� ���������� ���� �� �ִ�.
	public  void temp(int a,int c,int...b) {
	}

	public static void main(String[] args) {
		VariableArguments va=new VariableArguments();
		va.year(1,5,5,2,5,2,5);
		
	}//main
}//class
