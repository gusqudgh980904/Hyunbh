package day0118;
/**
     Constant ���.(������ ���ó�� ����ϱ�)<br>
	 ���� (class field���� ���� ����.)<br>
	  public static final �������� �����=��;<br>
      ���)<br>
	     �����<br>
		 Ŭ������.�����
*/
class Constant{
	   //class field
	   public static final int MAX_SCORE=100;//���α׷� �ȿ��� ���Ǵ� ���ذ��� ������ ��.
	   public static final int MIN_SCORE=0;

	public static void main(String[] args) {
		System.out.println("�ְ���:"+MAX_SCORE);//�����
		System.out.println("������:"+Constant.MIN_SCORE);//Ŭ������.�����

        int myScore=90;

		System.out.println("ȹ������:"+myScore);

        myScore=91;
       //MAX_SCORE=99;// ����� ������ ������ ġ �̿ܿ��� �ٲ� �� ����.

        System.out.println("�� ������ "+myScore+"�� �̰�, �ְ������� "+Constant.MAX_SCORE+
		"�� �Դϴ�. �ְ�������  �� �������� ���̴� "+(MAX_SCORE-myScore)+"�� �Դϴ�.");    
		
       
         //java.lang package���� �����ϴ� Wrapper class�� ��� ���.
		 System.out.println("Byte�� �ּҰ�:"+Byte.MIN_VALUE+", �ִ밪:"+Byte.MAX_VALUE);


       byte b1=10;
	   byte b2=20;
	   int result=b1+b2;//������ ����� 4byte�� �߻� �׷��� Error

	   System.out.println(b1+"+"+b2+'='+result);


	}//main
}//class
