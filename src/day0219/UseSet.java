package day0219;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * �˻��� ����� ������ ,�ߺ������͸� �������� �ʴ� Set�� ���
 * ������ ������ ������ ���� �����ϰ� ����ؾ��� ��
 * @author user
 */
public class UseSet {
	
	public UseSet() {
		//1.����
		Set<String> set=new HashSet<String>();
		
		//2.�� �Ҵ�:���� ������� �Էµ��� �ʴ´�.
		set.add("1.�ڹ�");
		set.add("2.����Ŭ");
		set.add("3.JDBC");
		set.add("4.HTML");
		set.add("5.CSS");
		set.add("6.JavaScript");
		set.add("7.Servlet");
		set.add("2.����Ŭ");//�ߺ����� �Էµ��� �ʴ´�
		
		//�迭�� ����
		//set�� ũ��� �迭�� ����
		String[] subjectArr=new String[set.size()];
		//set�� ������ �迭�� ����
		set.toArray(subjectArr);
		
		//3.�� ����
		set.remove("6.JavaScript");
		//��� ���� �� ����
//		set.clear();
		System.out.println(set+"/"+set.size());

		//4.�˻�=>�˻��� ����� ����. Iterator�� ���
		Iterator<String> ita=set.iterator();//set�� �˻��� �� �ְ� set�� ������� �޴´�.
		
		while(ita.hasNext()) {//������� ���� set��ü�� Element�� �����ϴ� ��?true|false
			System.out.println(ita.next());//���� ��� �����͸� �������� �̵�
		}//while
		
		System.out.println("-------------------------");
		//set�� �˻��� ����� ���� ������ for�����δ� ����� �Ұ���(get method�� ���� ��� �Ұ���)
		//������ for�����δ� ����� �����ϴ�
		for(String temp:set) {
			System.out.println(temp);
		}//for
		
		System.out.println("-------------------------");
		for(String temp:subjectArr) {
			System.out.println(temp);
		}//for
		
	}//UseSet
	
	

	public static void main(String[] args) {
		new UseSet();
	}//main

}//class
