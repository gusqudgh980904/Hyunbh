package day0129;

/**
 *	�����ü�� �����ϰ� ����ϴ� Ŭ����.
 * @author user
 */
public class UsePerson {

	public static void main(String[] args) {
		
		//��üȭ
		Person hyunwoo=new Person();
		
		//��ü�� �������� �� ����:setter method
//		hyunwoo.setEye(2);//�����ڰ� ���ǵǾ����Ƿ� setter method�� ȣ���� �ʿ䰡 ����.
//		hyunwoo.setNose(1);
//		hyunwoo.setMouth(1);
		hyunwoo.setName("������");
		//��ü�� ���� ���� ���:getter method.
		System.out.printf("������ ��� ��ü�� �� %d�� �� %d�� ��%d�� �̸� %s\n"
		,hyunwoo.getEye(),hyunwoo.getNose(),hyunwoo.getMouth(),hyunwoo.getName());
		
		//������ ��ü�� ���
		System.out.println(hyunwoo.eat("�߲��� ����",7000));
		
		
		System.out.println("--------------------------------");
		
		
		Person jinban=new Person(3,1,1);
		jinban.setName("õ����");
		System.out.printf("�̸� %s �� %d �� %d �� %d\n",
		jinban.getName(),jinban.getEye(),jinban.getNose(),jinban.getMouth());
		
		System.out.println(jinban.eat());
		System.out.println(jinban.eat("����",2));
		
		
		
		
		
	}//main
}//class
