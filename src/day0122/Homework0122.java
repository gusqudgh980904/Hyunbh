package day0122;

import day0121.Homework0121;

public class Homework0122 {

	public static void main(String[] args) {

	//1.���߱������,�̵��Ÿ��� �Է� �޾� �Ʒ��� ���� ����ϼ���.
		//*��ȿ��:���߱��� ������ ����,����ö,�ý� �̸� �ش� ��������� �ƴϸ�"�Է��Ͻ� ��������� ���߱����� �ƴմϴ�."�� ���.
        // *�̵��Ÿ��� 10km�̳��� �⺻ ����̸� 10km�� �ʰ����� �� �� 5km���� 100���� �߰������ �ٴ´�.
		//*������� ��:�Է±������ ~�̰�,�⺻��� ~���Դϴ�.�̵��Ÿ� ~km�̰�, �� ����� ~���Դϴ�.
		
		System.out.print("�Է±�������� ");
		int busfare=Homework0121.BUS_FARE;
		int trainfare=Homework0121.TRAIN_FARE;
		int taxifare=Homework0121.TAXI_FARE;
		int km=16;//�̵��Ÿ�
		int af=100;//�߰����
		if(args[0].equals("����")&&km<15) {
			System.out.print(args[0]+"�̰� "+", �⺻���"+busfare+"�Դϴ�. "+"�̵��Ÿ� "+km+"�̰� "+"�� �����"+busfare+"���Դϴ�.");
		}
		else if(args[0].equals("����")&&km>16) {
			System.out.print(args[0]+"�̰� "+", �⺻���"+busfare+"�Դϴ�. "+"�̵��Ÿ� "+km+"�̰� "+"�� �����"+(km*busfare+af)+"���Դϴ�.");
		}
		if(args[0].equals("�ý�")&&km<15) {
			System.out.print(args[0]+"�̰� "+", �⺻���"+taxifare+"�Դϴ�. "+"�̵��Ÿ� "+km+"�̰� "+"�� �����"+taxifare+"���Դϴ�.");
		}
		else if(args[0].equals("�ý�")&&km>16) {
			System.out.print(args[0]+"�̰� "+", �⺻���"+taxifare+"�Դϴ�. "+"�̵��Ÿ� "+km+"�̰� "+"�� �����"+(km*taxifare+af)+"���Դϴ�.");
		}
		if(args[0].equals("����ö")&&km<15) {
			System.out.print(args[0]+"�̰� "+", �⺻���"+trainfare+"�Դϴ�. "+"�̵��Ÿ� "+km+"�̰� "+"�� �����"+trainfare+"���Դϴ�.");
		}
		else if(args[0].equals("����ö")&&km>16) {
			System.out.print(args[0]+"�̰� "+", �⺻���"+trainfare+"�Դϴ�. "+"�̵��Ÿ� "+km+"�̰� "+"�� �����"+(km*trainfare+af)+"���Դϴ�.");
		}
		else {
			System.out.println("��������� ���߱����� �ƴմϴ�.");
		}//else if end
		
		
		System.out.println();
	//2.1�������� 100������ �ݺ��ϸ鼭 �Ʒ��� ���� ���.
	//   ��)1 2 ¦ 4 5 ¦ 7 8 ¦......
		for(int i=1;i<=100;i++) {
			if (i%3==0) {
				System.out.print("¦");
				continue;
				}//if
			System.out.print(i+" ");
		}//for
		
		
		
		
		
		
	}//main
}//class
