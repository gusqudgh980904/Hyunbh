package day0121;

/**
 *	else if, ���� if<br>
 *	������ ���� ������ ���� �� ���<br>
 *	����)<br>
 *	if(���ǽ�){<br>
 *		���ǿ� ���� �� ������ �����,,,<br>
 *	}else if(���ǽ�){<br>
 *		���ǿ� ���� �� ������ �����,,,<br>
 *		.<br>
 *		.<br>
 *	}else}
 *		��� ���ǿ� ���� ���� �� ������ �����,,,<br>
 *	}
 * @author ����ȣ
 */
public class TestElseif {

	public static void main(String[] args) {
		int score=Integer.parseInt(args[0]);//-1,0,50,100,101
		
		System.out.println("�Է�����["+score+"]�� �Դϴ�.");
		if(score<0 ) {
			System.out.println("0������ �۾Ƽ� ����.");
		}else if(score>100) {
			System.out.println("100���� Ŀ�� ����.");
		}else {
			System.out.println("�Է¼���");
		}
		
		System.out.println();
		////������ �Է¹޾� ��������.
		//0~39������ -����
		//40~59������ - �ٸ����� Ȯ��
		//60~100������ -�հ�
		
		int score2=Integer.parseInt(args[1]);
		System.out.println("�Է�����["+score2+"]�� �Դϴ�.");
		if(score2>-1 && score2<40 ) {
			System.out.println("����");
		}else if(score2>39 && score2<60 ){//= (score<60)
			System.out.println("�ٸ����� Ȯ��.");
		}else if(score2>59 && score2<101 ) {//= (score<101)
			System.out.println("�հ�.");
		}//end if else
		
		System.out.println();
		//args[2]���� �̸��� �����µ� �ԷµǴ� �̸��� ����ȣ,���й�,������,�ڱ��,�ǿ���, ������ �� �ϳ��� �Էµ� �� �ִ�.
		//�Է��̸��� ����ȣ�� ���й� �̶�� "A�������л�",�������� �ڱ���̶�� "B�������л�"
		//�ǿ���, ������ ��� "C�������л�" �׷��� �ʴٸ� "D�������л�"�� ���.
		System.out.println(args[2]);
		if(args[2].equals("����ȣ")||args[2].equals("���й�")) {
		System.out.println("A�������л�");
			}
		else if(args[2].equals("������")||args[2].equals("�ڱ��")) {
			System.out.println("B�������л�");
			}
		else if(args[2].equals("�ǿ���")||args[2].equals("������")) {
			System.out.println("C�������л�");
			}
		else {
			System.out.println("D�������л�");
			}//else if end
		
		
		
	}//mian
}//class
