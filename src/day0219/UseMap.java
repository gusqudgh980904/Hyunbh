package day0219;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Map Ű�� ���� ������ �̷���� �����͸� ����� ��
 * HashTable,HashMap ���� Ŭ����
 * @author user
 */
public class UseMap {
	
	public void useHashTable() {
		//1.����
		Map<String,String> map=new Hashtable<String,String>();//11�� �� ����,Multi Thread���� �������ٰ���
		
		//2.���Ҵ�)���� ������� �Էµ����ʴ´�
		//Ű�� �����ϸ�,���� �ߺ�����
		//���� Ű�� �ԷµǸ�,������ Ű�� ���� ���� ������
		map.put("�ڹ�","�Ϻ��� ��ü������");
		map.put("����Ŭ","��뷮 ������ ���̽�");
		map.put("JDBC","�ڹٿ��� DBMS�� �����ϱ� ���� ���");
		map.put("HTML","������������ ������ ���");
		map.put("���̽�","�Ϻ��� ��ü������");//���� ���� �ߺ� ����
		map.put("HTML","Tim berners LEE");//���� Ű�� �ԷµǸ� ������ Ű�� �����
		System.out.println(map+"/"+map.size());
		
		//3.�� ���:Ű�� ����Ͽ� Ű�� �ش��ϴ� ���� ��´�.Ű�� �������� ������ null�� ��ȯ��
		String value=map.get("HTML");
		System.out.println(value);
		
		//4.Ű�� �����ϴ���?
		boolean flag=map.containsKey("HTML");
		System.out.println(flag);
		
		//5.������
		//Ű�� ����Ͽ� �� ����
		map.remove("�ڹ�");
		//��� entry�� ����
//		map.clear();
		System.out.println(map+"/"+map.size());
		
		//6.��� Ű �ޱ�
		Set<String> set=map.keySet();
		System.out.println(set);
		//Iterator�� ����Ͽ� set���
		Iterator<String> ita=set.iterator();
		while(ita.hasNext()) {//������� ���� set��ü�� Element�� �����ϴ� ��?true|false
//			System.out.println(ita.next());//���� ��� �����͸� �������� �̵�
			System.out.println(map.get(ita.next()));//���entry�� ���� ���� �� �ֵ�
		}//while
		
		
	}//UseHashTable
	
	
	public void UseHashMap() {
		//1.����
		Map<String,String> map=new HashMap<String,String>();//16�� �� ����,Multi Thread���� �������ٰ���
		
		//2.���Ҵ�)���� ������� �Էµ����ʴ´�
		//Ű�� �����ϸ�,���� �ߺ�����
		//���� Ű�� �ԷµǸ�,������ Ű�� ���� ���� ������
		map.put("�ڹ�","�Ϻ��� ��ü������");
		map.put("����Ŭ","��뷮 ������ ���̽�");
		map.put("JDBC","�ڹٿ��� DBMS�� �����ϱ� ���� ���");
		map.put("HTML","������������ ������ ���");
		map.put("���̽�","�Ϻ��� ��ü������");//���� ���� �ߺ� ����
		map.put("HTML","Tim berners LEE");//���� Ű�� �ԷµǸ� ������ Ű�� �����
		System.out.println(map+"/"+map.size());
		
		//3.�� ���:Ű�� ����Ͽ� Ű�� �ش��ϴ� ���� ��´�.Ű�� �������� ������ null�� ��ȯ��
		String value=map.get("HTML");
		System.out.println(value);
		
		//4.Ű�� �����ϴ���?
		boolean flag=map.containsKey("HTML");
		System.out.println(flag);
		
		//5.������
		//Ű�� ����Ͽ� �� ����
		map.remove("�ڹ�");
		//��� entry�� ����
//		map.clear();
		System.out.println(map+"/"+map.size());
		
		//6.��� Ű �ޱ�
		Set<String> set=map.keySet();
		System.out.println(set);
		//Iterator�� ����Ͽ� set���
		Iterator<String> ita=set.iterator();
		while(ita.hasNext()) {//������� ���� set��ü�� Element�� �����ϴ� ��?true|false
//			System.out.println(ita.next());//���� ��� �����͸� �������� �̵�
			System.out.println(map.get(ita.next()));//���entry�� ���� ���� �� �ֵ�
		}//while
		
		
	}//UseHashMap
	

	public static void main(String[] args) {
		UseMap um=new UseMap();
		um.useHashTable();
		System.out.println("---------------------");
		um.UseHashMap();

	}//main

}//class
