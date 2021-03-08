package day0208;

/**
 * ParentSuper의 자식클래스
 * @author user
 */
public class ChildSub extends ParentSuper{
	int i;//부모클래스와 같은 이름의 변수 존재
	int j;//자식클래스만 가지고 있는 이름
	
	@Override
	public void print() {
		super.i=100;//이름이 같은 변수는 this와 super를 구분해서 사용해야하고,
		this.k=200;//this.k=200, super.k=200//이름이 유일하면 this나 super 뭘로 써도 상관없다
		System.out.println("자식의 i="+this.i+",j="+this.j);
		System.out.println("자식의 i="+i+",j="+j);
		System.out.println("부모의 i="+super.i+",k="+this.k+",k="+super.k);
		super.print();//부모의 print 호출
	}//print
	
	
	public static void main(String[] args) {
		
	ChildSub cs=new ChildSub();
	cs.print();
			
	}//main
}//class
