package day0219;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;


/**
 * 
 * @author user
 */
public class Work0218 {
	
	
	/**
	 * 한국,미국,일본,중국이 입력되면 해당 국가에서 사용하는 날짜 형식으로 반환
	 * 한국,미국,일본,중국이 아니면 한국으로 설정
	 * @param nation 국가
	 * @return 날짜형식
	 */
	public String dateFormat(String nation) {
		String tempDate="";
		Locale tempLoc=Locale.KOREA;
		
		switch(nation) {
		case "미국":tempLoc=Locale.US; break;
		case "일본":tempLoc=Locale.JAPAN; break;
		case "중국":tempLoc=Locale.CHINA; break;
		}//switch
		
//		tempLoc=new SimpleDateFormat("MM-dd-YYYY EEEE H:mm");
		
		return tempDate;
	}//dateFormat
	
	
	/**
	 * 날짜를 받아 출력하는 일
	 * @param date 출력할 날짜
	 */
	public void printDate(String date) {
		System.out.println(date);
	}//printDate
	
	
	/**
	 * 입력한 월에 일요일을 구하는 일
	 * 입력월이 1~12월이 아니라면 1월로 설정
	 * @param month 월
	 * @return 일요일의 일자
	 */
	public List<Integer> sundayList(int month){
		List<Integer> list=new ArrayList<Integer>();
		
		//자바는 사람이 생각하는 월보다 1적음.
		int tempMonth=0;
		if(month>0&&month<13) {//1~12월까지만 동작
			tempMonth=month-1;
		}//if
		
		Calendar cal=Calendar.getInstance();//2021-02-19
		cal.set(Calendar.MONTH, tempMonth);//입력한 월로 설정
		
		System.out.println(month+"월");
		//월에 마지막 날을 구하기 cal.getActualMax(Calendat.Date);
		int lastDay=cal.getActualMaximum(Calendar.DATE)+1;
		
		for(int tempDay=1;tempDay<lastDay;tempDay++) {
			//임시일자를 Calendar객체에 설정
			cal.set(Calendar.DAY_OF_MONTH, tempDay);
			//설정된 일자가 일요일 인지 판단.
			switch(cal.get(Calendar.DAY_OF_WEEK)) {
			case Calendar.SUNDAY:
			//리스트에 일요일을 추가
//			list.add(tempDay);//autoboxing
			list.add(Integer.valueOf(tempDay));//autoboxing
			}//if
			
		}//for
		
		return list;
	}//sundayList
	
	
	/**
	 * 입력된 리스트를 출력하는 일.
	 * @param list
	 */
	public void printSunday(int month, List<Integer> list) {
		System.out.println(month+"월의 일요일");
		for(int temp:list) {
			System.out.printf("%-4d",temp);
		}//for
	}//printSunday

	
	public static void main(String[] args) {
		Work0218 work=new Work0218();
//		work.printDate(work.dateFormat(null));
		int month=2;
		System.out.println("------------------------");
		work.printSunday(month,work.sundayList(month));

	}//main

}//class
