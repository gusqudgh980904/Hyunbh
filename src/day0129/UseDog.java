package day0129;

/**
 *	0129 ���� DogŬ������ ��üȭ�ؼ� ���.
 * @author user
 */
public class UseDog {

	public static void main(String[] args) {
		
		
		Dog pet=new Dog();
		pet.setName("����");
		System.out.printf("�� ���� �̸��� %s�̰�, ���� %d��, �ڴ� %d�� ���� %d�� �̰� ������ %d���̴�.",
				pet.getName(),pet.getEye(),pet.getNose(),pet.getMouth(),pet.getTail());
		System.out.println();
		
		System.out.println(pet.cute());
		System.out.println(pet.bark("��",3));
		
	}//main
}//class
