package day0121;

public class Homework0121 {
	
	public static final int BUS_FARE=1200;//�������
	public static final int TRAIN_FARE=1300;//���ϫx���
	public static final int TAXI_FARE=3800;//�ýÿ��
	
	public static void main(String[] args) {
		//1. �¾ �ظ� �Է¹޾� �츦 ���ϴ� �ڵ��ۼ�.(�¾ �ظ� 12�� ���� ���������� 0~11�� ���´�. �ش���ڴ� �Ʒ��� ���� �츦 ������.
		//0.������ 1.�� 2.�� 3.���� 4.�� 5.�� 6.ȣ���� 7.�䳢 8.�� 9.�� 10.�� 11.�� ��¿�)1998��� XXX��
		int birth=Integer.parseInt(args[0]);
		System.out.print(birth+"���");
		if(birth%12==0){
		System.out.print(" �����̶�");
		}
		else if(birth%12==1){
			System.out.println(" �߶�");
			}
		else if(birth%12==2){
			System.out.println(" ����");
			}
		else if(birth%12==3){
			System.out.println(" ������");
			}
		else if(birth%12==4){
			System.out.println(" ���");
			}
		else if(birth%12==5){
			System.out.println(" �Ҷ�");
			}
		else if(birth%12==6){
			System.out.print(" ȣ���̶�");
			}
		else if(birth%12==7){
			System.out.print(" �䳢��");
			}
		else if(birth%12==8){
			System.out.print(" ���");
			}
		else if(birth%12==9){
			System.out.print(" ���");
			}
		else if(birth%12==10){
			System.out.print(" ����");
			}
		else if(birth%12==6){
			System.out.print(" ���");
			}
		
		System.out.println();
		//2.
		System.out.print("�Է±�������� ");
		
		if(args[1].equals("����")) {
			System.out.print(args[1]+"�̰�, "+"�����"+BUS_FARE+"�Դϴ�. "
			+ "�պ����"+(BUS_FARE*2)+"�̰�,"+"�Ѵ� 20�� ������� �ϸ�"+(BUS_FARE*2*20)+"�Դϴ�.");	
		}
		else if(args[1].equals("����ö")) {
			System.out.print(args[1]+"�̰�, "+"�����"+TRAIN_FARE+"�Դϴ�. "
			+ "�պ����"+(TRAIN_FARE*2)+"�̰�,"+"�Ѵ� 20�� ������� �ϸ�"+(TRAIN_FARE*2*20)+"�Դϴ�.");
		}
		else if(args[1].equals("�ý�")) {
			System.out.print(args[1]+"�̰�, "+"�����"+TAXI_FARE+"�Դϴ�. "
			+ "�պ����"+(TAXI_FARE*2)+"�̰�,"+"�Ѵ� 20�� ������� �ϸ�"+(TAXI_FARE*2*20)+"�Դϴ�.");
		}
		else {
			System.out.println("��������� ���߱����� �ƴմϴ�.");
		}//else if end
		
		
		
		
		
		
	}//main
}//class
