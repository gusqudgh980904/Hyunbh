package day0216;

import static java.lang.Integer.MAX_VALUE;
import static java.lang.Integer.parseInt;;
//import static java.lang.BYTE.MAX_VALUE;//Ŭ������ �ٸ��� ������� ���ٸ� �� �� �ϳ��� ��밡��
/**
 * �ٸ� Ŭ������ �����ϴ� static������ static method�� �� Ŭ���� �ȿ� �ִ� ��ó�� ����� ��
 * @author user
 */
public class UseStaticImport {

	public static void main(String[] args) {
		System.out.println("int�� �ְ�:"+MAX_VALUE);
		
		String str="2021";
		int i=parseInt(str);
		System.out.println(i);
		
		int j=parseInt(str);
		System.out.println(j);
		

	}//main
}//class
