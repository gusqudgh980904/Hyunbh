package day0121;

/**
 * ���� if���<br>
 * ���ǿ� ���� ��쿡�� �ڵ带 ������ ��<br>
 * ����<br>
 *     if( ���ǽ� ){<br>
 *         ���ǿ� ���� �� ������ �����...<br>
 *         }
 *         
 * @author ����ȣ
 */
public class Testif {

	public static void main(String[] args) {
         int num=Integer.parseInt(args[0]);
         
         if(num<0 ) {
		num=-num;//���밪���� ��ȯ�ϴ� �ڵ�, ��Ȳ�� �´� ��쿡�� ����Ǿ���Ѵ�.
         }//end if
		
		System.out.println(args[0]+"�� ���밪��"+num);
		
		//args[0]�� "Ȧ��"�� ��쿡�� 1�� ������ ¦���� ����� ���
		if(num%2==1) {
		System.out.println(num+1);//++num,num+=1,
		}
		
		
		//args[1]�� ����� �� args[1]�� "�Ѹ�"�� ��쿡�� "��! ����� �����"�� ���,
		System.out.println(args[1]);
		if(args[1].equals("�Ѹ�")) {
			System.out.println("��! ����� �����");			
		}//end if
		
		
	}//main
}//class
