package day0218;

import java.util.Stack;

/**
 * Stack�� Vector�� �ڽ� Ŭ������ Multi Thread���� ���������� �Ұ���
 * LIFO(Last Input First Out)
 * @author user
 */
public class UseStack {
	
	public UseStack() {
		//1.����
		Stack<String> stk=new Stack<String>();
		
		//2.��(item) �ֱ�
		stk.push("�ϼ���?");
		stk.push("�ȳ�");
		stk.push("���õ�");
//		System.out.println(stk);
//		
//		//3.�����
//		System.out.println(stk.pop());
//		System.out.println(stk.pop());
//		System.out.println(stk.pop());
//		System.out.println(stk);
		while(!stk.empty()) {//empty ������ ����ִٸ� true,ä�����ִٸ� false
			System.out.println(stk.pop());
		}//while
		
		
	}//UseStack

	public static void main(String[] args) {
		new UseStack();

	}//main

}//class
