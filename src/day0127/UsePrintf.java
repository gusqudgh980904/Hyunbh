package day0127;

/**
 *	Variable Arguments�� ����� ��� method
 * @author user
 */
public class UsePrintf {

	public static void main(String[] args) {
//		System.out.format("%d",10);
//		System.out.printf("%d",10);

		System.out.printf("������� %d\n",2021);
		System.out.printf("������� %c\n",'d');
		System.out.printf("�Ǽ���� %f\n",0.123);
		System.out.printf("���ڿ���� %s\n","������ ������");
		
		//��� �ڸ��� ��� ����-���������� &6d 6ĭ��� ���.
		System.out.printf("[%6d][%3d][%4d]\n",2021, 1, 27);
		System.out.printf("[%6c][%3c][%4c]\n",'a', 'b', 'c');
		//%.2f ��ü �ڸ����� �������� �ʰ� �Ҽ��� ���� ���ڸ��� ���.
		System.out.printf("[%7.1f][%.2f]\n",12.345,0.550);
		System.out.printf("[%6s][%5s]\n","�ڹ�"," Html");
		
		//��� �ڸ��� ������ ����-���� ���� 
		System.out.printf("[%-6d][%-3d][%-4d]\n",2021, 1, 27);
		System.out.printf("[%-6c][%-3c][%-4c]\n",'a', 'b', 'c');
		//%.2f ��ü �ڸ����� �������� �ʰ� �Ҽ��� ���� ���ڸ��� ���.
		System.out.printf("[%-7.1f][%.2f]\n",12.345,0.550);
		System.out.printf("[%-6s][%-4s]\n","�ڹ�"," Html");
		
		System.out.printf("%d%c%4d%s\n",12,'a',46,"���� �߿���");//������ ������ �������
		
		
		int year=2021,month=1,day=27;
		//������ 2021�� 1��  27�� �Դϴ�.
		System.out.println("������"+year+"��"+month+"��"+day+"�� �Դϴ�.");
		System.out.printf("������ %d�� %d�� %d���Դϴ�",year,month,day);
	}//main
}//class
