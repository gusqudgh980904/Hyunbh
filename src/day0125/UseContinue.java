package day0125;

/**
 *	continue. �ݺ����� ������ �ǳ� �۶�.
 * @author user
 */
public class UseContinue {

	public static void main(String[] args) {

		//1�������� 100������ ���߿� ¦���� ���
		for(int i=1;i<100;i++) {
			if(i%2==1) {
			continue;//���������� ������ġ�� ����
			}//end if
			
			System.out.println(i);
		}//end for
		
	}//main
}//class
