package day0125;

/**
 *	while<br>
 *	���۰� ���� �𸦶� ����ϴ� �ݺ���.<br>
 *
 *	while(���ǽ�){<br>
 *		�ݺ����๮��<br>
 *	}
 * @author user
 */
public class TestWhile {

	public static void main(String[] args) {
		int i=0;//�ʱⰪ
		while(i<10) {//���ǽ�
			System.out.println("�ȳ��ϼ���?="+i);//�ݺ����๮��
			i++;//��.���ҽ�
		}//end while
		
		System.out.println();
		//////////////���� �Է¹޾� ���� 2�ܿ��� 9�� ������ ������ �Է¹��� ������ �������� ���.
//		int k=3;
//		int j=0;
//		while(j<9) {
//			j++;
//			System.out.println(k+"X"+j+"="+k*j);
//		}
		System.out.println();
		int l=Integer.parseInt(args[0]);
		
		if(l>1&&l<10) {
		int	a=1;
			while(a<10) {
				System.out.println(l+"x"+a+"="+l*a);
				a++;
			}//end while
		}//end if
		
		///////////////while�� ���� loop///////////
		while(true) {
			System.out.println("���ѷ���");
			break;//break�� ��������� �ݺ����� ���� ������.
		}//end while
		System.out.println("���ѷ��� break");
		
		
		
		
		
	}//main
}//class
