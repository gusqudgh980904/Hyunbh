package day0203;


public class TestArray {

	public static void main(String[] args) {
		
		//������ �迭�� �࿡��
		int[][] arr=new int[2][3];
		//0�࿡ 1,2,3�� �Է�.
		arr[0][0]=1;
		arr[0][1]=2;
		arr[0][2]=3;
		//1�� 10,20,30�Է�
		int temp[]= {10,20,30};
		arr[1]=temp;
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
		}//for
			System.out.println();
		}//for
		
		int[] temp1=arr[0];
		for(int i=0;i<temp1.length;i++) {
			System.out.println(temp1[i]);
		}//for
		
		//3���� �迭�� ���� ������ �迭�� �ּҸ� ������.
	}//main
}//class
