package day0125;

import javax.swing.JOptionPane;

/**
 *	do~while<br>
 *	���۰� ���� �𸦶� ����ϴ� �ݺ���.<br>
 *	�ּ� 1�� ����, �ִ� ���Ǳ��� ����.<br>
 *	do{<br>
 *		�ݺ����� ����;<br>
 *}while(���ǽ�);
 * @author user
 */
public class TestDoWhile {

	public static void main(String[] args) {
		
		int i=100;//�ʱⰪ
		do {
			System.out.println("�ȳ�"+i);//�ݺ����� ����.
		i++;
		}while(i<10);//���ǽ�
		
		/////�޴��� ����
		boolean exitFlag=false;
		do {
			String menu=JOptionPane.showInputDialog("�޴�����\n1.�Է� 2.��� 3.���� 4.����");
			if(menu.equals("4")) {
				exitFlag=true;
			}//end if
		}while(!exitFlag);
		
		System.out.println();
		//���� loop
		do {
			System.out.println("���ѷ���");
			break;//do~while Ż��. 
		}while(true);

	}//main
}//class
