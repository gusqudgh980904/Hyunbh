package day0216;

/**
 * ����� ���� ������������ ���� Ŭ���� ���.
 * @author user
 */
public class UseStudentVO {

	public static void main(String[] args) {
		//��ȣ:1.�̸�:���ϴ�,����:20��,Ű:185.8(��絥���͸� �˰� �ִ� ��Ȳ=>�Ű����� �ִ� ������)
		StudentVO stuHaNeul=new StudentVO(1, "���ϴ�", 20, 185.8);
				

		//��ȣ:2.�̸�:�ڱ��(��絥���͸� ���� ���ϴ� ��Ȳ=>�⺻ ������)
		StudentVO stuKiBum=new StudentVO();
		stuKiBum.setRegiNum(2);
		stuKiBum.setName("�ڱ��");
		
		System.out.println(stuKiBum);
		System.out.println(stuHaNeul.toString());
		
		//���� �л��� ������ �����ϰ� ó��.��������� ������������ �迭�� ����
		//1,���ϴ�.20.180.8 2,�ڱ��.25.170.3 3,���μ�.26.178.7
		
		//1.���� ��������[] �迭��=null;
		StudentVO[] stuArr=null;
		//2.���� �迭��=new ��������[���ǰ���];
		stuArr=new StudentVO[3];
		//3.���Ҵ�
		stuArr[0]=stuHaNeul;
		stuArr[1]=stuKiBum;
		//stuArr[1]�� �ּҿ� stuKibum�� �ּҰ� ����.
		//stuArr[1]�� ����Ͽ� ���� 25����
		stuArr[1].setAge(25);
		//stuKiBum�� ����Ͽ� Ű 170.3�� ����
		stuKiBum.setHeight(170.3);
		
		stuArr[2]=new StudentVO(3, "���μ�", 26, 178.8);
		System.out.println("-----------------------------------");
		//4.�����(�ϰ�ó��)
		StudentVO temp=null;
		for(int i=0;i<stuArr.length;i++) {
			temp=stuArr[i];
			System.out.println(temp);
//			System.out.printf("��ȣ:%d,�̸�:%s,����:%d,Ű:%.1f\n",temp.getRegiNum(),temp.getName(),temp.getAge(),temp.getHeight());
			System.out.printf("��ȣ:%d,�̸�:%s,����:%d,Ű:%.1f\n",stuArr[i].getRegiNum(),stuArr[i].getName(),stuArr[i].getAge(),stuArr[i].getHeight());
		}//endfor
		
		
		
		
	}//main
}//class
