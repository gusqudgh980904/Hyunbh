package day0122;

/**
 *	�ݺ���:Ư���ڵ带 ������ ���� ��Ű�� ����.
	for:�ڵ��� ���۰� ���� �� �� ����ϴ� �ݺ���.<br>
	����)<br>
		for(�ʱⰪ;���ǽ�;��.���ҽ�){<br>
			�ݺ����๮���...<br>
			}
 * @author user
 */
public class TestFor {

	public static void main(String[] args) {
		
//		for(int i=0;i<10;i++) {
//		 System.out.println("�ȳ��ϼ���?"+i);	
//		}//end for
		
//		System.out.println();
//		//1~100���� 1�� �����ϴ� ���� ������ ���.
//		for(int j=1; j<101; j++) {
//		System.out.print(j+" ");
//		}//end for
		
//		System.out.println();
//		//100~1���� 1�� �����ϴ� ���� ������ ���.
//		for(int j=100; j>0; j--) {
//			System.out.print(j+" ");
//		}//end for
		
		System.out.println();
		//1~100���� Ȧ���� ������ ���
		int count=0;
		for(int k=1; k<101;k=k++) {//k++,k=k+1,k+=1
			count++;
			//if(k%2!=0) {
			System.out.print(k+" ");
			//}//end for
		}//end for
		System.out.println();
		System.out.println("�ݺ�Ƚ��:"+count);
		
		//1~9�������ϴ� for.
		//������ 2�� ���.
		for(int a=1;a<10;a++) {
			System.out.print("2X"+a+"="+2*a+" ");
		}//end for
		
		System.out.println();
		//�빮�� A~Z���� ���
		for(char a='A';a<='Z';a++) {
			System.out.print(a+" ");
		}//end for
		
		System.out.println();
		//1~65535 ������ ����, ������ �빮��,������ �ҹ��ڸ� ���
		for(int m=1;m<65534;m++) {//'0'=48,'A'=65,'a'=97 ���������� char�̸� 65534
			if(m>47&&m<58||(m>64&&m<91)||(m>96&&m<123)) {//m>47&&m<58(���������ڵ�), m>64&&m<91(���빮�ڹ���)
			System.out.print((char)m+" ");									//m>96&&m<123(���ҹ��ڹ���)
		}//end if
		}//end for
		
		System.out.println();
		//1�������� 100������ �����. 1+2+3+4+5+6+...+1000=5050
		int sum=0;//������
		for(int a=1; a<101;a++) {
			sum+=a;//sum=sum+a;
		}//end for
		System.out.print("1~100������ �� :"+sum);
		
		
		
		
		
		
		
	}//main
}//class
