package day0216;

public class UseStringBuilder {
	
	 public void useStringBuffer() {
			//1.생성
			StringBuffer sb=new StringBuffer();
			//2.사용
			//값.추가append()
			sb.append("안녕.");//문자열추가
			sb.append(2021);//정수추가
			sb.append("년");//문자열추가
			sb.append('A');//문자추가
			sb.append(2.16);//실수추가
			sb.append(true);//
			
			//값삽입 insert(추가할 위치 인덱스,값)
			//안녕.2021년A2.16true
			//.의 위치에 "월"문자열을 추가
			sb.insert(10,"월");
			sb.insert(14,"일");
			
			//삭제 "2021년"을 삭제 delete(시작인덱스,끝인덱스+1)
			sb.delete(3,8);
			//문자열뒤집기
			sb.reverse();
			sb.reverse();
		 
			System.out.println(sb);
	 }//useStringBuffer
	 
	 
	 public void useStringBuilder(String file1, String file2) {
			//1.생성
			StringBuilder sb=new StringBuilder();
			//2.사용
			//값.추가append()
			sb.append("안녕.");//문자열추가
			sb.append(2021);//정수추가
			sb.append("년");//문자열추가
			sb.append('A');//문자추가
			sb.append(2.16);//실수추가
			sb.append(true);//
			
			//값삽입 insert(추가할 위치 인덱스,값)
			//안녕.2021년A2.16true
			//.의 위치에 "월"문자열을 추가
			sb.insert(10,"월");
			sb.insert(14,"일");
			
			//삭제 "2021년"을 삭제 delete(시작인덱스,끝인덱스+1)
			sb.delete(3,8);
			//문자열뒤집기
			sb.reverse();
			sb.reverse();
		 
			System.out.println(sb);
	 }//useStringBuilder
	 

	public static void main(String[] args) {
		UseStringBuilder usb=new UseStringBuilder();
		usb.useStringBuffer();
		System.out.println("---------------------");
		usb.useStringBuilder(null, null);
		System.out.println("---------------------");
		
	
		String file1="c:/dev/test.txt.doc";
		String file2="c:/work/test/day0216/Test.java";
		//StringBuilder를 사용하여 "c:/dev/test.txt.doc"->"c:/dev/test.txt.temp.doc"로 변경
		StringBuilder sbFile1=new StringBuilder(file1);
		sbFile1.insert(sbFile1.lastIndexOf("."),".temp");
		System.out.println(sbFile1);
		//StringBuilder를 사용하여 "c:/work/test/day0216/Test.java"->"c:/work/day0216/Test.java"로 변경
		StringBuilder sbFile2=new StringBuilder(file2);
		sbFile2.delete(7, 12);
		System.out.println(sbFile2);
		
		
	}//main
}//class
