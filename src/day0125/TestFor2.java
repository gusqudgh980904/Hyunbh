package day0125;

/**
 *	���� for(��ø for)�� ���.<br>
 *	����)<br>
 *	for(�ʱⰪ;���ǽ�;��.���ҽ�){<br>
 *		for(�ʱⰪ;���ǽ�;��.���ҽ�){<br>
 *			�ݺ����๮���...<br>
 *		}<br>
 *}<br>
 * @author user
 */
public class TestFor2 {

	public static void main(String[] args) {
		//������ ���� ���.
		//�������� 2~9�ܱ��� ����
		for(int i=2;i<10;i++) {//��
			System.out.println(i+"�ܽ���");
			for(int j=1;j<10;j++) {//�������¼�
			System.out.println(i+"X"+j+"="+i*j);
		}//end for
			System.out.println(i+"�� ��");
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
	  /////������ ������ ���/////// ��������� �ƴϰ� ����������� �ٲ� ������.
	  for(int i=1;i<10;i++) {
		  for(int j=2;j<10;j++) {
			  System.out.print(j+"X"+i+"="+j*i+" ");
		  }//end for
		  System.out.println();
	  }//end for
	  
	  
	  
	}//main
}//class
