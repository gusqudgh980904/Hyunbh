package day0125;

public class Homework0125 {

	public static void main(String[] args) {
		//1.while�� ����Ͽ� ������ ��ü ���� ���η� ���.
			int i=1;
		while(i<9) {
			i++;
			int j=1;
			while(j<10) {
				System.out.println(i+"x"+j+"="+i*j);
				j++;
			}//end while
		}//end while
			System.out.println();
			
			
			
			
			
		//2.while�� ����Ͽ� 1~100������ ���� ���.
			int sum=0;
			int a=1;
			while (a<101) {
				sum+=a;
				a++;
			}//end while
			System.out.print("1���� 100������ ����"+sum);	
				System.out.println();
				
				
				
				
				
		//3.do~while�� ����Ͽ� 1~100������ ¦���� ����ϴ� �ڵ带 �ۼ��ϰ� 50�϶�
		//	break�� ����Ͽ� �ݺ����� ���������� �ڵ��ۼ�.
				int b=2;
				do {
						System.out.print(b+" ");
						b=b+2;
						if(b==52) {
							break;
						}
				}while(b<101);
				System.out.println();
				
		//4.���� for�� ����Ͽ� �Ʒ��� ���� ����� �ǵ��� �ۼ�.
		/*	1 1 1 1 1
		 * 	1 0 0 0 1
		 * 	1 0 0 0 1
		 * 	1 0 0 0 1
		 * 	1 0 0 0 1
		 *	1 1 1 1 1  
		 */
		for(int z=0;z<5;z++) {
				for(int x=0;x<5;x++) {
				System.out.print((z==0||z==4||x==0||x==4 ?1:0)+" ");
			}
				System.out.println();
		}
				
				
				
				
				

	}//main
}//class
