package day0115;
/**
�⺻�� ���������� ���.
�⺻�� ���������� ����Ͽ� ������ ������ ������� �����Ѵ�.
*/

class PrimitiveType {
	public static void main(String[] args) {
      //////////////////////////////////////������//////////////////////////////////
	    byte a=10;
		short b=20;
		int c=30;
		long d=40;
		long e=3000000000L;//����� L �Ǵ� l�� �ٿ��ش�.
		//���� literal�� ũ��� 4byte�̹Ƿ� int�� ������ �ʰ��ϴ� ������� ����� �� ����.
    
    System.out.println("byte :" +a+" , short"+b+",int : "+c+",long : "+d+","+e);

     //////////////////////////////////////������///////////////////////////////////
       char f='A';//�ڵ尪(�����ڵ� ���...)
	   char g='0';
	   char h='��';
	   //char�� ����ϸ� �ڵ尪�� ���� ���ڸ� ���
	System.out.println("char:"+f+","+g+","+h);
					
////////////////////////////////////////�Ǽ���///////////////////////////////////
	   	float i=3.14F;//����� �ʼ� F,f
		double j=3.14;//����� ���� ����
		double k=3.14D;

		System.out.println("float: "+i+" ,double: "+j+", "+k);

//////////////////////////////////////Boolean��/////////////////////////////////
      // boolean l=true;
       boolean m=false;
      System.out.println("boolean: "+i+", "+ m);



	}//main
}//class
