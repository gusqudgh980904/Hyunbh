package day0219;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

/**
 *�̸�,����,�ּ�,����,�ڹ������� ������ �� �ִ�Ŭ������ �ۼ��ϼ���
 *���� ������ Ŭ������ ����Ͽ� �Ʒ��� ���� �־� ��ü�� �����ϰ� List�� �߰��Ͽ� ��ȯ�ϴ� method�� �ۼ��ϼ���
 *���μ�,25 ����� ������ ���ﵿ,��,97
 *������,27 ����� ������ ������,��,81
 *�ǿ���,26 ����� ���۱� �󵵵�,��,90
 *�����,30 ��⵵ ������ ���뱸,��,82
 *������,25 ��õ������ ���� ����,��,88
 * @author user
 * 
 * 
  - ���� method�� ȣ���Ͽ� ��ȯ�� List�� �Ű������� �޾� �Ʒ��� ���� ����ϴ� method�� �ۼ��ϰ�
     ȣ���Ͽ� ��µǵ��� �غ�����.( �����Ϳ��� ���ڸ� ����Ѵ�.)
     �ǿ��� 26 ����� ���۱� �󵵵�  	�� 90
     ������ 25 ��õ������ ���� ����  �� 88

 */
public class Homework0219 {
	
	
	public List<String> StuInfor(){
	List<String> list=new ArrayList<String>();
	StudentInformation kis=new StudentInformation("���μ�",25,"����� ������ ���ﵿ","��",97);
	StudentInformation kbs=new StudentInformation("������",27,"����� ������ ������","��",81);
	StudentInformation kyw=new StudentInformation("�ǿ���",26,"����� ���۱� �󵵵�","��",90);
	StudentInformation kdy=new StudentInformation("�����",30,"��⵵ ������ ���뱸","��",82);
	StudentInformation sjw=new StudentInformation("������",25,"��õ������ ���� ����","��",88);
	
	list.add(kis.toString());
	list.add(kbs.toString());
	list.add(kyw.toString());
	list.add(kdy.toString());
	list.add(sjw.toString());
	
	return list;
	}//StuInfor
	
	
	/**
	 *     - ���� method�� ȣ���Ͽ� ��ȯ�� List�� �Ű������� �޾� �Ʒ��� ���� ����ϴ� method�� �ۼ��Ͽ�
     ȣ���Ͽ� ����غ�����. (Calendar�� ����Ͽ� �¾ �ظ� ���� ����Ѵ�. )
   ��ȣ  �̸� ����   �¾ ��    �ּ�                       �ڹ�����
     1  ���μ� 25       1997     ����� ������ ���ﵿ     97
     2  ������ 27       1995     ����� ������ ������     81
     3  �ǿ��� 26       1996     ����� ���۱� �󵵵�     90
     4  ����� 30       1992     ��⵵ ������ ���뱸     82
     5  ������ 25       1997     ��õ������ ���� ����   88
	 * @param list
	 */
	public void StuInfor1(List<String> list) {
		Homework0219 hm=new Homework0219();
		list=hm.StuInfor();
//		String[] stuArr=new String[list.size()];
//		list.toArray(stuArr);
		Calendar cal=new GregorianCalendar();
		
		String birthyear="";
		int year=cal.get(Calendar.YEAR);
		birthyear=String.valueOf(year);

		
		
		System.out.println("��ȣ �̸� ���� �¾ �� �ּ� �ڹ�����");
		for(String temp:list) {
			System.out.println(temp);
		}//for
	}//StuInfor1
	
	
	public void printStuInfor(List<String> list) {//���method
		for(String temp:list) {
			System.out.println(temp);
		}//for
	}//printStuInfor

	
	public static void main(String[] args) {
		Homework0219 hm=new Homework0219();
		hm.printStuInfor(hm.StuInfor());
		System.out.println("----------------------------");
		hm.StuInfor1(null);
	}//main

}//class
