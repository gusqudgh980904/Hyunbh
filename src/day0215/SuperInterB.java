package day0215;

/**
 * 인터페이스는 인터페이스끼리 상속된다.(다중상속)
 * @author user
 */
public interface SuperInterB extends SuperInterA/*,TestInter*/ {
	//자식인터페이스에서 부모인터페이스의 추상 method를 Override할 수 있지만 달라지는 것이 없으므로 굳이 Override를 안한다
	@Override
	public void methodA();
	

}//interface
