package day0208;

/**
 * ParentSuper�� �ڽ�Ŭ����
 * @author user
 */
public class ChildSub extends ParentSuper{
	int i;//�θ�Ŭ������ ���� �̸��� ���� ����
	int j;//�ڽ�Ŭ������ ������ �ִ� �̸�
	
	@Override
	public void print() {
		super.i=100;//�̸��� ���� ������ this�� super�� �����ؼ� ����ؾ��ϰ�,
		this.k=200;//this.k=200, super.k=200//�̸��� �����ϸ� this�� super ���� �ᵵ �������
		System.out.println("�ڽ��� i="+this.i+",j="+this.j);
		System.out.println("�ڽ��� i="+i+",j="+j);
		System.out.println("�θ��� i="+super.i+",k="+this.k+",k="+super.k);
		super.print();//�θ��� print ȣ��
	}//print
	
	
	public static void main(String[] args) {
		
	ChildSub cs=new ChildSub();
	cs.print();
			
	}//main
}//class
