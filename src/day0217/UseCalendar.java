package day0217;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * 개별적인 날짜정보를 얻을 때 사용하는 Calendar
 * @author user
 */
public class UseCalendar {
	
	public UseCalendar() {
		//1.생성
//		Calendar cal=new Calendar();//추상클래스이므로 객체화가 되지 않는다.
		//is a관계의 객체화-부모클래스명 객체명=new 자식클래스생성자();
		Calendar cal=new GregorianCalendar();
		//instance를 얻는 method 사용
		Calendar cal1=Calendar.getInstance();
		
		
		System.out.println(cal);
		System.out.println(cal1);
		
		
		//사람이 생각하는 월과 자바에서 나오는 월은 1의 차이가 있다.
		//요일은 일요일 부터 1씩 증가하여 나온다.
		//일 1,월 2,화 3,수 4,목 5,금 6,토 7,일, 8
		String[] weekTile= {"일","월","화","수","목","금","토"};
		String[] amTile= {"오전","오후"};
		int week=cal1.get(Calendar.DAY_OF_WEEK);
		int am=cal1.get(Calendar.AM_PM);
//		switch (week) {
//		case 1:System.out.println("일");break;
//		case 2:System.out.println("월");break;
//		case 3:System.out.println("화");break;
//		case 4:System.out.println("수");break;
//		case 5:System.out.println("목");break;
//		case 6:System.out.println("금");break;
//		default:System.out.println("토");break;
//		}//switch
			
		
		String output=cal1.get(Calendar.YEAR)+" "+(cal1.get(Calendar.MONTH)+1)+"-"
				+cal1.get(Calendar.DAY_OF_MONTH)+"-"+weekTile[week-1]+"-"+amTile[am]+"/"+
				cal1.get(Calendar.HOUR)+" "+cal1.get(Calendar.HOUR_OF_DAY)+
				" "+cal1.get(Calendar.MINUTE)+" "+cal1.get(Calendar.SECOND);
		System.out.println(output);
		
		
		System.out.println("---------------------날짜 정보 변경---------------------------");
		System.out.println(cal);//현재 날짜 정보
		
		//년 변경
		cal.set(Calendar.YEAR,2020);
		//월 변경/사람이 생각하는 월-1로 값주기
		cal.set(Calendar.MONTH,11);
		//일 변경
		cal.set(Calendar.DAY_OF_MONTH,30);
		
		System.out.printf("%d-%d-%d %s",cal.get(Calendar.YEAR),cal.get(Calendar.MONTH)+1,cal.get(Calendar.DAY_OF_MONTH),
				weekTile[cal.get(Calendar.DAY_OF_WEEK)-1]);
		
		
		
	}//UseCalendar

	
	public static void main(String[] args) {
		new UseCalendar();
		
	}//main

}//class
