package day0209;

/**
 * ����� ����Ư¡�� ����ϴ� Ŭ����(Person�� ��ӹ޴� �ڽ�Ŭ����)<br>
 * ��,��,��,�̸�,�Դ� ���� �θ�Ŭ�������� �����ϴ� ���� ����ϰ�(�ڵ��� ���뼺),
 * �ڽŸ��� Ư¡�� �����ϴ� Ŭ����.
 * @author user
 *
 */
public class HongGilDong  extends Person {
	
	private int level;
	
	/**
	 * ȫ�浿 Ŭ������ �⺻������
	 * ��ü�� ������ �� �⺻������ ������ �־���� �� ����
	 * �ο� ������ 1~10���� �����ϰ� ȫ�浿�� �ο� ������ ���� ������ 6�� ������ �¾��.
	 */
	public HongGilDong() {
		
		level=6;
		
	}//HongGildong
	
	@Override
	public String eat() {
	return getName()+"�� ������ ���� �Դ´�."	;
	}//eat
	
	/**
	 * �θ�Ŭ������ �����ϴ� ����� �ڽ�Ŭ�������� ���� ���� ��, �ڽ�Ŭ������ ��Ȳ�� �µ��� method�� �������Ѵ�.
	 */
	@Override
	public String eat(String menu,int price) {
		//�ڽ� Ŭ������ name������ private ���������ڸ� ������ �־,�ڽ�Ŭ���������� ���� ����� �� ����.
		//���� �ڽ� Ŭ������ �θ�Ŭ������ private �ڿ��� ����ϱ� ���� getter method�� ����Ѵ�.
		return getName()+"�� �ָ����� "+menu+"�� ������ "+price+"�� ���� ��Ծ���.";
	}//eat
	
	/**
	 * �ڽ�Ŭ������ �ڽŸ��� Ư¡(�ο����)
	 * @param yourLevel
	 * @return
	 */
	public String fight(int yourLevel) {
		String result="";//empty
		
		if(level<yourLevel) {//������ ������ ���� ���:���� ���
			result=yourLevel+"���� ����.OTL";
			level--;//��������
			if(level<1) {
				level=1;
			}//if
			
		}else if(level>yourLevel) {//������ ������ ���� ���:�̱�� ���
			result=yourLevel+"���� �̰��.b(^.^)d";
			level++;
			if(level>10) {
				level=10;
			}//if
			
		}else {//���� ���
			result=yourLevel+"���� ����.(--+)";
			//������ ��ȭ�� ����.
		}//end else
		
		return result;
		
	}//fight
	
	public int getLevel() {
		System.out.println("method�� ȣ���ϴ� ��ü�� heap�ּ�"+this);
//		System.out.println("method�� ȣ���ϴ� ��ü�� �θ� heap�ּ�"+super);
		return level;
	}//getLevel

	/**
	 * ȫ�浿�� �ѱ���� ���־ ������ �� �ִ�.
	 * @return �������
	 */
	@Override
	public String[] language() {
		//������ �迭�� ������ �������� �����Ͽ� ��ȯ
		//1.����:��������[] �迭��=null;
		String[] lang=null;
		//2.����:�迭��=new ��������[���� ����];
		lang=new String[2];
		//3.���Ҵ�:�迭��[���ǹ�ȣ]=��;
		lang[0]="�ѱ���";
		lang[1]="���־�";
		return lang; 
	}//language
	

}//class
