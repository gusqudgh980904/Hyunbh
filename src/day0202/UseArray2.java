package day0202;

/**
 *	행과 열로 구성되는 이차원 배열의 사용
 * @author user
 */
public class UseArray2 {
	
	public UseArray2() {
		//1.선언: 데이터형[][] 배열명=null;
		        int[][] arr=null;
		        //2.생성:배열명=new 데이터형[행의수][열의수];
		        //모든행의 열의 갯수는 같다. 모든 방의 값은 초기화된다
		        arr=new int[3][4];
		        
		        System.out.println(arr[1]);//이차원 배열에서 행의 번호는 주소를 가지고 있다.
		        
		        
		        System.out.println("행의수:"+arr.length+", 열의수:"+arr[0].length);
		        
		        //3.값 할당:배열명[행의번호][열의번호]=값;
		        //행의 번호는 주소를 가지고 있기 때문에 값은 넣을 수 없다.
//		        arr[0]=10;
		        arr[0][0]=10;
		        arr[1][1]=20;
		        arr[2][2]=30;
		        arr[1][3]=40;
		        
		        //4.값 사용:배열명[행의번호][열의번호]
		       System.out.println(arr[0][0]+"/"+arr[0][1]);
		       
		       //일괄처리
		       for(int i=0;i<arr.length;i++) {//행을 반복하기 위한 for
		    	   System.out.println(i+"행 시작");
		    	   for(int j=0;j<arr[i].length;j++) {//열을 반복하기 위한 for
		    		   System.out.printf("arr[%d][%d]=%-5d",i,j,arr[i][j]);
		    	   }//for
		    	   System.out.println("\n"+i+"행 끝");
		       }//for
		       
		       //String형으로 이차원 배열을 만들고, 구구단 전단(2~9)단을 입력한 후 출력
		        	String[][] mulTab=new String [8][9];
		        	int row=0;
		        	int col=0;
		        for(int i=2;i<10;i++) {
		        	for(int j=1;j<10;j++) {
		        		mulTab[row][col]=i+"*"+j+"="+(i*j);
		        		System.out.print(mulTab[row][col]+"  ");
		        		col++;
		        	}//for
		        	System.out.println();
		        	row++;
		        	col=0;
		        }//for
		        
		        int[][] temp=new int[6][10];//생성된 모든 방의 값은 0으로 초기화
		        for(int i=0;i<temp.length;i++) {//행
		        	for(int j=0;j<temp[i].length;j++) {//열
		        		if(i==0||i==temp.length-1||j==0||j==temp[i].length-1) {//처음행
		        			temp[i][j]=1; 
		        		}//if
		        		System.out.printf("%-3d",temp[i][j]);
		        	}//for
		        	System.out.println();
		        }//for
		        
		        
	}//UseArray2

	public static void main(String[] args) {
		new UseArray2();

	}//main
}//class
