package day0121;

public class Homework0121 {
	
	public static final int BUS_FARE=1200;//버스요금
	public static final int TRAIN_FARE=1300;//지하쳘요금
	public static final int TAXI_FARE=3800;//택시요금
	
	public static void main(String[] args) {
		//1. 태어난 해를 입력받아 띠를 구하는 코드작성.(태어난 해를 12로 나눈 나머지값이 0~11이 나온다. 해당숫자는 아래와 같은 띠를 가진다.
		//0.원숭이 1.닭 2.개 3.돼지 4.쥐 5.소 6.호랑이 7.토끼 8.용 9.뱀 10.말 11.양 출력예)1998년생 XXX띠
		int birth=Integer.parseInt(args[0]);
		System.out.print(birth+"년생");
		if(birth%12==0){
		System.out.print(" 원숭이띠");
		}
		else if(birth%12==1){
			System.out.println(" 닭띠");
			}
		else if(birth%12==2){
			System.out.println(" 개띠");
			}
		else if(birth%12==3){
			System.out.println(" 돼지띠");
			}
		else if(birth%12==4){
			System.out.println(" 쥐띠");
			}
		else if(birth%12==5){
			System.out.println(" 소띠");
			}
		else if(birth%12==6){
			System.out.print(" 호랑이띠");
			}
		else if(birth%12==7){
			System.out.print(" 토끼띠");
			}
		else if(birth%12==8){
			System.out.print(" 용띠");
			}
		else if(birth%12==9){
			System.out.print(" 뱀띠");
			}
		else if(birth%12==10){
			System.out.print(" 말띠");
			}
		else if(birth%12==6){
			System.out.print(" 양띠");
			}
		
		System.out.println();
		//2.
		System.out.print("입력교통수단은 ");
		
		if(args[1].equals("버스")) {
			System.out.print(args[1]+"이고, "+"편도요금"+BUS_FARE+"입니다. "
			+ "왕복요금"+(BUS_FARE*2)+"이고,"+"한달 20일 출퇴근을 하면"+(BUS_FARE*2*20)+"입니다.");	
		}
		else if(args[1].equals("지하철")) {
			System.out.print(args[1]+"이고, "+"편도요금"+TRAIN_FARE+"입니다. "
			+ "왕복요금"+(TRAIN_FARE*2)+"이고,"+"한달 20일 출퇴근을 하면"+(TRAIN_FARE*2*20)+"입니다.");
		}
		else if(args[1].equals("택시")) {
			System.out.print(args[1]+"이고, "+"편도요금"+TAXI_FARE+"입니다. "
			+ "왕복요금"+(TAXI_FARE*2)+"이고,"+"한달 20일 출퇴근을 하면"+(TAXI_FARE*2*20)+"입니다.");
		}
		else {
			System.out.println("교통수단은 대중교통이 아닙니다.");
		}//else if end
		
		
		
		
		
		
	}//main
}//class
