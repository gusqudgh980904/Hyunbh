package day0218;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Calendar 객체를 사용해 2월달 중 일요일을 아래와 같이 출력
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

