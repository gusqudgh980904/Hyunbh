package day0216;

/**
 * ����� ���� �ڷ���.
 * �ڹٿ��� �����ϴ� ���������� �����Ͽ� �������� ������ ������ �������� ����� Ŭ����.
 * VO(Value Object)
 * 
 * �л��� ������ �й�,�̸�,����,Ű�� �����ȴ�
 * @author user
 */
public class StudentVO {
	
	private int regiNum;//�й�
	private String name;//�̸�
	private int age;//����
	private double height;//Ű
	
	/**
	 * �л��� ��� ������ ���� ���� �� ����ϴ� ������
	 * ���������� setter method�� ����Ͽ� �Է��Ѵ�
	 */
	public StudentVO() {
		
	}//StudentVo
	
	/**
	 * �л��� ��� ������ �� �� ����ϴ� ������
	 * @param regiNum
	 * @param name
	 * @param age
	 * @param height
	 */
	public StudentVO(int regiNum,String name,int age,double height) {
		this.regiNum=regiNum;
		this.name=name;
		this.age=age;
		this.height=height;
	}//StudentVO

	public int getRegiNum() {
		return regiNum;
	}

	public void setRegiNum(int regiNum) {
		this.regiNum = regiNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "StudentVO [regiNum=" + regiNum + ", name=" + name + ", age=" + age + ", height=" + height + "]";
	}

	

}//class
