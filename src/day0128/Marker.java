package day0128;

/**
 *	��ī���� ������� �ۼ��� Ŭ����<br>
 *	������� Ư¡ : ��,��ü,�Ѳ�<br>
 *	�������� Ư¡ : (�۾���)����<br>
 *	���� Ư¡�� �߻�ȭ�Ͽ� �ۼ��� Ŭ����<br>
 *	����)<br>
 *		1.��üȭ<br>
 *		Marker ��ü��=new Marker();<br>
 *		2.���<br>
 *		��ü��.write("ȭ��Ʈ���忡 �ۼ��� �޼���);
 *
 * @author user
 */
public class Marker {
	
	private String color;//null
	private int cap;//0
	private int body;//0
	
	/**
	 * ��ī�� Ŭ������ �⺻ ������<br>
	 * �Ѳ� 1��, ��ü 1��, �������� ��ī���� ������ �� ���.
	 */
	public Marker(){
		this("������",1,1);
//		color="������";
//		cap=1;
//		body=1;
	}//Marker ������
	
	/**
	 * �Է��ϴ� ������ ��ī�� ��ü�� �����ϴ� Overload��  ������<br>
	 * ���� ������, �Ķ���, �������� ������ �� �ְ� �ش���� �ƴϸ���������� �����ȴ�.<br>
	 * �Ѳ��� ��ü�� �ִ� 10������ ������ �� ������ 10���� �ʰ��Ǹ� 1���� �����ȴ�.<br>
	 * @param color ������ ��
	 * @param cap �Ѳ��� ����
	 * @param body ��ü�� ����
	 */
	public Marker(String color,int cap,int body) {
								
	if(color.equals("������")||color.equals("�Ķ���")||color.equals("������"))	{
		this.color=color;
	}else {
		this.color="������";
	}//if else
	
		if(body>10) {
			body=1;
		}//if
		 this.body=body;
		 
		if(cap>10) {
			cap=1;
		}//if
		this.cap=cap; 
		
	}//Marker
	
	
	/**
	 * ������ ��ī�� ��ü�� ���� �����ϴ� ��.
	 * ���������� �� ��� : ������,������,�Ķ��� 3������ ���� ����
	 * �ٸ����� �ԷµǸ� ���������� �����մϴ�.
	 * @param color ������ ��
	 */
	public void setColor(String color) {
		
		if(color.equals("������")||color.equals("������")||color.equals("�Ķ���")) {
			this.color=color;
		}else {
			color="������";
		}
	}//setColor
	
	/**
	 * ������ ��ī�� ��ü�� ���� ��� ��.
	 * @return ������ ��ī�� ��ü�� ������ ��.
	 */
	public String getColor() {
		return color;
	}//getColor
	
	/**
	 * ������ ��ī�� ��ü�� �Ѳ��� �����ϴ� ��.
	 * @param cap ������ ��ī�� ��ü�� ������ �Ѳ��� ����.
	 */
	public void setCap(int cap) {
		this.cap=cap;
	}//setCap
	
	/**
	 * ������ ��ī�� ��ü�� ������ �Ѳ��� ������ ��� ��.
	 * @return	������ �Ѳ��� ����
	 */
	public int getCap() {
		return cap;
	}//getCap
	
	/**
	 * ������ ��ī�� ��ü�� ��ü������ �����ϴ� ��
	 * @param body	������ ��ü�� ����.
	 */
	public void setBody(int body) {
		this.body=body;
	}//setBody
	
	/**
	 * ������ ��ī�� ��ü�� ��ü ������ ��ȯ�ϴ� ��.
	 * @return	��ī�� ��ü�� ����
	 */
	public int getBody() {
		return body;
	}//getBody
	
	
	/**
	 * ������ ��ī�� ��ü�� ����Ͽ� ĥ�ǿ� �Էµ� �޽����� ���� ���� ������ method
	 * @param msg ĥ�ǿ� �� �޽���
	 * @return �޼����� �� ���
	 */
	public String write(String msg) {
		return"ĥ�ǿ� "+color+"�� ��ī������ \""+msg+"\"�� ����.";
	}
	

}//class
