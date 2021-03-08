package day0215;

public class UseInterfaceArgs {
	
	public void useFly(Fly fly) {//interface를 매개변수로 정의
		System.out.println(fly.drivingForce());
		System.out.println(fly.upwardForce());
	}//useFly
	

	public static void main(String[] args) {
		//useFlay method 를 호출.(interface를 객체로 생성=>구현클래스로 가능.)
		//1.인터페이스를 구현한 클래스를 생성한다.
		FlyImpl fly=new FlyImpl();
		//2.인스턴스method를 호출하기위해 객체생성
		UseInterfaceArgs uia=new UseInterfaceArgs();
		
		//3.method를 호출하고 Fly를 구현한 객체를 구현한 arguments로 할당
		uia.useFly(fly);

	}//main
}//class
