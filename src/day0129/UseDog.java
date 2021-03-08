package day0129;

/**
 *	0129 숙제 Dog클래스를 객체화해서 사용.
 * @author user
 */
public class UseDog {

	public static void main(String[] args) {
		
		
		Dog pet=new Dog();
		pet.setName("이즈");
		System.out.printf("이 개의 이름은 %s이고, 눈은 %d개, 코는 %d개 입은 %d개 이고 꼬리는 %d개이다.",
				pet.getName(),pet.getEye(),pet.getNose(),pet.getMouth(),pet.getTail());
		System.out.println();
		
		System.out.println(pet.cute());
		System.out.println(pet.bark("나",3));
		
	}//main
}//class
