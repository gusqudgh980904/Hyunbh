package day0217;

/**
 * Math class
 * �����ڰ� �������� �ʾ� ��ü������ ���� �ʰ� ����ϴ� Ŭ����
 * @author user
 */
public class UseMath {
	
	public UseMath() {
//		Math m=new Math();//�����ڰ� �����Ƿ� ��ü ������ �� ����.
		int i=-2021;
		double d=-2021.02;
		System.out.println(i+"�� ����"+Math.abs(i));
		System.out.println(d+"�� ����"+Math.abs(d));
		
		d=10.1;
		System.out.println(d+"�ø�"+Math.ceil(d));
		d=10.01;
		System.out.println(d+"�ø�"+Math.ceil(d));
		d=10.001;
		System.out.println(d+"�ø�"+Math.ceil(d));
		d=10.0;
		System.out.println(d+"�ø�"+Math.ceil(d));
		
		d=10.9;
		System.out.println(d+"�ݿø�"+Math.round(d));
		d=10.3;
		System.out.println(d+"�ݿø�"+Math.round(d));
		
		d=10.9;
		System.out.println(d+"����"+Math.floor(d));
		
		//����-casting���� ó��
		System.out.println(d+"����"+(int)d);
		

		double ran=Math.random();
		System.out.println("�߻��� ����:"+ran);
		System.out.println("������ ����:"+ran*10);//0~9���� 10���� ���� �ϳ� ���(�Ǽ� �߻�)
		System.out.println("������ ����:"+(int)(ran*10));//0~9���� 10���� ���� �ϳ� ���
		
		//1~10�� �� �� ����
		System.out.println("������ ����:"+((int)(ran*10)+1));//1~10���� 10���� ���� �ϳ� ���
		
		//A~Z���� �ƹ� ���ڳ� ���
		//A:65~Z:90
		System.out.println((char)((int)(Math.random()*26)+65));
		//a~z���� �ƹ� ���ڳ� ���
		//a:97~z:122
		System.out.println((char)((int)(Math.random()*26)+97));
		//0(48)~9(57)���� �ƹ� ���� ���
		System.out.println((char)((int)(Math.random()*10)+48));
		
	}//UseMath

	public static void main(String[] args) {
		new UseMath();
	}//main
}//class
