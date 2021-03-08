package day0201;


/**
 *	java.lang.String class�� ���
 * @author user
 */
public class UseString {

	public static void main(String[] args) {
		//�⺻�� ������ ���.new�� ������� �ʰ� ���ڿ� �����(String literal)�� �ּҸ� ��� ���.
		String str="AbcdEf";
		//������ ������ ���.new�� ����Ͽ� ���ڿ� �����(String literal)�� �ּҸ� ��� ���.
		String str1=new String("gusqudgh980904@naver.com");
		
		
		System.out.println(str+"�� ����"+str.length());
		System.out.println(str1+"�� ����"+str1.length());
		
		System.out.println(str+"�� ��� �빮�ڷ�:"+str.toUpperCase());
		System.out.println(str+"�� ��� �ҹ��ڷ�:"+str.toLowerCase());
		
		System.out.println(str+"���� 'c'�� �ε���:"+str.indexOf("c"));
		System.out.println(str+"���� \"dEf\"�� �ε���:"+str.indexOf("dEf"));
		System.out.println(str+"���� \"def\"�� �ε���:"+str.indexOf("def"));
		
		str="AbcdAbcdAbcd";
		System.out.println("indexOf->'c:"+str.indexOf("c"));//���ʿ��� ���������� ����
		System.out.println("lastindexOf->'c:"+str.lastIndexOf("c"));//�����ʿ��� �������� ����
		
		
		str="test@test.com";//testtest.com, test@testcom
		//str�� ����ִ� email �ּҰ� ��ȿ�ϴٸ� "��ȿ" �׷��� �ʴٸ� "��ȿ"�� ����ϴ� �ڵ��ۼ�.
		//indexOf�� ����غ�����
//		System.out.println(str.indexOf("@")+" "+str.indexOf("."));
		System.out.print(str+" ");
		if(str.indexOf("@")!=-1&&str.indexOf(".")!=-1) {
			System.out.println("��ȿ");
		}else {
			System.out.println("��ȿ");
		}//else
		
		System.out.println(str.charAt(4));//@
		System.out.println(str.charAt(9));//.
		
		str="AbcdefG";//�ڽ� ���ڿ��� ���
		System.out.println(str.substring(1,4));//bcd
		System.out.println(str.substring(5, 7));//fg
		System.out.println(str.substring(1));//bcdefG
		
		//1. �̸��� �ּҸ� ���
		System.out.println(str1.substring(0,str1.indexOf("@")));
		//2. ������ �ּҸ� ���
		System.out.println(str1.substring(str1.indexOf("@")+1));
		
		str="ABC";//���ڿ� ��ġ��
		System.out.println(str.concat("def"));//���ڿ�
		System.out.println(str+"def");
		
		str="   A  BC";//trim ���ڿ� �յڰ�������
		System.out.println("["+str+"]["+str.trim()+"]");//�߰������� �������� ����
		
		str="Abcdef";//���ڿ� ������ ������ ��
		String key="Abc";
		System.out.println(str+"�� "+key+"�� ���۵Ǿ��°�? "+str.startsWith(key));
		
		key="f";//���ڿ� ���� ������ ��
		System.out.println(str+"�� "+key+"�� �����°�? "+str.endsWith(key));

		key="cd";
		System.out.println(str+"�� "+key+"�� �����ϴ°�? "+str.contains(key));
		
		//���ڿ��� ġȯ ("ã�� ���ڿ�","������ ���ڿ�")
		System.out.println(str+"���� cd�� KKK�� ġȯ"+str.replaceAll("cd","KKK"));
		
		//���ڿ��� �������. isEmpty()
		//-���ڿ� ����ҿ� �ƹ��͵� ���� ���ڿ�-empty
		//String str=null;-��ü�� �����Ǿ����� �ʾ� ����� �� ���� ����
		//String str="";-���ڿ���ü�� �ƹ� ���� ���� ����� �� ���� ����
		
		//�⺻�� ���������� ���ڿ��� �Ҵ�. valueOf(�⺻����������);
		//-static method�� ��ü�� ������ �ִ� ���� ����Ͽ� ������ ó������ �ʴ´�.
		int i=2021;
		System.out.println(str);
		
		//////////initCap method�� �ϼ��ϰ�, �Ʒ� name ������ inintCap method�� �Ű������� �Ҵ��� ��
		/////////�빮�ڷ� ����� ���ڿ��� ��� ���.
		
		String name="hbh";
		UseString us=new UseString();
		System.out.println(us.initCap(name));
		
	}//main
	
	/**
	 * �Ű������� �ԷµǴ� ���ڿ��� ù���ڸ� �빮�ڷ� �����Ͽ� ��ȯ�ϴ� ��
	 * @param str ù���ڸ� �빮�ڷ� �����ؾ��ϴ� ���ڿ�.
	 * @return ù���ڸ� �빮�ڷ� ����� ���ڿ�.
	 */
	
	public String initCap(String str) {
		if(!str.isEmpty()||str!=null) {
			int startidx=1;
			
//			String firstChar=str.substring(0,startidx);
//			firstChar=firstChar.toUpperCase();
			//method chain
			//method�� ��ȯ���� �ִٸ� .�� ����Ͽ� method�� ��� �����Ͽ� ȣ�� �� �� �ִ�.
			//���� �������� �� method�� ��ȯ ���� �ȴ�.
			
			String firstChar=str.substring(0,startidx).toUpperCase();
			String secondStr="";
			if(str.length()>1) {//���ڼ��� 1���� �̻��̸� �ι�° ���ں��� �ҹ��ڷ� ����
			secondStr=str.substring(startidx).toLowerCase();
				
			}//if
			
			str=firstChar.concat(secondStr);
			
		}//if
		
		return  str;
		
	}//initCap
	
	
	
}//class
