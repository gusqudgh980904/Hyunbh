package day0203;

public class UseArray {
	
	public void max() {
		int[] temp= {87,74,99,45,96};
		int max=temp[0];// �ְ� ���� ���ϱ� ���� ó�� ���� ���� �ִ´�.
		for(int i=0;i<temp.length;i++) {//����� �ݺ���
			System.out.printf("%-4d",temp[i]);
			if(max<temp[i]) {
				max=temp[i];
			}//if
		}//for
		System.out.println("\n �ְ�����"+max);
	}//max
	
	public void min() {
		int[] temp= {87,74,99,45,96};
		int min=temp[0];//���� ���� ���ϱ� ���� ó�� ���� ���� �ִ´�.
		for(int i=1;i<temp.length;i++) {//����� �ݺ���
			if(min>temp[i]) {
				min=temp[i];
			}//if
		}//for
		System.out.println("\n��������"+min);
	}//min
	
	public void sort() {
		int[] score={87,74,99,45,96};
		int temp=0;
		for(int i=0;i<score.length;i++) {//�չ��� ��
			for(int j=i+1;j<score.length;j++) {//�������� ��
				if(score[i]<score[j]) {//�չ��� ���� �������� ������ �۴ٸ�/<,>��ȣ�� ���� �������� �������� ���氡��
					temp=score[i];//�չ��� ���� �ӽú�������
					score[i]=score[j];//���� ���� ���� �չ濡 �����ϰ�
					score[j]=temp;//�ӽú����� ���� ���� �濡 ����
				}//if
			}//for
			}//for
		//����� �迭�� ���.
		for(int i=0;i<score.length;i++) {
			System.out.print(score[i]+" ");
			
		}
	}//sort
	
	
	public static void main(String[] args) {
		UseArray ua=new UseArray();
		ua.max();
		System.out.println("------------------------");
		ua.min();
		System.out.println("------------------------");
		ua.sort();
	}//main
}//class
