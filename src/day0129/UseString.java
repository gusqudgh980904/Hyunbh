package day0129;

/**
 *	문자열(String)의 주소를 저장하고 사용할 수 있는 java.lang.String 클래스의 사용.
 *문자열 저장소에 동일 문자열은 하나만 생성되고 사용한다.
 * @author user
 */
public class UseString {

	public static void main(String[] args) {
		
		//기본형 형식의 사용(new를 사용하지 않고 java.lang.String 클래스를 사용)
		String str="AbcdEf";
		System.out.println(str);
		System.out.println("기본형 형식 ==비교"+(str=="AbcdEf"));//기본형 형식의 사용은 == 비교가능
		System.out.println("기본형 형식 equals비교 "+str.equals("AbcdEf"));//기본형 형식의 사용은 == 비교가능
		
		//참조형 형식의 사용(new를 사용하여 java.lang.String 클래스를 사용)
		String str1=new String("AbcdEf");
		System.out.println(str1);//
		System.out.println("참조형 형식 ==비교"+(str1=="AbcdEf"));//참조형 형식의 사용은 ==비교 불가능
		System.out.println("참조형 형식 equals비교 "+str1.equals("AbcdEf"));//참조형 형식의 사용은 ==비교 불가능
		
		
	}//main
}//class
