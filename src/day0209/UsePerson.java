package day0209;

/**
 *	Person Ŭ������ ��ӹ޾� ����ϴ� �ڽ�Ŭ����
 * @author user
 */
public class UsePerson {

	public static void main(String[] args) {
		
		//�ڽ�Ŭ������ �����Ǹ�, �θ�Ŭ�������� �����ȴ�.
		System.out.println("--------ȫ�浿---------");
		HongGilDong hgd=new HongGilDong();
		//�ڽ�Ŭ������ �������� �ʴ� �ڿ��� �ڽ�Ŭ������ ��ü������ ����� �� �ִ�.(�ڵ������뼺)
		System.out.println(hgd.getEye()+"/"+hgd.getMouth()+"/"+hgd.getNose()+"/"+hgd.getName());
		hgd.setName("ȫ�浿");
		System.out.println(hgd.getEye()+"/"+hgd.getMouth()+"/"+hgd.getNose()+"/"+hgd.getName());
		
		System.out.println(hgd.eat());//�ڵ��� ����
		System.out.println(hgd.eat("�߲��� ����",10));
		//�ڽ��� ���� �ڽŸ��� Ư¡ (Clark���� ���� ȫ�浿�� ���� Ư¡)
		System.out.println(hgd.fight(5));//�̱�°�� // 6->7
		System.out.println(hgd.fight(6));//�̱�°�� //7->8
		System.out.println(hgd.fight(9));//���� ��� //8->7
		System.out.println(hgd.fight(7));//���°�� //7
		
		//ȫ�浿�� ���� ������ ���
		System.out.println(hgd.getName()+"�� ���緹���� "+hgd.getLevel());
		
		System.out.println("--------Clark---------");
		Clark superman=new Clark();
		superman.setName("Ŭ����Ʈ");
		System.out.println(superman.getEye()+"/"+superman.getNose()+"/"+superman.getMouth()+"/"+superman.getName());//�ڵ�������
		
		System.out.println(superman.eat());//Override
		System.out.println(superman.eat("������ũ",20));//Override
		
		System.out.println(superman.power("¯��"));//������
		System.out.println(superman.power("���̾Ƹ��"));//��
		System.out.println(superman.power("ũ���䳪��Ʈ"));//������
		
		//instance variable�� ���� �����ڰ� public �̱⶧���� getter method�� ������� �ʰ�
		//���� ������ �� �ִ�.
		System.out.println(superman.getName()+"�� ���� ���� "+superman.power);
		
		System.out.println("----------------���--------------------");
		String[] hongLang=hgd.language();
		String[] clarkLang=superman.language();
		System.out.print(hgd.getName()+"�� ������ �� �ִ� ���� ");
		for(int i=0;i<hongLang.length;i++) {
			System.out.println(hongLang[i]);
		}//for
		
		System.out.println(superman.getName()+"�� ������ �� �ִ� ����");
		for(String lang:clarkLang) {
			System.out.println(lang);
		}//improvementFor
		
		System.out.println("----------------����--------------------");
		Hbh I=new Hbh();
		I.setName("����ȣ");
		String[] meLang=I.language();
		System.out.println(I.eat());
		System.out.println(I.eat("����",5000));
		System.out.println(I.compare(181));
		System.out.println(I.compare(179));
		System.out.println(I.compare(180));
		System.out.println(I.getName()+"�� ������ �� �ִ� ���� ");
		for(String lang:meLang) {
			System.out.println(lang);
		}//improvementFor
		
		
		
		
		
		
		
		
		
	}//main
}//class
