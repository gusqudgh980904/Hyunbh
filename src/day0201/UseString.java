package day0201;


/**
 *	java.lang.String class의 사용
 * @author user
 */
public class UseString {

	public static void main(String[] args) {
		//기본형 형식의 사용.new를 사용하지 않고 문자열 저장소(String literal)의 주소를 담는 방식.
		String str="AbcdEf";
		//참조형 형식의 사용.new를 사용하여 문자열 저장소(String literal)의 주소를 담는 방식.
		String str1=new String("gusqudgh980904@naver.com");
		
		
		System.out.println(str+"의 길이"+str.length());
		System.out.println(str1+"의 길이"+str1.length());
		
		System.out.println(str+"을 모두 대문자로:"+str.toUpperCase());
		System.out.println(str+"을 모두 소문자로:"+str.toLowerCase());
		
		System.out.println(str+"에서 'c'의 인덱스:"+str.indexOf("c"));
		System.out.println(str+"에서 \"dEf\"의 인덱스:"+str.indexOf("dEf"));
		System.out.println(str+"에서 \"def\"의 인덱스:"+str.indexOf("def"));
		
		str="AbcdAbcdAbcd";
		System.out.println("indexOf->'c:"+str.indexOf("c"));//왼쪽에서 오른쪽으로 세기
		System.out.println("lastindexOf->'c:"+str.lastIndexOf("c"));//오른쪽에서 왼쪽으로 세기
		
		
		str="test@test.com";//testtest.com, test@testcom
		//str에 들어있는 email 주소가 유효하다면 "유효" 그렇지 않다면 "무효"를 출력하는 코드작성.
		//indexOf를 사용해보세요
//		System.out.println(str.indexOf("@")+" "+str.indexOf("."));
		System.out.print(str+" ");
		if(str.indexOf("@")!=-1&&str.indexOf(".")!=-1) {
			System.out.println("유효");
		}else {
			System.out.println("무효");
		}//else
		
		System.out.println(str.charAt(4));//@
		System.out.println(str.charAt(9));//.
		
		str="AbcdefG";//자식 문자열만 출력
		System.out.println(str.substring(1,4));//bcd
		System.out.println(str.substring(5, 7));//fg
		System.out.println(str.substring(1));//bcdefG
		
		//1. 이메일 주소만 출력
		System.out.println(str1.substring(0,str1.indexOf("@")));
		//2. 도메인 주소만 출력
		System.out.println(str1.substring(str1.indexOf("@")+1));
		
		str="ABC";//문자열 합치기
		System.out.println(str.concat("def"));//문자열
		System.out.println(str+"def");
		
		str="   A  BC";//trim 문자열 앞뒤공백제거
		System.out.println("["+str+"]["+str.trim()+"]");//중간공백은 지워지지 않음
		
		str="Abcdef";//문자열 시작이 같은지 비교
		String key="Abc";
		System.out.println(str+"은 "+key+"로 시작되었는가? "+str.startsWith(key));
		
		key="f";//문자열 끝이 같은지 비교
		System.out.println(str+"은 "+key+"로 끝났는가? "+str.endsWith(key));

		key="cd";
		System.out.println(str+"은 "+key+"를 포함하는가? "+str.contains(key));
		
		//문자열을 치환 ("찾을 문자열","변경할 문자열")
		System.out.println(str+"에서 cd를 KKK로 치환"+str.replaceAll("cd","KKK"));
		
		//문자열이 비었는지. isEmpty()
		//-문자열 저장소에 아무것도 없는 문자열-empty
		//String str=null;-객체가 생성되어있지 않아 사용할 수 없는 상태
		//String str="";-문자열객체가 아무 값이 없어 사용할 수 없는 상태
		
		//기본형 데이터형을 문자열에 할당. valueOf(기본형데이터형);
		//-static method는 객체가 가지고 있는 값을 사용하여 업무를 처리하지 않는다.
		int i=2021;
		System.out.println(str);
		
		//////////initCap method를 완성하고, 아래 name 변수를 inintCap method의 매개변수에 할당한 후
		/////////대문자로 변경된 문자열을 얻어 출력.
		
		String name="hbh";
		UseString us=new UseString();
		System.out.println(us.initCap(name));
		
	}//main
	
	/**
	 * 매개변수로 입력되는 문자열의 첫글자만 대문자로 변경하여 반환하는 일
	 * @param str 첫글자를 대문자로 변경해야하는 문자열.
	 * @return 첫글자만 대문자로 변경된 문자열.
	 */
	
	public String initCap(String str) {
		if(!str.isEmpty()||str!=null) {
			int startidx=1;
			
//			String firstChar=str.substring(0,startidx);
//			firstChar=firstChar.toUpperCase();
			//method chain
			//method가 반환형이 있다면 .을 사용하여 method를 계속 연결하여 호출 할 수 있다.
			//가장 마지막에 쓴 method가 반환 값이 된다.
			
			String firstChar=str.substring(0,startidx).toUpperCase();
			String secondStr="";
			if(str.length()>1) {//글자수가 1글자 이상이면 두번째 글자부터 소문자로 변경
			secondStr=str.substring(startidx).toLowerCase();
				
			}//if
			
			str=firstChar.concat(secondStr);
			
		}//if
		
		return  str;
		
	}//initCap
	
	
	
}//class
