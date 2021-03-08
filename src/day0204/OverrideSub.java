package day0204;

import java.awt.List;
import java.util.Date;

/**
 * Method Override(Overriding)����
 * Override:�θ�Ŭ������ method�� �ڽ�Ŭ������ ��Ȳ�� ���� �ʴ´ٸ�, �ڽ�Ŭ�������� �θ�Ŭ������
 *          method�� ������ method�� �����Ͽ� ����ϴ� ��
 * @author user
 */
public class OverrideSub extends OverrideSuper {
	
	@Override
	public String toString() {//�θ� �����ϴ� ����� �ڽİ� ���� �ʴ´ٸ� �ڽ�Ŭ�������� method�� ������
		return "�ּҰ� �Ⱦ��";
	}//toString
	
	
//	public String superMethod() {//��ȯ���� �ٸ��� Override ��Ģ�� ����ǹǷ� Error �߻�
//		System.out.println("�ڽ�Ŭ�������� ��ȯ");
//		return "";
//	}//superMethod
	
//	public void superMethod(int i) {//�Ű������� �����ϸ� methodȣ���� �ٸ��� �Ǳ� ������ Override�� �������� �ʴ´�
//		System.out.println("�ڽ�Ŭ�������� ��ȯ");
//	}//superMethod
	
//	@Override
//	public void superMethod1(int i) {//Override �� method���� ���������ڴ� ������ ���� �����ڷ� ���氡��
//		//�θ�:protected->�ڽ�:public
//		System.out.println("�ڽ�Ŭ�������� ��ȯ");
//	}//protected void superMethod

		@Override
	public void superMethod1() {//Override �� method���� ���������ڴ� ������ ���� �����ڷ� ���氡��
		//�θ�:protected->�ڽ�:public
		System.out.println("�ڽ�Ŭ�������� ��ȯ");
	}//protected void superMethod1
	
		/**
		 * ����õ �޼ҵ�
		 */
		@Deprecated
	public void test() {
		System.out.println("HDD");//Hard Disk Drive->�Ĵ���
	}//test
		
//		@SuppressWarnings("unused")//method�� ��ü����
		@SuppressWarnings({"rawtypes","unused"})//method�� ��ü����
	public void temp() {
//		@SuppressWarnings("unused")//�ٷ� �Ʒ����� �ڵ常 ����
		int i=0;
		int f=0;
		
		List list=new List();
		
	}//temp
	
	
	public static void main(String[] args) {
		OverrideSub os=new OverrideSub();
		System.out.println("--------------Object class�� toString() Override------------------");
		System.out.println(os.toString());//Object Ŭ�������� �����ϴ� toString()�� ȣ��=>�ּ�
		//System.out.println()�� instance�� �־� ����ϸ� �� �ȿ��� toString()�� ȣ��Ǿ� �ּҰ� ��µȴ�.
		System.out.println(os);
		
		os.superMethod();
		os.superMethod1();
		System.out.println("-------------");
		
		Date date=new Date();
		System.out.println(date);
		System.out.println(date.getYear()+1900);
		
	}//main
}//class
