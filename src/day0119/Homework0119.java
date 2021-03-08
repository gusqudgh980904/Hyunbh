package day0119;
class Homework0119{
	public static void main(String[] args) {
	//1.
	int i=20;
    System.out.println(~i+1);

	//2.
	int temp1=10,temp2=20;
	System.out.println(++temp1+temp2--);//31++temp1+temp2 여기까지만 계산되고 --가 적용되서 temp2--값(19)가
    //++temp1+temp2--=31                     //아래로 내려감
    System.out.println("temp1="+temp1+"/ temp2="+temp2);//temp1는 10에서 1이 올라간 값이 그대로 가고
    //temp1=11 temp2=19                                              //tepm2는 위 식에서 -1이된뒤 내려와서 값이 나옴
    

	 //3.
	 int temp3=0;
	 temp3=Integer.MAX_VALUE<<4;
     System.out.println(temp3);
;	 //System.out.println(~Integer.MAX_VALUE>>27); 내가 한거

	 //4.
	 /*maxvalue &(비트빼기) 2byte |(비트합칠때) ^(비트반전)
	 0111 1111 1111 1111 1111 1111 1111 1111
	 &
	 0000 0000 0000 0000 1111 1111 1111 1111
	 */
    System.out.println(Integer.MAX_VALUE&0x0000FFFF);

	}//main
}//class
