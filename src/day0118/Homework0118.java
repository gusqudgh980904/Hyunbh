package day0118;
class Homework0118{
	public static final int POCKET_MONEY=10000; //하루용돈
	
	public static void main(String[] args) {
         
		 int TransforationFee=2000;//교통비
		 int launch=5000;//점심값
		 System.out.println("하루용돈 "+POCKET_MONEY+"원"+" 교통비"+TransforationFee+"원"+" 왕복차비"
		 +(TransforationFee*2)+"원"+" 점심값"+launch+"원"+" 남은 돈은"+
		(POCKET_MONEY-(TransforationFee*2)-launch)+"원 입니다.");

		
	}//main
}//class
