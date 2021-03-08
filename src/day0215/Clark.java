package day0215;

/**
 * ����� ����Ư¡�� ����� �޾� ����ϰ�,�������� ����� �����Ͽ� ����ϴ� Ŭ����
 * (Person�� ��ӹް�,Fly�� ������ �ڽ�Ŭ����)<br>
 * ��,��,��,�̸�,�Դ� ���� �θ�Ŭ�������� �����ϴ� ���� ����ϰ�(�ڵ��� ���뼺),
 * �ڽŸ��� Ư¡�� �����ϴ� Ŭ����.
 * @author user
 *
 */

public class Clark extends Person implements Fly {
	
	public int power;
	
	/**
	 * Ŭ�� Ŭ������ �⺻������
	 * ��ü�� ������ �� �⺻������ ������ �־���� �� ����
	 * �� ������ 1~100���� �����ϰ� Ŭ���� ���� ������ ���� ������ 80�� �������� �¾��.
	 */
	public Clark() {
		power=80;
	}//Clark
	
	@Override
	public String eat() {
		return getName()+"�� ������ ���� '�;�'�ϰ� �Դ´�.";
	}//eat
	
	@Override
	public String eat(String menu, int price) {
		return getName()+"�� ����������� "+menu+"�� ������ "+price+"$���� ��Ծ���.";
	}//eat
	
	/**
	 * Ŭ���� ���� �����ϴ� ��. ũ���䳪��Ʈ�� �ԷµǸ� ���� ������
	 * @param stone ���� ����
	 * @return
	 */
	public String power(String stone) {
		String result=stone;
		
		if (stone.equals("ũ���䳪��Ʈ")) {
			power=0;
			result+="���� ������.~(_._)~";
		}else if(stone.equals("���̾Ƹ��")) {
			power=80;
			result+="�����մϴ�.o(^^O)(O^^)o";
		}else {
			power=110;
			result+="(--+)";
		}//end else
		
		return result;
	}//power

	/**
	 * Ŭ���� ����,���Ͼ�,�ܰ�� �� �� �ִ�
	 */
	@Override
	public String[] language() {
		//������ �迭�� �⺻�� �������� �����ϰ� ��ȯ
		String[] lang= {"����","���Ͼ�","�ܰ��"};
		return lang;
	}//language
	
	
	//////////////////Fly�� abstract method Override////////////////////
	public String upwardForce() {
		return getName()+"�� ����� 9,894,73326Pa�� �����ȴ�";
	}
	public String drivingForce() {
		return getName()+"�� �������� 1000km/h�� �����ȴ�";
	}
	
	
	
	

}//class