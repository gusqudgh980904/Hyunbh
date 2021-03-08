package day0218;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * 숙제1.method를 호출하여 매개변수를 넣으면 해당 국가의 날짜표현형식으로 반환하여 출력하는 method를 작성
 * 입력은 한국,미국,일본,중국의 문자열이 입력되고, 그 이외는 한국으로 처리한다
 * 반환 날짜 형식은 "월-일-년 요일 (24시간)시:분의 형식으로 반환
 * @author user
 */
public class Homework0218 {
	
	public  void WorldDate(String world) {
		
		Date date=new Date();
		
		if(world=="한국") {
			SimpleDateFormat krDate=new SimpleDateFormat("MM-dd-YYYY EEEE H:mm ",Locale.KOREA);
			System.out.println(krDate.format(date));
		}else if(world=="미국") {
			SimpleDateFormat usDate=new SimpleDateFormat("MM-dd-YYYY EEEE H:mm ",Locale.US);
			System.out.println(usDate.format(date));
		}else if(world=="일본") {
			SimpleDateFormat jpDate=new SimpleDateFormat("MM-dd-YYYY EEEE H:mm ",Locale.JAPAN);
			System.out.println(jpDate.format(date));
		}else if(world=="중국") {
			SimpleDateFormat chDate=new SimpleDateFormat("MM-dd-YYYY EEEE H:mm ",Locale.CHINA);
			System.out.println(chDate.format(date));
		}else {
			SimpleDateFormat krDate=new SimpleDateFormat("MM-dd-YYYY EEEE H:mm ",Locale.KOREA);
			System.out.println(krDate.format(date));
		}//if else
		
	}//WorldDate
	
	
	

	public static void main(String[] args) {
		Homework0218 hm=new Homework0218();
		hm.WorldDate("한국");
		hm.WorldDate("미국");
		hm.WorldDate("일본");
		hm.WorldDate("중국");
		hm.WorldDate("아마존");
	}//main

}//class
