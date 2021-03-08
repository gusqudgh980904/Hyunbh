package day0125;

/**
 *	다중 for(중첩 for)의 사용.<br>
 *	문법)<br>
 *	for(초기값;조건식;증.감소식){<br>
 *		for(초기값;조건식;증.감소식){<br>
 *			반복수행문장들...<br>
 *		}<br>
 *}<br>
 * @author user
 */
public class TestFor2 {

	public static void main(String[] args) {
		//구구단 전단 출력.
		//구구단은 2~9단까지 존재
		for(int i=2;i<10;i++) {//단
			System.out.println(i+"단시작");
			for(int j=1;j<10;j++) {//곱해지는수
			System.out.println(i+"X"+j+"="+i*j);
		}//end for
			System.out.println(i+"단 끝");
	}//end for
		
	System.out.println();
	////////////////////////////////////////////////
	/* i  j  i  j  i j  i  j i  j
	 * 0 0 0 1 0 2 0 3 0 4
	 * 1 1 1 2 1 3 1 4
	 * 2 2 2 3 2 4
	 * 3 3 3 4
	 * 4 4
	 */
	  for(int i=0;i<5;i++) {
		  for(int j=i;j<5;j++) {
			  System.out.print(i+" "+j+" ");  
		  }//end for
		  System.out.println();
	  }//end for
	
	  /*
	   * 0 0
	   * 1 0 1 1
	   * 2 0 2 1 2 2
	   * 3 0 3 1 3 2 3 3
	   * 4 0 4 1 4 2 4 3 4 4 
		*/
	  
	  System.out.println();
	  for(int i=0;i<5;i++) {
		  for(int j=0;j<=i;j++) {
			  System.out.print(i+" "+j+" ");  
		  }//end for
		  System.out.println();
	  }//end for
	  
	  System.out.println();
	  /////구구단 옆으로 찍기/////// 수평출력이 아니고 수직출력으로 바꿔 보세요.
	  for(int i=1;i<10;i++) {
		  for(int j=2;j<10;j++) {
			  System.out.print(j+"X"+i+"="+j*i+" ");
		  }//end for
		  System.out.println();
	  }//end for
	  
	  
	  
	}//main
}//class
