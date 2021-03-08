package day0217;

/**
 * 숙제2.int[] 6개의 방을 만들고 1~45사이의 숫자 중 뽑아서 배열의 모든 방에 넣고 반환하는 method를 만든다.(같은 번호가 배열에 들어갈 수 없다.
 * 위의 method를 호출하여 반환된 로또 번호를 출력하는 일을 하는 method작성
 * @author user
 */
public class Homework02172 {
	
	public Homework02172() {
		double ran=Math.random();
		int[] lotto=new int[6];
		lotto[0]=(int)((ran*45)+1);
		lotto[1]=(int)((ran*45)+1);
		lotto[2]=(int)((ran*45)+1);
		lotto[3]=(int)((ran*45)+1);
		lotto[4]=(int)((ran*45)+1);
		lotto[5]=(int)((ran*45)+1);
		for(int i:lotto) {
			System.out.println(i);
		}
	}//Homework02172

	public static void main(String[] args) {
		new Homework02172();
		
	}//main

}//class
