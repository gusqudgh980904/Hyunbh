package day0217;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Formatter class
 * @author user
 */
public class UseSimpleDateFormat {
	
	public UseSimpleDateFormat(){
		//1.����
		//M-1~9���� 1�ڸ��� ���. MM-1~9������ 0�̺پ ��µȴ�
		//d-1~9���� 1�ڸ��� ���. M����-1~9�ϱ��� 0�̺پ ��µȴ�
		//h,k-12�ð����� ���. -1~9�ϱ��� 1�ڸ��� ���, hh,kk-1~9�ñ��� 0�̺پ ��µȴ�
		//H,K-24�ð����� ���. -1~9�ϱ��� 1�ڸ��� ���, HH,KK-1~9�ñ��� 0�̺پ ��µȴ�
		//m�� mm,s�� ss,
		Date date=new Date();
		//��-��-���� �������� ���
		SimpleDateFormat sdf1=new SimpleDateFormat("MM-dd-yyyy");
		//2.��
		System.out.println(sdf1.format(date));
		
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd-a hh:mm:ss EEEE");
		//2.����
		System.out.println(sdf.format(date));
		
		//LocaleŬ������ ���� ���Ǹ� �ٸ� ������ ��¥�������� ����� ����
		SimpleDateFormat sdf2=new SimpleDateFormat("yyyy-MM-dd-a hh:mm:ss EEEE",Locale.CHINA);
		//2.��
		System.out.println(sdf2.format(date));
		
	}//UseSimpleDateFormat

	public static void main(String[] args) {
		new UseSimpleDateFormat();
	}//main

}//class
