package day0128;

/**
 *	��ī�� Ŭ������ ��ü�� �����Ͽ� ����ϴ� Ŭ����.
 * @author user
 */
public class UseMarker {
	
	public static void main(String[] args) {
		System.out.println(new Marker());
		//1.��üȭ: Marker class�� �����Ͽ� black�̶�� ��ü�� �Ҵ�.
		Marker black=new Marker();
//		black.setBody(1);
//		black.setCap(1);
//		black.setColor("������");
		//black.color="������";
		//������ ���������ڰ� public�϶����� Ŭ���� �ܺο��� �����Ӱ� ���� ������ �� �ִ�.
		//���� �����Է������� �����ϱ� ��ƴ�./�̷��� ������ public�� �������� �ʴ´�.
		System.out.println("��ī�濡 ������ ��,�Ѳ�:"+black.getCap()+", ��ü:"+black.getBody()+", ��:"+black.getColor());
		
		//2.������ ��ü ���
		black.setColor("�Ķ���");
		System.out.println(black.write("�ȳ��ϼ���"));//������ ��ī���� ���
		
		System.out.println("-------------------------------------------");
		//������ ��ī�� ����.
		Marker red=new Marker("������",2,2);//������,��ü�� 1�� �Ѳ��� 2��
		
		System.out.println(red.getCap()+"/"+red.getBody());
		System.out.println(red.write("Hello"));
		

	}//main
}//class
