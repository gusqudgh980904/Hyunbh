package day0218;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Calendar ��ü�� ����� 2���� �� �Ͽ����� �Ʒ��� ���� ���
 * for,Calendar.set, Calendar.get
 * @author user
 */
public class Homework02182 {
	
	public Homework02182() {
		
		Calendar cal=new GregorianCalendar();
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));
		
		
	}

	public static void main(String[] args) {
		new Homework02182();
	}//main

}//class

