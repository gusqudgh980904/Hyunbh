package day0216;

public class UseStringBuilder {
	
	 public void useStringBuffer() {
			//1.����
			StringBuffer sb=new StringBuffer();
			//2.���
			//��.�߰�append()
			sb.append("�ȳ�.");//���ڿ��߰�
			sb.append(2021);//�����߰�
			sb.append("��");//���ڿ��߰�
			sb.append('A');//�����߰�
			sb.append(2.16);//�Ǽ��߰�
			sb.append(true);//
			
			//������ insert(�߰��� ��ġ �ε���,��)
			//�ȳ�.2021��A2.16true
			//.�� ��ġ�� "��"���ڿ��� �߰�
			sb.insert(10,"��");
			sb.insert(14,"��");
			
			//���� "2021��"�� ���� delete(�����ε���,���ε���+1)
			sb.delete(3,8);
			//���ڿ�������
			sb.reverse();
			sb.reverse();
		 
			System.out.println(sb);
	 }//useStringBuffer
	 
	 
	 public void useStringBuilder(String file1, String file2) {
			//1.����
			StringBuilder sb=new StringBuilder();
			//2.���
			//��.�߰�append()
			sb.append("�ȳ�.");//���ڿ��߰�
			sb.append(2021);//�����߰�
			sb.append("��");//���ڿ��߰�
			sb.append('A');//�����߰�
			sb.append(2.16);//�Ǽ��߰�
			sb.append(true);//
			
			//������ insert(�߰��� ��ġ �ε���,��)
			//�ȳ�.2021��A2.16true
			//.�� ��ġ�� "��"���ڿ��� �߰�
			sb.insert(10,"��");
			sb.insert(14,"��");
			
			//���� "2021��"�� ���� delete(�����ε���,���ε���+1)
			sb.delete(3,8);
			//���ڿ�������
			sb.reverse();
			sb.reverse();
		 
			System.out.println(sb);
	 }//useStringBuilder
	 

	public static void main(String[] args) {
		UseStringBuilder usb=new UseStringBuilder();
		usb.useStringBuffer();
		System.out.println("---------------------");
		usb.useStringBuilder(null, null);
		System.out.println("---------------------");
		
	
		String file1="c:/dev/test.txt.doc";
		String file2="c:/work/test/day0216/Test.java";
		//StringBuilder�� ����Ͽ� "c:/dev/test.txt.doc"->"c:/dev/test.txt.temp.doc"�� ����
		StringBuilder sbFile1=new StringBuilder(file1);
		sbFile1.insert(sbFile1.lastIndexOf("."),".temp");
		System.out.println(sbFile1);
		//StringBuilder�� ����Ͽ� "c:/work/test/day0216/Test.java"->"c:/work/day0216/Test.java"�� ����
		StringBuilder sbFile2=new StringBuilder(file2);
		sbFile2.delete(7, 12);
		System.out.println(sbFile2);
		
		
	}//main
}//class
