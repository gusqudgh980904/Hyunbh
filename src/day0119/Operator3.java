package day0119;
/**
����Ʈ������
<<,>>,>>>
*/

class Operator3 {
	public static void main(String[] args) {

       int i=6;
		System.out.println(i+"<<3="+(i<<3));

	  i=39;
	    System.out.println(i+">>2="+(i>>2));

	  i=45;
		 System.out.println(i+">>3="+(i>>3));

	  i=1;
	  System.out.println(i+"�� <<31="+(i<<33));

	  i=-1;//
	  System.out.println(i+"�� >>100="+(i>>100));
	  System.out.println(i+"�� >>>1="+(i>>>1));



	}//main
}//class
