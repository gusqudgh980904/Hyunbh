package day0125;

public class Homework0125 {

	public static void main(String[] args) {
		//1.while을 사용하여 구구단 전체 단을 세로로 출력.
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
			
			
			
			
			
		//2.while을 사용하여 1~100까지의 합을 출력.
			int sum=0;
			int a=1;
			while (a<101) {
				sum+=a;
				a++;
			}//end while
			System.out.print("1부터 100까지의 합은"+sum);	
				System.out.println();
				
				
				
				
				
		//3.do~while을 사용하여 1~100까지의 짝수만 출력하는 코드를 작성하고 50일때
		//	break를 사용하여 반복문을 빠져나가는 코드작성.
				int b=2;
				do {
						System.out.print(b+" ");
						b=b+2;
						if(b==52) {
							break;
						}
				}while(b<101);
				System.out.println();
				
		//4.다중 for를 사용하여 아래와 같은 출력이 되도록 작성.
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
