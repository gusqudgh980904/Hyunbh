package day0219;

/**
 * �л���������� Ŭ����.
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
public class StudentInformation {
	
	private String name;
	private int age;
	private String address;
	private String sex;
	private int javaScore;
	
	
	public StudentInformation() {
		
	}//StudentInformation
	
	
	public StudentInformation(String name, int age, String address,String sex, int javaScore) {
		this.name=name;
		this.age=age;
		this.address=address;
		this.sex=sex;
		this.javaScore=javaScore;
		
	}//StudentInformation


	public String getName() {
		return name;
	}


//	public void setName(String name) {
//		this.name = name;
//	}


	public int getAge() {
		return age;
	}


//	public void setAge(int age) {
//		this.age = age;
//	}


	public String getAddress() {
		return address;
	}


//	public void setAddress(String address) {
//		this.address = address;
//	}


	public String getSex() {
		return sex;
	}


//	public void setSex(String sex) {
//		this.sex = sex;
//	}


	public int getJavaScore() {
		return javaScore;
	}


//	public void setJavaScore(int javaScore) {
//		this.javaScore = javaScore;
//	}


	@Override
	public String toString() {
		return name+", " +age+","+address+","+sex+','+javaScore;
	}
	
	


}//class
