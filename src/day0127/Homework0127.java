package day0127;


public class Homework0127 {
	//1.���ڸ� �Ű������� �Է¹޾� �Է¹��� ���ڱ����� �������� ���ؼ� ��ȯ�ϴ� method�� �ۼ��� �� ȣ���Ͽ� ��ȯ
	//���� �ް� ����غ�����.
	public int hbh(int a) {//a=������ ������
		int sum=0;//������ �����ϴ� ����
		for(int c=0;c<=a;c++) {
			sum+=c;//����
		}//for
		return sum;
		}//hbh
	
	
	
	
	//2.���ڸ� �Ű������� �Է¹޾� �Է¹��� ���ڰ� 10���� ���� ���� �ش� ���ڱ��� 3�� ��� ���� ���� ����ϴ� ����
	//�ϴ� method�� �ۼ��ϼ���(�Է¹��� ���ڰ� 10���� �۴ٸ�"10���� ū ���� �Է����ּ���"�� ����մϴ�.)
	//2�� ������ �������̿���. ��ȯ���� �����ϴ� ������ �ƴϿ���,
	public void number(int b) {//��������
		int sum1=0;
		if(b>10) {//�̷��� ¥���մϴ�. �����մϴ�   ������ �־����
		for(int d=0;d<=b;d++) {//d�� b���� ���Ѵ�.
			if(d>10&&d%3==0) {//d�� 10����ũ��&&3���� ��������
				System.out.println(sum1+=d);//������ ���Ѵ�
			}//if
		}//for
		}else{
				System.out.println("10���� ū ���� �Է����ּ���");
		}//else if
			}//number
	
	//3.���̸� �Ű������� �Է¹޾� �¾ �ظ� ��ȯ�ϴ� method�� �ۼ��� �� ȣ���Ͽ� ��ȯ�Ǵ� ���� �޾� ���
		public int year(int e) {
			int birth=0;
			birth=2021-e;//�¾��=���ݳ⵵-���ݳ���
			return birth;
		}//year
		
	//4.������ ��ü���� ����ϴ� ���� �ϴ� method�� �ۼ��ϼ���
		public void x() {
			for(int i=2;i<10;i++) {//��
				System.out.print(i+"�ܽ��� ");
				for(int j=1;j<10;j++) {//�������¼�
				System.out.print(i+"X"+j+"="+i*j+" ");
			}//end for
				System.out.println(i+"�ܳ�");
		}//end for
		}//x
		
	//5.�Է¹��� ������ �ϳ��� ����ϴ� ���� �ϴ� method�� �ۼ��ϼ���.(4�� 5���� method�� Override���)
		public void x(int i) {
				if(i<10) {
				System.out.print(i+"�ܽ��� ");
				for(int j=1;j<10;j++) {//�������¼�
				System.out.print(i+"X"+j+"="+i*j+" ");
			}//end for
				System.out.println(i+"�ܳ�");
		}//end for
			
		}

	
	public static void main(String[] args) {
		//1.
		Homework0127 hw=new Homework0127();
		System.out.println(hw.hbh(100));
		System.out.println();
		//2.
		hw.number(15);
		System.out.println();
		//3.
		System.out.println("����� �¾ �ش� "+hw.year(23)+"�⵵ �Դϴ�.");
		System.out.println();
		//4.
		hw.x();
		System.out.println();
		//5.
		hw.x(7);
	}//main
}//class
