package day0201;

/**
 *	������ �迭�� ���.
 * @author user
 */
public class UseArray {

	public static void main(String[] args) {
		
		//1.�迭 ����-��������[] �迭��=null;
		
		int[] arr=null;
		
		//2.����-�迭��=new ��������[���� ����];
		
		arr=new int[21];//������ ���� ���� ũ��� ���α׷� ���൵�� ������� �ʴ´�.(����������)
		
		System.out.println(arr);//�迭���� ����ϸ� �迭�� ���� �ּҰ� ���
		System.out.println(arr[0]+" "+arr[4]);
		
		//3. ���Ҵ�-�迭��[���ǹ�ȣ]=��;
		
		arr[0]=2021;
		arr[1]=2;
		arr[2]=1;
		arr[3]=16;
		arr[4]=17;
		
		//4. �����-�迭��[���ǹ�ȣ)
		System.out.println(arr[0]+" "+arr[1]+" "+arr[2]+" "+arr[3]+" "+arr[4]);
		
		System.out.println("�迭�� ���� ����: "+arr.length);
		
		//5.�ϰ�ó��(�迭�� ��� ���� �� ���)
		//�迭�� ���� 0������ �����ϰ�, �迭��.length��°���� 1�� �����ϸ鼭 �����ϰԵȴ�.
		for(int i=0; i<arr.length;i++) {
			System.out.println("arr["+i+"]="+arr[i]);
//			System.out.println(arr[i]*2);
		}//for
		
		
		
		
		
		
	}//main
}////class
