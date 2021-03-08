package day0125;

/**
 *	JDK1.5에서부터 지원되는 개선된 for loop<br>
 *	배열,List,Set의 모든 방(element)의 값을 출력할 때 사용.<br>
 *	인덱스가 존재하지 않는다.
 * @author user
 */
public class improvementFor {

	public static void main(String[] args) {
		
		int[] arr= {10,20,300,4000,500000};
		
		for(int value:arr) {
			System.out.println(value);
		}//end for
		System.out.println("-------------------------");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		
		
		
		
	}//main
}//class
