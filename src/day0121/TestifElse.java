package day0121;

/**
 *	if~else<br>
 *	�� �� �ϳ��� �ڵ带 �����ؾ��� �� ���.<br>
 *	����<br>
 *	if(���ǽ�){<br>
 *		���ǿ� ���� �� ������ �����,,<br>
 *	}else{
 *		���ǿ� ���� ���� �� ������ �����,,<br>
 *	}
 * @author ����ȣ
 */
public class TestifElse {

	public static void main(String[] args) {
			//���� �Է¹޾� �Է¹��� ���� ����� �� Ȧ������ ¦�������� ���
			int num=Integer.parseInt(args[0]);//���� �Է¹޾� ���� ��ȯ
			System.out.print(num+"��(��)");
		
			if(num%2==0) {
				System.out.print("¦��");
			}else {
				System.out.print("Ȧ��");
			}//end else
			
			System.out.println();
			//���� "���"���� "����"������ ����ϴ� �ڵ�
			int num1=Integer.parseInt(args[0]);
			System.out.print(num1+"��(��)");
			if(num1>=0) {
				System.out.print("���");
			}else {
				System.out.print("����");
			}//end else
			
				System.out.println();
			//args[1]�� ���� �޾Ƽ� int���� score������ �����ϰ� ������ 0~100 ���̶�� "��ȿ����"�� ����ϰ�
			//�׷��� �ʴٸ� "��ȿ����" ����ϼ���. ������
				
			int score=Integer.parseInt(args[1]);//��찪 �׽�Ʈ
			
			System.out.print(score+"��");
			if(score>-1&&score<101) {
				System.out.print("��ȿ����");
			}else {
				System.out.print("��ȿ����");
			}//end else
		
	}//main
}//class
