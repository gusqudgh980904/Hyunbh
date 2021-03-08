package day0222;

/**
 * �л��� �̸�,����,�ּ�,����,�ڹ������� ������ �������� ����� Ŭ����
 * VO(Value Object)
 *�̸�,����,�ּ�,����,�ڹ������� ������ �� �ִ�Ŭ������ �ۼ��ϼ���
 *���� ������ Ŭ������ ����Ͽ� �Ʒ��� ���� �־� ��ü�� �����ϰ� List�� �߰��Ͽ� ��ȯ�ϴ� method�� �ۼ��ϼ���
 *���μ�,25 ����� ������ ���ﵿ,��,97
 *������,27 ����� ������ ������,��,81
 *�ǿ���,26 ����� ���۱� �󵵵�,��,90
 *�����,30 ��⵵ ������ ���뱸,��,82
 *������,25 ��õ������ ���� ����,��,88
 *setter method�� ���� ����/��ü�� ������ �� ���� �־��ְ�, ���õ� �۾� �߿��� ���� �����Ѵ� ���� ���� ������ ������ setter method�� ���� �ʿ䰡 ����. 
 * @author user
 */
public class StudentVO {
	
	private String name;
	private int age;
	private String address;
	private String gender;
	private int javaScore;
	
	
	public StudentVO() {
		
	}//StudentVO
	
	
	public StudentVO(String name, int age, String address,String gender, int javaScore) {
		this.name=name;
		this.age=age;
		this.address=address;
		this.gender=gender;
		this.javaScore=javaScore;
		
	}//StudentVO


	public String getName() {
		return name;
	}


	public int getAge() {
		return age;
	}


	public String getAddress() {
		return address;
	}


	public String getGender() {
		return gender;
	}


	public int getJavaScore() {
		return javaScore;
	}


	@Override
	public String toString() {
		return name+", " +age+","+address+","+gender+','+javaScore;
	}
	
	


}//class
