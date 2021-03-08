package day0209;

/**
 *	TV리모컨
 * @author user
 */
public class TV extends RemoteControl {
	
	private int channel;

	/**
	 *	전원버튼
	 */
	@Override
	public void power(String msg) {
		if(msg.equals("켠다")) {
			System.out.println("TV전원을 킵니다.");
		}else if(msg.equals("끈다")) {
			System.out.println("TV전원을 끕니다");
		}//if
	}//power

	/**
	 *	취침버튼
	 */
	@Override
	public void sleep(String msg) {
		if(msg.equals("취침모드 켜기")) {
			System.out.println("취침모드 ON");
		}else if(msg.equals("취침모드 끄기")) {
			System.out.println("취침모드 OFF");
		}//if
	}//sleep

}//class
