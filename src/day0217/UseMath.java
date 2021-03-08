package day0217;

/**
 * Math class
 * 생성자가 존재하지 않아 객체생성을 하지 않고 사용하는 클래스
 * @author user
 */
public class UseMath {
	
	public UseMath() {
//		Math m=new Math();//생성자가 없으므로 객체 생성할 수 없다.
		int i=-2021;
		double d=-2021.02;
		System.out.println(i+"의 절댓값"+Math.abs(i));
		System.out.println(d+"의 절댓값"+Math.abs(d));
		
		d=10.1;
		System.out.println(d+"올림"+Math.ceil(d));
		d=10.01;
		System.out.println(d+"올림"+Math.ceil(d));
		d=10.001;
		System.out.println(d+"올림"+Math.ceil(d));
		d=10.0;
		System.out.println(d+"올림"+Math.ceil(d));
		
		d=10.9;
		System.out.println(d+"반올림"+Math.round(d));
		d=10.3;
		System.out.println(d+"반올림"+Math.round(d));
		
		d=10.9;
		System.out.println(d+"내림"+Math.floor(d));
		
		//절삭-casting으로 처리
		System.out.println(d+"절사"+(int)d);
		

		double ran=Math.random();
		System.out.println("발생한 난수:"+ran);
		System.out.println("범위의 난수:"+ran*10);//0~9까지 10개의 주중 하나 얻기(실수 발생)
		System.out.println("범위의 난수:"+(int)(ran*10));//0~9까지 10개의 주중 하나 얻기
		
		//1~10의 수 중 난수
		System.out.println("범위의 난수:"+((int)(ran*10)+1));//1~10까지 10개의 주중 하나 얻기
		
		//A~Z까지 아무 문자나 얻기
		//A:65~Z:90
		System.out.println((char)((int)(Math.random()*26)+65));
		//a~z까지 아무 문자나 얻기
		//a:97~z:122
		System.out.println((char)((int)(Math.random()*26)+97));
		//0(48)~9(57)까지 아무 문자 얻기
		System.out.println((char)((int)(Math.random()*10)+48));
		
	}//UseMath

	public static void main(String[] args) {
		new UseMath();
	}//main
}//class
