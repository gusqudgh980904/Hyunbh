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
		//1.생성
		//M-1~9까지 1자리로 출력. MM-1~9월까지 0이붙어서 출력된다
		//d-1~9까지 1자리로 출력. Mㅇㅇ-1~9일까지 0이붙어서 출력된다
		//h,k-12시간으로 출력. -1~9일까지 1자리로 출력, hh,kk-1~9시까지 0이붙어서 출력된다
		//H,K-24시간으로 출력. -1~9일까지 1자리로 출력, HH,KK-1~9시까지 0이붙어서 출력된다
		//m분 mm,s초 ss,
		Date date=new Date();
		//월-일-년의 형식으로 출력
		SimpleDateFormat sdf1=new SimpleDateFormat("MM-dd-yyyy");
		//2.일
		System.out.println(sdf1.format(date));
		
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd-a hh:mm:ss EEEE");
		//2.요일
		System.out.println(sdf.format(date));
		
		//Locale클래스와 같이 사용되면 다른 나라의 날짜형식으로 출력이 가능
		SimpleDateFormat sdf2=new SimpleDateFormat("yyyy-MM-dd-a hh:mm:ss EEEE",Locale.CHINA);
		//2.일
		System.out.println(sdf2.format(date));
		
	}//UseSimpleDateFormat

	public static void main(String[] args) {
		new UseSimpleDateFormat();
	}//main

}//class
