package day0215;

public class UseInterfaceArgs {
	
	public void useFly(Fly fly) {//interface�� �Ű������� ����
		System.out.println(fly.drivingForce());
		System.out.println(fly.upwardForce());
	}//useFly
	

	public static void main(String[] args) {
		//useFlay method �� ȣ��.(interface�� ��ü�� ����=>����Ŭ������ ����.)
		//1.�������̽��� ������ Ŭ������ �����Ѵ�.
		FlyImpl fly=new FlyImpl();
		//2.�ν��Ͻ�method�� ȣ���ϱ����� ��ü����
		UseInterfaceArgs uia=new UseInterfaceArgs();
		
		//3.method�� ȣ���ϰ� Fly�� ������ ��ü�� ������ arguments�� �Ҵ�
		uia.useFly(fly);

	}//main
}//class
