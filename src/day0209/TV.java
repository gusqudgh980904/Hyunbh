package day0209;

/**
 *	TV������
 * @author user
 */
public class TV extends RemoteControl {
	
	private int channel;

	/**
	 *	������ư
	 */
	@Override
	public void power(String msg) {
		if(msg.equals("�Ҵ�")) {
			System.out.println("TV������ ŵ�ϴ�.");
		}else if(msg.equals("����")) {
			System.out.println("TV������ ���ϴ�");
		}//if
	}//power

	/**
	 *	��ħ��ư
	 */
	@Override
	public void sleep(String msg) {
		if(msg.equals("��ħ��� �ѱ�")) {
			System.out.println("��ħ��� ON");
		}else if(msg.equals("��ħ��� ����")) {
			System.out.println("��ħ��� OFF");
		}//if
	}//sleep

}//class
