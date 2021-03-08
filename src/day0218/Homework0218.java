package day0218;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * ����1.method�� ȣ���Ͽ� �Ű������� ������ �ش� ������ ��¥ǥ���������� ��ȯ�Ͽ� ����ϴ� method�� �ۼ�
 * �Է��� �ѱ�,�̱�,�Ϻ�,�߱��� ���ڿ��� �Էµǰ�, �� �ܴ̿� �ѱ����� ó���Ѵ�
 * ��ȯ ��¥ ������ "��-��-�� ���� (24�ð�)��:���� �������� ��ȯ
 * @author user
 */
public class Homework0218 {
	
	public  void WorldDate(String world) {
		
		Date date=new Date();
		
		if(world=="�ѱ�") {
			SimpleDateFormat krDate=new SimpleDateFormat("MM-dd-YYYY EEEE H:mm ",Locale.KOREA);
			System.out.println(krDate.format(date));
		}else if(world=="�̱�") {
			SimpleDateFormat usDate=new SimpleDateFormat("MM-dd-YYYY EEEE H:mm ",Locale.US);
			System.out.println(usDate.format(date));
		}else if(world=="�Ϻ�") {
			SimpleDateFormat jpDate=new SimpleDateFormat("MM-dd-YYYY EEEE H:mm ",Locale.JAPAN);
			System.out.println(jpDate.format(date));
		}else if(world=="�߱�") {
			SimpleDateFormat chDate=new SimpleDateFormat("MM-dd-YYYY EEEE H:mm ",Locale.CHINA);
			System.out.println(chDate.format(date));
		}else {
			SimpleDateFormat krDate=new SimpleDateFormat("MM-dd-YYYY EEEE H:mm ",Locale.KOREA);
			System.out.println(krDate.format(date));
		}//if else
		
	}//WorldDate
	
	
	

	public static void main(String[] args) {
		Homework0218 hm=new Homework0218();
		hm.WorldDate("�ѱ�");
		hm.WorldDate("�̱�");
		hm.WorldDate("�Ϻ�");
		hm.WorldDate("�߱�");
		hm.WorldDate("�Ƹ���");
	}//main

}//class
