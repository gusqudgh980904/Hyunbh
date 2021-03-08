package day0209;

/**
 *	리모콘이 가지고 있는 기본 기능
 *	파워버튼,취침버튼,위아래버튼
 * @author user
 */
public abstract class RemoteControl {
	
	public RemoteControl() {//기본생성자
		
	}//RemoteControl
	
	public abstract void power(String msg);//파워버튼
	public abstract void sleep(String msg);//취침버튼
	
	
	
	
	
	

}//class
