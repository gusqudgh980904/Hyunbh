package day0119;
/**
��������<br>
�Ϲ� ��<br>
&&(AND),||(OR)<br>

��Ʈ ��
*/

class Operator5 {
	public static void main(String[] args) {
		////////�Ϲݳ�////////////////////////
    boolean flag1=true,flag2=false,flag3=true,flag4=false;
	System.out.println("----------------------&&--------------------------");//������ false�� ������ ������ ������� �ʴ´�
	System.out.println(flag1+"&&"+flag3+"="+(flag1&&flag3));
	System.out.println(flag1+"&&"+flag2+"="+(flag1&&flag2));
	System.out.println(flag2+"&&"+flag1+"="+(flag2&&flag1));
	System.out.println(flag2+"&&"+flag4+"="+(flag2&&flag4));


	System.out.println("----------------------||--------------------------");//������ true�� ������ ������ ������� �ʴ´�.
	System.out.println(flag1+"||"+flag3+"="+(flag1||flag3));
	System.out.println(flag1+"||"+flag2+"="+(flag1||flag2));
	System.out.println(flag2+"||"+flag1+"="+(flag2||flag1));
	System.out.println(flag2+"||"+flag4+"="+(flag2||flag4));

	//&&�� ������ �����̸� ������ ������� �ʴ´�.
	flag1=false;
	flag2=false;
	flag3=false;
    flag3=(flag1=3<2) && (flag2=5<6);
	System.out.println("flag1:"+flag3+", flag2: "+flag1+", flag3:"+flag2);

	 int score=101;
	 //���� score���� �Ҵ�� ���� 0~100 ���̶�� true�� �׷��� �ʴٸ� false�� ���
	 //�Ϲ� �� �����ڸ� ����Ͽ� ���
	 //��
	 System.out.println((score>-1)&&(score<=100));

	 System.out.println("------------------��Ʈ������----------------------");
		 int i=25;
	     int j=13;

	System.out.println(i+"&"+j+"="+(i&j));//9

	     i=37;
		 j=7;
	System.out.println(i+"|"+j+"="+(i|j));//39
	     i=17;
		 j=12;
	System.out.println(i+"^"+j+"="+(i^j));//29


	}//main
}//class
