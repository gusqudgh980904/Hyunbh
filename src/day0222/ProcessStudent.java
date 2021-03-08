package day0222;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * �л������������ϴ�Ŭ������ ����Ͽ�, �л������� ó���ϴ� ���� ������ Ŭ����.
 * @author user
 */
public class ProcessStudent {
	
	
	/**
	 * �л��� ������ �����ϱ� ���� ��.
	 * @return ����� �л��� ����.
	 */
	public List<StudentVO> setStudentInfo(){
		List<StudentVO> list=new ArrayList<StudentVO>();
		//����Ʈ�� �����͸� �߰�
		list.add(new StudentVO("���μ�",25,"����� ������ ���ﵿ","��",97));
		list.add(new StudentVO("������",27,"����� ������ ������","��",81));
		list.add(new StudentVO("������",26,"����� ���۱� �󵵵�","��",90));
		list.add(new StudentVO("�����",30,"��⵵ ������ ���뱸","��",82));
		list.add(new StudentVO("������",25,"��õ������ ���� ����","��",88));
		
		
		
		
		return list;
	}//setStudentInfo
	
	
	/**
	 * �л��� ������ ����Ͽ� ����ϴ� ��.(�ܼ���ȣ,�¾�ظ� ���)
	 * @param list
	 */
	public void printStudentInfo(List<StudentVO> list) {
		System.out.println("��ȣ\t�̸�\t����\t�¾ ��\t�ּ�\t\t\t�ڹ�����");
		System.out.println("--------------------------------------------------------------------------------------");

		Calendar cal=Calendar.getInstance();//�߻�Ŭ�����̹Ƿ� new�� ��üȭ���� �ʴ´�.
		int nowYear=cal.get(Calendar.YEAR);//�¾ �ظ� �����ϱ� ���� ����� ����
		StudentVO sVO=null;//����Ʈ�� Element ���� �����ϱ� ���� ��ü.
		for(int i=0;i<list.size();i++) {
			sVO=list.get(i);
			System.out.printf("%d\t%s\t%d\t%d\t%s\t%d\n",i+1,sVO.getName(),sVO.getAge(),nowYear-sVO.getAge()+1,
					sVO.getAddress(),sVO.getJavaScore());
		}//for
		
//		if(list.size()==0) 
//		if(sVO==null) 
		if(list.isEmpty()) {//�����Ͱ� ���� ��
			System.out.println("�����Ͱ� �����");
		}//if
		
	}//printStudentInfo
	

	/**
	 * �л��� ������ ����Ͽ� ������ ���� ���� ����� �ϴ� ��.
	 * @param list �л��� ����
	 * @param gender ����� �л��� ����
	 */
	public void printStudentGenderType(List<StudentVO> list,String gender) {
		System.out.println("�̸�\t����\t�ּ�\t����\t����");
		System.out.println("--------------------------------------------------------------------------------------");
		
		//�Էµ� ������ "��"�Ǵ� "��"�� �ƴ϶�� �⺻������ "��"�� ����
		if (!(gender.equals("��")||gender.equals("��"))) {
			gender="��";
		}//if
		
		for(StudentVO sVO:list) {//�ε����� ����� ���� �ƴϹǷ� ������ for�� ���
			if(gender.equals(sVO.getGender())) {//�Է� ������ ��ġ�Ѵٸ� ����� ����
				System.out.printf("%s\t%d\t%s\t%s\t%d \n",sVO.getName(),sVO.getAge(),sVO.getAddress(),sVO.getGender()
						,sVO.getJavaScore());
			}//if
		}//for
		
		if(list.isEmpty()) {//�����Ͱ� ���� ��
			System.out.println("�л������� �������� �ʽ��ϴ�.");
		}//if
		
	}//printStudentGenderType

	
	public static void main(String[] args) {
		ProcessStudent ps=new ProcessStudent();
		List<StudentVO> list=ps.setStudentInfo();//����� �л��� ������ �޴´�.
		ps.printStudentInfo(list);
		System.out.println();
		ps.printStudentGenderType(list, "��");
	}//main

}//class
