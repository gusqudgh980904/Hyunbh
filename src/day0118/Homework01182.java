package day0118;
class Homework01182 {    
	public static void main(String[] args) {
        
        //������:byte.short.int.long
		System.out.println("Byte���� �ִ밪 "+Byte.MAX_VALUE+" Byte���� �ּҰ� "+Byte.MIN_VALUE);
		System.out.println("ShortŸ���� �ִ밪 "+Short.MAX_VALUE+" ShortŸ���� �ּҰ� "+Short.MIN_VALUE);
		System.out.println("IntegerŸ���� �ִ밪 "+Integer.MAX_VALUE+" IntegerŸ���� �ּҰ� "+Integer.MIN_VALUE);
		System.out.println("LongŸ���� �ִ밪 "+Long.MAX_VALUE+" LongŸ���� �ּҰ� "+Long.MIN_VALUE);
		//������:char     �ּҰ�\u0000=0 �ִ밪    \uFFFF=65535
		System.out.println("Character���� �ִ밪 "+((int)Character.MAX_VALUE)+" Character���� �ּҰ� "+((int)Character.MIN_VALUE));
		//�Ǽ���:float,double
		System.out.println("FloatŸ���� �ִ밪 "+Float.MAX_VALUE+" FloatŸ���� �ּҰ� "+Float.MIN_VALUE);
		System.out.println("DoubleŸ���� �ִ밪 "+Double.MAX_VALUE+" DoubleŸ���� �ּҰ� "+Double.MIN_VALUE);
		//boolean��
		System.out.print("BooleanŸ���� �ִ밪 "+Boolean.TRUE+" BooleanŸ���� �ּҰ� "+Boolean.FALSE);
	}//main
}//class
