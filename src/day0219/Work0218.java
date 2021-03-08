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
	 * �ѱ�,�̱�,�Ϻ�,�߱��� �ԷµǸ� �ش� �������� ����ϴ� ��¥ �������� ��ȯ
	 * �ѱ�,�̱�,�Ϻ�,�߱��� �ƴϸ� �ѱ����� ����
	 * @param nation ����
	 * @return ��¥����
	 */
	public String dateFormat(String nation) {
		String tempDate="";
		Locale tempLoc=Locale.KOREA;
		
		switch(nation) {
		case "�̱�":tempLoc=Locale.US; break;
		case "�Ϻ�":tempLoc=Locale.JAPAN; break;
		case "�߱�":tempLoc=Locale.CHINA; break;
		}//switch
		
//		tempLoc=new SimpleDateFormat("MM-dd-YYYY EEEE H:mm");
		
		return tempDate;
	}//dateFormat
	
	
	/**
	 * ��¥�� �޾� ����ϴ� ��
	 * @param date ����� ��¥
	 */
	public void printDate(String date) {
		System.out.println(date);
	}//printDate
	
	
	/**
	 * �Է��� ���� �Ͽ����� ���ϴ� ��
	 * �Է¿��� 1~12���� �ƴ϶�� 1���� ����
	 * @param month ��
	 * @return �Ͽ����� ����
	 */
	public List<Integer> sundayList(int month){
		List<Integer> list=new ArrayList<Integer>();
		
		//�ڹٴ� ����� �����ϴ� ������ 1����.
		int tempMonth=0;
		if(month>0&&month<13) {//1~12�������� ����
			tempMonth=month-1;
		}//if
		
		Calendar cal=Calendar.getInstance();//2021-02-19
		cal.set(Calendar.MONTH, tempMonth);//�Է��� ���� ����
		
		System.out.println(month+"��");
		//���� ������ ���� ���ϱ� cal.getActualMax(Calendat.Date);
		int lastDay=cal.getActualMaximum(Calendar.DATE)+1;
		
		for(int tempDay=1;tempDay<lastDay;tempDay++) {
			//�ӽ����ڸ� Calendar��ü�� ����
			cal.set(Calendar.DAY_OF_MONTH, tempDay);
			//������ ���ڰ� �Ͽ��� ���� �Ǵ�.
			switch(cal.get(Calendar.DAY_OF_WEEK)) {
			case Calendar.SUNDAY:
			//����Ʈ�� �Ͽ����� �߰�
//			list.add(tempDay);//autoboxing
			list.add(Integer.valueOf(tempDay));//autoboxing
			}//if
			
		}//for
		
		return list;
	}//sundayList
	
	
	/**
	 * �Էµ� ����Ʈ�� ����ϴ� ��.
	 * @param list
	 */
	public void printSunday(int month, List<Integer> list) {
		System.out.println(month+"���� �Ͽ���");
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
