package day0125;

/**
 *	��üȭ �� ����� �� �ִ� instance variable�� ���.<br>
 *	��üȭ:Ŭ������ ��ü�� = new Ŭ������();<br>
 *	���:��ü��.������<br>
 * @author user
 */
public class InstanceVariable {
	
	int i;//Ŭ������ ���� �Ǿ��ٰ� �޸𸮿� �ε����� �ʴ´�.
	int j;

	public static void main(String[] args) {
		//�ν��Ͻ� ������ static�������� ���� ���Ұ�.(static ������ Ŭ������ �����ϸ� ���� ���� �ε��Ǳ�
		//������ �޸𸮿� �ε���� ���� ���� �� �� �� ���� instance ������ ����� �� ����.
//		System.out.println(i);
//		System.out.println(j);
		
		//��üȭ:instance ������ ����ϱ����� 1������ �ؾ��� �ڵ�.
		//Ŭ������ ��ü�� = new Ŭ������();
		InstanceVariable iv=new InstanceVariable();//�ν��Ͻ� �������� heap�޸𸮿� load�ȴ�.
		//������ ��ü���� instance variable���� ���� ������ ��ü��.���������� �ش� ������ ����� �� �ִ�.
		iv.i=2021;
		System.out.println("iv��ü�� ���� i���� :"+iv.i);
		System.out.println("iv��ü�� ���� j���� :"+iv.j);
		
		
	}//main
}//class
