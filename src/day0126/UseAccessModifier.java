package day0126;

/**
 *	instance variable�� ����������.
 *	public: Ŭ���� �ܺο��� ���ٰ���. ��Ű���� �޶� ���ٰ���.<br>
 *	protected:���� ��Ű���� �ٸ� Ŭ�������� ���ٰ���. ��Ű���� �ٸ��� �ڽ�Ŭ������ ���� ����.<br>
 *	default:���� ��Ű���� �ٸ� Ŭ�������� ���ٰ���. ��Ű���� �ٸ��� ���ٺҰ�.���x<br>
 *	private: Ŭ�����ȿ����� ��밡��. �ܺο����� ���� �Ұ���.
 * @author user
 */
public class UseAccessModifier {
	
	public int a;
	protected int b;
	int c;
	private int d;
	
	public static void main(String[] args){
		UseAccessModifier uam=new UseAccessModifier();
		//������ ���� Ŭ���� �ȿ��� ��üȭ�� �ϸ� ���������ڿ� ������ ��� ������ ���
		System.out.println("public:a"+uam.a);
		System.out.println("protected:b"+uam.b);
		System.out.println("default:c"+uam.c);
		System.out.println("private:d"+uam.d);
		
	}//main
}//class
