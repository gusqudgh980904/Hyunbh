package day0218;

/**
 * 임시비밀번호 8자리를 생성하여 반환<br>
 * 로또번호 6자리를 생성하여 반환.
 * @author user
 */
public class Work0217 {
	
	public static final int upperCase=0;
	public static final int lowerCase=1;
	public static final int decimal=2;
	
	/**
	 * 임시비밀번호 8자리를 생성하여 반환하는 일
	 * 비밀번호는 중복문자가 있을 수 있으며, 숫자,대문자,소문자로 구성된다.
	 * @return 생성된 임시비번
	 */
	public char[] createPassword() {
		char[] tempPass=new char[8];
		
		int flag=0;//어떤 문자를 뽑을 것 인지 결정하는 변수
		
		for(int i=0;i<tempPass.length;i++) {
			flag=(int)(Math.random()*3);
			switch(flag) {
			case upperCase:
				tempPass[i]=(char)((Math.random()*26)+65);
				break;
			case lowerCase:
				tempPass[i]=(char)((Math.random()*26)+97);
				break;
			case decimal:
				tempPass[i]=(char)((Math.random()*10)+48);
				break;
			}//switch
		}//for
		return tempPass;
	}//createPassword
	
	
	public char[] createPassword1() {
		char[] tempPass=new char[8];
		char[] password= {
			'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z',
			'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z',
			'0','1','2','3','4','5','6','7','8','9'
				};
		for(int i=0;i<tempPass.length;i++) {
			tempPass[i]=password[(int)(Math.random()*password.length)];
		}//for
		return tempPass;
	}//createPassword1
	
	
	public char[] createPassword2() {
		char[] tempPass=new char[8];
		String passwordSet="11234567890=qwertyuiop[]asdfghjkl;'zxcvbnm,./QWERTYUIOPASDFGHJKLZXCVBNM";
		for(int i=0;i<tempPass.length;i++) {
			tempPass[i]=passwordSet.charAt((int)(Math.random()*passwordSet.length()));
		}//for
		
		return tempPass;
	}//createPassword2
	
	
	/**
	 * 로또번호 뽑기(중복배제)
	 * 1~45개의 수 중 하나가 6세트를 이룬 것
	 * @return
	 */
	public int[] createLotto() {
		int[] tempLotto=new int[6];
		
		for(int i=0;i<tempLotto.length;i++) {//1~45개중 임의의 번호를 생성하기 위한 for
			tempLotto[i]=(int)(Math.random()*45)+1;//값 생성
			//중복배제:이번 방에 생성된 값과 이전 방에 존재하는 값이 같은지 비교.(생성된 방까지 반복)
			for(int j=0;j<i;j++) {//이전방의 값을 비교하기 위한 for
				if(tempLotto[i]==tempLotto[j]) {//발생된 값과 같은 값이 이전방에 존재하는 지?
					//현재방의 값을 다시 생성
					//인덱스를 현재방의 인덱스로 설정
					i--;
					break;//다시 값을 생성하도록 안쪽 for(비교용 for)를 빠져나감
				}//if
			}//for
		}//for
		
		return tempLotto;
	}//lotto
	
	public void printLotto(int[] tempLotto) {//로또번호를 출력하는일
		int temp=0;
		for(int i=0;i<tempLotto.length;i++) {
			for(int j=i+1;j<tempLotto.length;j++) {
				if(tempLotto[i]>tempLotto[j]) {//오름차순 정렬
					temp=tempLotto[i];
					tempLotto[i]=tempLotto[j];
					tempLotto[j]=temp;
				}//if
			}//for
		}//for
			
		for(int value:tempLotto) {
			System.out.printf("%-3d",value);
		 }//for
	}//printLotto
	
	
	public void printPass(char[] tempPass) {//char[]배열은 문자열로 취급받아 그냥 출력해도됨// 비밀번호를 출력하는 일
		System.out.println(tempPass);
	}//printPass

	public static void main(String[] args) {
		Work0217 work=new Work0217();
		char[] temp=work.createPassword();
		work.printPass(temp);
		char[] temp1=work.createPassword1();
		work.printPass(temp1);
		char[] temp2=work.createPassword2();
		work.printPass(temp2);
		System.out.println("--------------------------------");
		work.printLotto(work.createLotto());
	}//main

}//class
