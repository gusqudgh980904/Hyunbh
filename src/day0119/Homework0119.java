package day0119;
class Homework0119{
	public static void main(String[] args) {
	//1.
	int i=20;
    System.out.println(~i+1);

	//2.
	int temp1=10,temp2=20;
	System.out.println(++temp1+temp2--);//31++temp1+temp2 ��������� ���ǰ� --�� ����Ǽ� temp2--��(19)��
    //++temp1+temp2--=31                     //�Ʒ��� ������
    System.out.println("temp1="+temp1+"/ temp2="+temp2);//temp1�� 10���� 1�� �ö� ���� �״�� ����
    //temp1=11 temp2=19                                              //tepm2�� �� �Ŀ��� -1�̵ȵ� �����ͼ� ���� ����
    

	 //3.
	 int temp3=0;
	 temp3=Integer.MAX_VALUE<<4;
     System.out.println(temp3);
;	 //System.out.println(~Integer.MAX_VALUE>>27); ���� �Ѱ�

	 //4.
	 /*maxvalue &(��Ʈ����) 2byte |(��Ʈ��ĥ��) ^(��Ʈ����)
	 0111 1111 1111 1111 1111 1111 1111 1111
	 &
	 0000 0000 0000 0000 1111 1111 1111 1111
	 */
    System.out.println(Integer.MAX_VALUE&0x0000FFFF);

	}//main
}//class
