package day0122;

import day0121.Homework0121;

public class Homework0122 {

	public static void main(String[] args) {

	//1.대중교통수단,이동거리를 입력 받아 아래와 같이 출력하세요.
		//*유효성:대중교통 수단은 버스,지하철,택시 이며 해당 교통수단이 아니면"입력하신 교통수단은 대중교통이 아닙니다."를 출력.
        // *이동거리는 10km이내는 기본 요금이며 10km를 초과했을 때 매 5km마다 100원의 추가요금이 붙는다.
		//*정상출력 예:입력교통수단 ~이고,기본요금 ~원입니다.이동거리 ~km이고, 총 요금은 ~원입니다.
		
		System.out.print("입력교통수단은 ");
		int busfare=Homework0121.BUS_FARE;
		int trainfare=Homework0121.TRAIN_FARE;
		int taxifare=Homework0121.TAXI_FARE;
		int km=16;//이동거리
		int af=100;//추가요금
		if(args[0].equals("버스")&&km<15) {
			System.out.print(args[0]+"이고 "+", 기본요금"+busfare+"입니다. "+"이동거리 "+km+"이고 "+"총 요금은"+busfare+"원입니다.");
		}
		else if(args[0].equals("버스")&&km>16) {
			System.out.print(args[0]+"이고 "+", 기본요금"+busfare+"입니다. "+"이동거리 "+km+"이고 "+"총 요금은"+(km*busfare+af)+"원입니다.");
		}
		if(args[0].equals("택시")&&km<15) {
			System.out.print(args[0]+"이고 "+", 기본요금"+taxifare+"입니다. "+"이동거리 "+km+"이고 "+"총 요금은"+taxifare+"원입니다.");
		}
		else if(args[0].equals("택시")&&km>16) {
			System.out.print(args[0]+"이고 "+", 기본요금"+taxifare+"입니다. "+"이동거리 "+km+"이고 "+"총 요금은"+(km*taxifare+af)+"원입니다.");
		}
		if(args[0].equals("지하철")&&km<15) {
			System.out.print(args[0]+"이고 "+", 기본요금"+trainfare+"입니다. "+"이동거리 "+km+"이고 "+"총 요금은"+trainfare+"원입니다.");
		}
		else if(args[0].equals("지하철")&&km>16) {
			System.out.print(args[0]+"이고 "+", 기본요금"+trainfare+"입니다. "+"이동거리 "+km+"이고 "+"총 요금은"+(km*trainfare+af)+"원입니다.");
		}
		else {
			System.out.println("교통수단은 대중교통이 아닙니다.");
		}//else if end
		
		
		System.out.println();
	//2.1에서부터 100까지를 반복하면서 아래와 같이 출력.
	//   예)1 2 짝 4 5 짝 7 8 짝......
		for(int i=1;i<=100;i++) {
			if (i%3==0) {
				System.out.print("짝");
				continue;
				}//if
			System.out.print(i+" ");
		}//for
		
		
		
		
		
		
	}//main
}//class
