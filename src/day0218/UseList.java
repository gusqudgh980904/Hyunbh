package day0218;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;


/**
 * java.utill.List�� ���<br>
 * ������ �迭ó�� ����.����������(�����͸� �߰��ϸ� ���̰� �þ�� �����͸� �����ϸ� ���̰� �پ��)
 * ��� ���������� ������ �� ������,Generic�� ����ϸ� �Էµ������� ������ ������ �� �ִ�.
 * �˻��� ����� ������, �ߺ������͸� ������ �� �ִ�.
 * �߰��� �����ʹ� ���� �ڿ� �ٴ´�.
 * ������ ������ ���̿� �����͸� �߰��� ������ LinkedList�� ����ϴ� ���� ����.
 * @author user
 */
public class UseList {
	
	/**
	 * Multi Thread���� �������� ����
	 */
	public void useArrayList(){
		//1.����
		List<String> list=new ArrayList<String>();
		
		//2.ũ��
		System.out.println("���ǰ���:"+list.size());
		
		//3.�� �Ҵ�:���� �ڷ� �߰��ȴ�. �ߺ����� ������ �� �ִ�.
		list.add("�ڹ�");
		list.add("����Ŭ");//�ߺ��� ���尡��
		list.add("JDBC");
		list.add("HTML");
		list.add("����Ŭ");//�ߺ��� ���尡��
		list.add("CSS");
		list.add("JavaScript");
		System.out.println(list+"/"+list.size());//��ü�� ����ϸ� �ּҰ� ���;� �ϴ� �� ���� ���� ������?
												//�ڽ�Ŭ�������� ObjectŬ������ toString()�� �ּҰ� �ƴ� ���� ����� �� �ֵ��� Override �߱� ����
		
		//4.�迭�� ����
		//Generic�� ������ ��������,����Ʈ�� ũ���� �迭�� �����Ѵ�.
		String[] subjectArr=new String[list.size()];
		//����Ʈ�� ���� �迭�� ������.
		list.toArray(subjectArr);
		
		//5.�� ����:���� ũ�Ⱑ �پ���
		//�ε����� ����
		list.remove(3);
		//���� ���� ���� ��ü�� �־� ����:���� ���� ��ġ�ϴ� ���� �� �ϳ��� ����
		list.remove("����Ŭ");
		System.out.println(list+"/"+list.size());
		
		//6.�ϰ�ó��:list�� �ε����� ����� �� �ְ�, �˻��� ����� �����Ƿ� �ϰ�ó���� �� �� �ִ�.
//		String temp="";
//		for(int i=0;i<list.size();i++) {
//			temp=list.get(i);//����Ʈ i��° ���� ���� �����ͼ� temp�Ҵ�
//			System.out.println(temp);
//		}//for
		
		//������ for
		for(String temp:list) {
			System.out.println(temp);
		}//for
		System.out.println("-------------����� �� ���-------------------------");
		for(String temp:subjectArr) {
			System.out.printf("%s\t",temp);
		}//for
		System.out.printf("\n");
	}//useArrayList
	
	
	/**
	 * Multi Thread���� �������� ����
	 */
	public void useVector() {
		//1.����
		List<String> list=new Vector<String>();
		
		//2.ũ��
		System.out.println("���ǰ���:"+list.size());
		
		//3.�� �Ҵ�:���� �ڷ� �߰��ȴ�. �ߺ����� ������ �� �ִ�.
		list.add("�ڹ�");
		list.add("����Ŭ");//�ߺ��� ���尡��
		list.add("JDBC");
		list.add("HTML");
		list.add("����Ŭ");//�ߺ��� ���尡��
		list.add("CSS");
		list.add("JavaScript");
		System.out.println(list+"/"+list.size());//��ü�� ����ϸ� �ּҰ� ���;� �ϴ� �� ���� ���� ������?
												//�ڽ�Ŭ�������� ObjectŬ������ toString()�� �ּҰ� �ƴ� ���� ����� �� �ֵ��� Override �߱� ����
		
		//4.�迭�� ����
		//Generic�� ������ ��������,����Ʈ�� ũ���� �迭�� �����Ѵ�.
		String[] subjectArr=new String[list.size()];
		//����Ʈ�� ���� �迭�� ������.
		list.toArray(subjectArr);
		
		//5.�� ����:���� ũ�Ⱑ �پ���
		//�ε����� ����
		list.remove(3);
		//���� ���� ���� ��ü�� �־� ����:���� ���� ��ġ�ϴ� ���� �� �ϳ��� ����
		list.remove("����Ŭ");
		System.out.println(list+"/"+list.size());
		
		//6.�ϰ�ó��:list�� �ε����� ����� �� �ְ�, �˻��� ����� �����Ƿ� �ϰ�ó���� �� �� �ִ�.
//		String temp="";
//		for(int i=0;i<list.size();i++) {
//			temp=list.get(i);//����Ʈ i��° ���� ���� �����ͼ� temp�Ҵ�
//			System.out.println(temp);
//		}//for
		
		//������ for
		for(String temp:list) {
			System.out.println(temp);
		}//for
		System.out.println("-------------����� �� ���-------------------------");
		for(String temp:subjectArr) {
			System.out.printf("%s\t",temp);
		}//for
		System.out.printf("\n");
	}//useVector
	
	
	/**
	 * ���� �߰��� �� ������ ������ ���̿� ���� �߰��Ǵ� ���� ���� ��
	 */
	public void useLinkedList() {
		//1.����
		List<String> list=new LinkedList<String>();
		
		//2.ũ��
		System.out.println("���ǰ���:"+list.size());
		
		//3.�� �Ҵ�:���� �ڷ� �߰� �� ���� �ְ� ���� �߰��� ����� �� �� �ִ�.. �ߺ����� ������ �� �ִ�.
		list.add("�ڹ�");
		list.add("����Ŭ");//�ߺ��� ���尡��
		list.add("JDBC");
		list.add(1,"HTML");
		list.add("����Ŭ");//�ߺ��� ���尡��
		list.add(4,"CSS");
		list.add("JavaScript");
		System.out.println(list+"/"+list.size());//��ü�� ����ϸ� �ּҰ� ���;� �ϴ� �� ���� ���� ������?
												//�ڽ�Ŭ�������� ObjectŬ������ toString()�� �ּҰ� �ƴ� ���� ����� �� �ֵ��� Override �߱� ����
		
		//4.�迭�� ����
//		Generic�� ������ ��������,����Ʈ�� ũ���� �迭�� �����Ѵ�.
		String[] subjectArr=new String[list.size()];
		//����Ʈ�� ���� �迭�� ������.
		list.toArray(subjectArr);
		
		//5.�� ����:���� ũ�Ⱑ �پ���
		//�ε����� ����
		list.remove(3);
		//���� ���� ���� ��ü�� �־� ����:���� ���� ��ġ�ϴ� ���� �� �ϳ��� ����
		list.remove("����Ŭ");
		System.out.println(list+"/"+list.size());
		
		//6.�ϰ�ó��:list�� �ε����� ����� �� �ְ�, �˻��� ����� �����Ƿ� �ϰ�ó���� �� �� �ִ�.
//		String temp="";
//		for(int i=0;i<list.size();i++) {
//			temp=list.get(i);//����Ʈ i��° ���� ���� �����ͼ� temp�Ҵ�
//			System.out.println(temp);
//		}//for
		
		//������ for
		for(String temp:list) {
			System.out.println(temp);
		}//for
		System.out.println("-------------����� �� ���-------------------------");
		for(String temp:subjectArr) {
			System.out.printf("%s\t",temp);
		}//for
		System.out.printf("\n");
	}//useLinkedList
	

	public static void main(String[] args) {
		UseList ul=new UseList();
		System.out.println("--------------ArrayList----------------");
		ul.useArrayList();
		System.out.println("--------------Vector----------------");
		ul.useVector();
		System.out.println("--------------LinkedList----------------");
		ul.useLinkedList();
	}//main
}//class
