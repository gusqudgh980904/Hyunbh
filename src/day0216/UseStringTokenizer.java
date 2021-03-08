package day0216;

import java.util.StringTokenizer;
/**
 * ���ڿ��� ª�� �� ����� �����ϴ� StringTokenizer�� ���
 * @author user
 */
public class UseStringTokenizer {
	
	public UseStringTokenizer() {
		String data="�ڹ� ����Ŭ ������������ �ӳɳ� JDBC HTML";
		
		//���ڿ��� �������� �����Ͽ� �ڸ� �� �ִ� ��ü ����
		StringTokenizer stk=new StringTokenizer(data);
		
		System.out.println("��ū�� ��:"+stk.countTokens());
//		
//		System.out.println("��ū����?"+stk.hasMoreTokens());
//		System.out.println("��ū"+stk.nextToken());
//		System.out.println("��ū"+stk.nextToken());
//		System.out.println("��ū"+stk.nextToken());
//		System.out.println("��ū"+stk.nextToken());
//		System.out.println("��ū"+stk.nextToken());
//		System.out.println("��ū"+stk.nextToken());
//		System.out.println("��ū����?"+stk.hasMoreTokens());
		
		String token="";
		while(stk.hasMoreTokens()) {//��ū�� �����ϴ°�?
			token=stk.nextToken();
			System.out.println(token);
//			System.out.println("��ū�Ǽ�:"+stk.countTokens());//����  StringTokenizer�� ������ �ִ� ��ū�� �־� ���� ����
		}//while
		
		stk=new StringTokenizer(data);//�ٽùݺ��Ϸ��� ��ü�� ���� �����Ͽ� �����͸� ������ �̵���Ų��
		System.out.println("�����ʹ� �ѹ� �������� �ڷ� ���ƿ��� �ʴ´�");
		while(stk.hasMoreTokens()) {
			token=stk.nextToken();
			System.out.println(token);
//			System.out.println("��ū�Ǽ�:"+stk.countTokens());//����  StringTokenizer�� ������ �ִ� ��ū�� �־� ���� ����
		}//while
		
	}//UseStringTokenizer
	

	public static void main(String[] args) {
//		new UseStringTokenizer();
		
		String names="���й� �ǿ��� ����� ���μ� ������ ����� �ڱ��";
		//StkData�� ����Ͽ� �迭�� �����,names ���ڿ��� �������� �����Ͽ� StkData �迭�� �߰�
		
		//���ڿ��� �ڸ� �� �ִ� ��ü ���(StringTokenizer, String.split() )
		StringTokenizer stk=new StringTokenizer(names);//�Էµ� ���ڿ��� �������� ��ū�� �����
		//1.StkDataŬ������ ����Ͽ� ��ü �迭�� ����(���� �?=>��ū�� ���� ��)
		StkData[] nameArr=new StkData[stk.countTokens()];//��ū�� ������ ���� �����̱� ������ �� ��ū�� ��
		//2.���ڿ� �߶� �迭�� �ִ´�.(��ū�� ��� ������ �𸥴�=>while)
		int idx=0;//�迭�� �濡 ���� �ֱ� ���� �ε��� ������ ����.
		while(stk.hasMoreTokens()) {//��ū�� �����Ѵٸ�
			//��ū�� �� �迭�� �ִ´�.(�迭�� �ε����� ����Ͽ� �߰��Ѵ�.=>while�� index�� ����)
			
//			nameArr[idx]=new StkData(stk.nextToken(),0);//�Ű����� �ִ� ������ ���
			
			nameArr[idx]=new StkData();//�⺻������ ���
			nameArr[idx].setName(stk.nextToken());
			
			idx++;//idx=idx+1, idx+=1
		}//while
		
		//3.�߷��� ���ڿ��� ���� �迭�� ����Ѵ�.
		//������ for:index�� ����Ͽ� ���ϴ� �游 ��� ����
//		StkData sd=null;
//		for(int i=0;i<nameArr.length;i++) {
//			sd=nameArr[i];
//			System.out.println(sd.getName()+"/"+sd.getAge());
//		}//for
		
		//������ for
		for(StkData sd:nameArr) {
			System.out.println(sd.getName()+"/"+sd.getAge());
		}//for
		
		
		
		

	}//main
}//class
