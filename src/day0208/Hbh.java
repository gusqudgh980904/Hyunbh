package day0208;

/**
 * 0208 ����
 * �ڽŰ� Ÿ���� ����ȭ �� �� �ִ� Ư¡�� �����ϰ�, PersonŬ������ ��ӹ޾�
 * �ڽ��� Ư¡�� ������ Ŭ������ �����ϼ���.
 * @author user
 */
public class Hbh extends Person {
	
	private int height;
	
	/**
	 * �⺻������ �� Ű
	 */
	public Hbh() {
		
		height=180;
	}//Hbh
	
	@Override
	public String eat(String menu,int price) {
		return getName()+"�� ������ "+menu+"�� ������ "+price+"�� ���� ��ο��� ���ѸԴ´�.";
	}//eat
	
	/**
	 * ����� �� Ű�� ��
	 * @param yourheight
	 * @return
	 */
	public String compare(int yourheight) { //���ϴ� ���� ���ϴ� �ǰ���?
		String result="";
		if(height<yourheight) {
			result=yourheight+"���� ���� �۴�.";
		}else if(height>yourheight) {
			result=yourheight+"���� ���� ũ��.";
		}else {
			result=yourheight+"�� �Ȱ���.";
		}//end if
		
		return result;
	}//compare
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}//Homework0208 extends Person
