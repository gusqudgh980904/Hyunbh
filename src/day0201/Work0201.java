package day0201;

/**
 *	�ֹι�ȣ�� �Է¹޾Ƽ� ����üũ, -�� ��ġ üũ, �������, ����, ����, �츦 ���ϴ� �ϵ���
 *	������ class<br>
 *	�Ű����� �ִ� �����ڸ� ����Ͽ� ��üȭ�� �� ���<br>
 *	��뿹)<br>
 *	Work0201 ��ü��=new Work0201("�ֹε�Ϲ�ȣ");<br>
 *	��ü��.method��();���� ������ ���� ���.<br>
 *	����� Ǯ��
 * @author user
 */
public class Work0201 {
	
	private String ssn;
	
	/**
	 * �Է¹��� �ֹι�ȣ�� instance variable�� �����ϴ� ������
	 * @param ssn ������ �ֹε�Ϲ�ȣ.
	 */
	public Work0201(String ssn) {//default constructor
		this.ssn=ssn;
	}//Work0201
	
	/**
	 * ��ü(instance)�� ������ �ִ� ��(instance variable)�� ��ȯ�ϴ� ��
	 * @return �Էµ� �ֹι�ȣ
	 */
	public String getSsn() {
		return ssn;
	}//getSsn
	
	/**
	 * instance variable�� �����Ǿ��ִ� �ֹι�ȣ�� ���̰� 14�������� üũ�ϴ� ��
	 * @return �ֹι�ȣ ������ ��������
	 */
	public boolean chkSsnLength() {//boolean���̱� ������ ������ true false�� ������ ������ 
		//���� if���� �Ƚᵵ �ȴ�.
//		boolean ssnFlag=false;
//		if(ssn.length()==14) {
//			ssnFlag=true;
//		}//if
		return ssn.length()==14;//����� �־��ָ� ������ �ö�
	}//chkSsnLength
	
	/**
	 * instance variable�� �����Ǿ��ִ� �ֹι�ȣ��-�� ��Ȯ�� ��ġ�� �����ϴ��� üũ�ϴ� ��
	 * @return ��ġ ����
	 */
	public boolean chkHyphen() {
		return ssn.indexOf("-")==6;//����� �־��ָ� ������ �ö�
	}//chkHyphen
	
	/**
	 * �ֹι�ȣ���� �¾ �ظ� �����ѿ� ��ȯ�ϴ� ��
	 * @return
	 */
	private int getBirthYear() {
		
		int birth=0;
		
		int tempYear=1800;
		int ssnYear=Integer.parseInt(ssn.substring(0,2));
		int genderFlag=ssn.charAt(7)-48;//880101-1
		
		if(genderFlag==1||genderFlag==2||genderFlag==5||genderFlag==6) {
			tempYear=1900;
		}else if(genderFlag==3||genderFlag==4||genderFlag==7||genderFlag==8) {
				tempYear=1800;
		}//
		birth=tempYear+ssnYear;
		
		return birth;
	}//getBirthYear
	
	/**
	 * �ֹι�ȣ���� ��������� ���Ͽ� ��ȯ�ϴ� ��
	 * @return ������ �������
	 */
	public String getBirth() {
		int year=getBirthYear();
		String month=ssn.substring(2, 4);
		String day=ssn.substring(4, 6);
		
		return year+"��"+month+"��"+day+"��";
	}//getBirth
	
	/**
	 * �ֹι�ȣ���� ���̸� ���Ͽ� ��ȯ�ϴ� ��
	 * @return
	 */
	public int getAge() {
		return 2021-getBirthYear()+1;
	}//getAge
	
	/**
	 * �ֹι�ȣ���� ������ ���Ͽ� ��ȯ�ϴ� ��
	 * @return
	 */
	public String getGender() {
		String gender="����";
		int genderFlag=ssn.charAt(7)-48;//880101-1
		
		if(genderFlag%2==0) {
			gender="����";
		}//if
		
		return gender;
	}//getGender
	
	/**
	 * �ֹι�ȣ���� �츦 ���Ͽ� ��ȯ�ϴ� ��
	 * @return
	 */
	public String getZodiac() {
		
		String[] zodiac= {"������","��","��","����","��","��","ȣ����","�䳢","��","��","��","��"};
		return zodiac [getBirthYear()%12];
	}//getZodiac
	

}//class
