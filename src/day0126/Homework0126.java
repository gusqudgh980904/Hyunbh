package day0126;

public class Homework0126 {
	//method�� �̸��� �ҹ��ڷ� �����մϴ�.
	
	//1.�ڽ��� �̸��� ��� �ϴ� ���� �ϴ� method.
	public void MyName() {
		System.out.println("����ȣ");
	}//MyName
	
	//2.�ڽ��� �̸� �̴ϼ� ù ���ڸ� ��ȯ�ϴ� method.
	public char Initial( ) {
		return 'H';
	}//Initial
	
	//3.������ �Է¹޾� ������ ������ ����ϴ� method.
		//������ 0~100�� ���̶�� ������ ������.
		//�׷��� ������ "�߸��� ����"�� ����Ѵ�.
		//���� 0~39=���� 40~59=�ٸ� ���� ���� 60~100=�հ�
	public void score(int i) {
		if(i>0&&i<40) {
			System.out.println("����");
		}//end if
		else if(i>39&&i<60) {
			System.out.println("�ٸ� ���� ����");
		}//end if
		else if(i>59&&i<101) {
			System.out.println("�հ�");
		}//end if
		else{
			System.out.println("�߸��� ����");
		}//end else
	}//end score
	
	//4.���ڸ� �Է¹޾� �ش� ���ڰ� "�빮��","�ҹ���","����"������ �Ǵ��Ͽ� ����ϴ� method.
	public void Unicode(char a) {
		if(a>63&&a<91) {
		System.out.println(a+"�� ���ڴ� �빮��");
		}//if
		if(a>96&&a<125) {
			System.out.println(a+"�� ���ڴ� �ҹ���");
		}//if
		else {
			System.out.println(a+"�� ���ڴ� ����");
		}//else
	}//Unicode
	
	//5.�¾ �ظ� �Է¹޾� ���̸� ��ȯ�ϴ� method.
		//(���� ���ϴ� ��:����-����+1)
	public int years() {
		int s=1968;
		return (int)2021-s+1;
	}//years
	
	//6.�� ���� ���� �Է� �޾� �� �� ū ���� ��ȯ�ϰ�  ���� �� ��� ó�� ���� ��ȯ�ϴ� method.
	public int number(int q,int w) {
		q=200;
		w=198;
		if(q>w) {
			return q;
		}//if
		else if(w>q) {
			return w;
		}//else if
		else {
			return q;
		}//else
	}//number
	
	
	public static void main(String[] args) {
		Homework0126 mn=new Homework0126();
		//1.
		mn.MyName();
		//2.
		mn.Initial();
		//3.
		mn.score(100);
		//4.
		mn.Unicode('g');
		//5.
		int temp1=mn.years();
		System.out.println(temp1);
		//6.
		System.out.println(mn.number(1, 2));
	}//main
}//class
