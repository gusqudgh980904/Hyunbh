package day0126.sub;

import day0126.UseAccessModifier;

/**
 *	�ٸ� ��Ű���� �ٸ� Ŭ������ �����ϴ� instance variable�� ���.
 * @author user
 */
public class UseInstanceVariable {

	public static void main(String[] args) {
		//1.��üȭ.(Ŭ������ ��ü��=new Ŭ������();
		UseAccessModifier uam=new UseAccessModifier();
		//public ���� �����ڴ� �ٸ� ��Ű���� �ٸ� Ŭ�������� ��밡��.
		//2.�������.(��ü�� ������)
		System.out.println("public:a"+uam.a);
//		System.out.println("protected:b"+uam.b);
//		System.out.println("default:c"+uam.c);
//	    System.out.println("private:d"+uam.d);
	}//main
}//class
