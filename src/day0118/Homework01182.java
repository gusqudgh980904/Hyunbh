package day0118;
class Homework01182 {    
	public static void main(String[] args) {
        
        //정수형:byte.short.int.long
		System.out.println("Byte형의 최대값 "+Byte.MAX_VALUE+" Byte형의 최소값 "+Byte.MIN_VALUE);
		System.out.println("Short타입의 최대값 "+Short.MAX_VALUE+" Short타입의 최소값 "+Short.MIN_VALUE);
		System.out.println("Integer타입의 최대값 "+Integer.MAX_VALUE+" Integer타입의 최소값 "+Integer.MIN_VALUE);
		System.out.println("Long타입의 최대값 "+Long.MAX_VALUE+" Long타입의 최소값 "+Long.MIN_VALUE);
		//문자형:char     최소값\u0000=0 최대값    \uFFFF=65535
		System.out.println("Character형의 최대값 "+((int)Character.MAX_VALUE)+" Character값의 최소값 "+((int)Character.MIN_VALUE));
		//실수형:float,double
		System.out.println("Float타입의 최대값 "+Float.MAX_VALUE+" Float타입의 최소값 "+Float.MIN_VALUE);
		System.out.println("Double타입의 최대값 "+Double.MAX_VALUE+" Double타입의 최소값 "+Double.MIN_VALUE);
		//boolean형
		System.out.print("Boolean타입의 최대값 "+Boolean.TRUE+" Boolean타입의 최소값 "+Boolean.FALSE);
	}//main
}//class
