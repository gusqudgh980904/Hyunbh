package day0115;
    /**115�����Դϴ�
	*/
	
//*Ŭ�������� ���ڷ� ������ �� �����ϴ�.
class Homework0115 {
	public static void main(String[] args) {
		//������ 2021�� 1�� 15�� �Դϴ�.
		int year=2021;//�⵵
		int month=1;//��
		int day=15;//��    *�������� a b c�� ���� ���� �ǹ̸� �� �� �ְ� ����ܾ�� �����غ�����. 
		System.out.println("������ "+ year+'��'+month+'��'+day+'��'+"�Դϴ�.");


		//�� �̸��� �̴ϼ��� HBH�Դϴ�.
		char FirstAndLastInitial='H';
		char SecondInitial='B';
		System.out.println("�� �̸��� �̴ϼ��� "+FirstAndLastInitial+SecondInitial+FirstAndLastInitial+"�Դϴ�.");//*int ���� ���ڰ� �ƴ� �ڵ�� ��µ�


		//�޴� �÷�0.4 ������ �÷�0.3 ��Ƚ÷��� 0.7�Դϴ�.  
		double leftEye=0.4;//�޴� �÷�  *������ ������ ���� �� �����
		double rightEye=0.3;//������ �÷�
		float bothEye=0.7f;//��� �÷�
		System.out.println("�޴� �÷�"+leftEye+" ������ �÷�"+rightEye+" ��� �÷���"+bothEye+"�Դϴ�.");

        
	   //�⺻�� ���������� boolean���� �⺻ ���� false�� �����˴ϴ�.
	  // boolean T=true;
       boolean F=false;
	   System.out.print("�⺻�� ���������� boolean���� �⺻ ���� "+F+"�� �����˴ϴ�.");
	
	  
	  }//main //local ����
}//class //instance ����, static ����
