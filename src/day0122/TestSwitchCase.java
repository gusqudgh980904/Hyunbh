package day0122;

/**
 *	��ġ�ϴ� ������ ���� �� ����ϴ� switch~case��<br>
 *	����)
 *		switch(������){
 *			case ��� : ���๮��;<br>
 *			case ��� : ���๮��;<br>
 *			case ��� : ���๮��;<br>
 *							.
 *							.
 *							.
 *			default : ���๮��<br>
 *	}
 * @author user
 */
public class TestSwitchCase {

	public static void main(String[] args) {
		
//		int i=1; // byte short int long(X) char
//		switch ( i ) {//������ ������ ������ ��� �� �� �ִ�.
//		case 0:System.out.println("ZERO");
//		case 1:System.out.println("ONE");
//		case 2:System.out.println("TWO");
//		default:System.out.println("��ġ�ϴ� ��� ����.");
//		}//end switch

		/////////case�� ����� �ԷµǴ� ���������� ���������� ����� �� �ִ�.///////////
//		int i=0; // byte short int long(X) char
//		switch ( i ) {//������ ������ ������ ��� �� �� �ִ�.
//		case -2147483648:System.out.println("ZERO");
//		case 1:System.out.println("ONE");
//		case 2:System.out.println("TWO");
//		default:System.out.println("��ġ�ϴ� ��� ����.");
//		}//end switch

		/////////////////char��////////////
//		char i='A'; // char�� �ԷµǴ� ���ڿ� �����ϴ� Unicode���� ����.
//		switch ( i ) {//������ ������ ������ ��� �� �� �ִ�.
//		case 'A':System.out.println("ZERO");
//		case 'B':System.out.println("ONE");
//		case 'C':System.out.println("TWO");
//		default:System.out.println("��ġ�ϴ� ��� ����.");
//		}//end switch
		
		/////////////////////String////////////
		String i="Oracle"; // JavaSE 7(JDK1.7)���� ����
		switch ( i ) {//
		case "Java":System.out.println("�Ϻ��� OOP���");
		case "Oracle":System.out.println("��뷮 �����ͺ��̽�");
		case "HTML":System.out.println("��ũ�� ���");
		default:System.out.println("��ġ�ϴ� ��� ����.");
		}//end switch
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}//main
}//class
