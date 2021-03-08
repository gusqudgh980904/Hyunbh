package day0202;

/**
 *	이차원 배열의 기본형 형식 사용
 * @author user
 */
public class UseArray2Score {
	public static final int JAVA_SCORE=0;
	public static final int ORACLE_SCORE=1;
	public static final int JSP_SCORE=2;
	
	public void processScore() {
		
		String[] names= {"현병호","송준희","강인섭","이학민","박기범"};
		//이차원 배열은 행구분 괄호를 사용하지 않으면 Error가 발생
		int[][] score= {{89,91,73},{61,70,72},{96,99,98},{79,77,80},{100,98,99}};
//		int javascore=0;
//		int oraclescore=0;
//		int JSPscore=0;
//		int totalscore=0;//내가 한거
		int stuTotal=0;
		int javaTotal=0;
		int oracleTotal=0;
		int jspTotal=0;
		int[] totalscore=new int[score.length];//학생의 인원수 대로 배열 생성
		int[] javascore=new int[score.length];//학생의 인원수 대로 배열 생성
//		int[][] score= {{89,91,73,61,70},{72,96,99,98,79},{77,80,100,98,99}};
//		System.out.println(score.length+"행"+score[0].length+"열");
		System.out.println("번호\t이름\t자바\t오라클\tJSP\t총점\t평균");
		System.out.println("-------------------");
		for(int i=0;i<score.length;i++) {//행-모든 학생
			System.out.printf("%d\t%s\t",i+1,names[i],i-1);
			for(int j=0;j<score[i].length;j++) {//열-학생 한명의 모든점수
//				totalscore+=score[i][j];//내가 한거
				System.out.printf("%d\t",score[i][j]);
				stuTotal+=score[i][j];
			}//for
			javaTotal+=score[i][JAVA_SCORE];
			oracleTotal+=score[i][ORACLE_SCORE];
			jspTotal+=score[i][JSP_SCORE];
			
			javascore[i]=score[i][JAVA_SCORE];//모든학생의 자바점수 입력
			totalscore[i]=stuTotal;//총점 배열에 학생 총점을 입력
//			System.out.printf("%d\t%d\t",totalscore,totalscore/names.length);
			System.out.printf("%d\t%.2f\n",stuTotal,(double)stuTotal/score[i].length);
			//총점을 구하는 변수를 초기화
			stuTotal=0;
		}//for
		//과목총점
//		javascore=score[0][0]+score[1][0]+score[2][0]+score[3][0]+score[4][0]; 내가 한거
//		oraclescore=score[0][1]+score[1][1]+score[2][1]+score[3][1]+score[4][1];
//		JSPscore=score[0][2]+score[1][2]+score[2][2]+score[3][2]+score[4][2];
//		System.out.println("--------------------------");
//		System.out.printf("총점                 %d     %d   %d\n",javascore,oraclescore,JSPscore);
//		System.out.printf("평균                 %d     %d   %.1f \n",javascore/names.length,oraclescore/names.length,(double)JSPscore/names.length);
//		System.out.printf("총 응시인원[%d],시험 과목수 [%d]",names.length,score[0].length);
		double cnt=score.length;
		System.out.printf("총점\t\t%d\t%d\t%d\n",javaTotal,oracleTotal,jspTotal);
		System.out.printf("평균\t\t%.2f\t%.2f\t%.2f\n",javaTotal/cnt,oracleTotal/cnt,jspTotal/cnt);
		System.out.printf("1등학생[%s]\n",topStudent(totalscore, names));//method로 만들것 return type String으로
		System.out.printf("자바의 최고점수 [%d]\n",javaTopScore(javascore));//method로 만들것
		System.out.printf("총 응시인원[%d],시험 과목수 [%d]\n",(int)cnt,score[0].length);
		//이차원 배열의 행을 입력(이차원 배열의 행은 일차원 배열의 주소를 가진다)
		max(score[0]);
	}//processScore
	
	/**
	 * 자바 최고점수 얻기
	 * @param javaScore
	 * @return
	 */
	private int javaTopScore(int[] javaScore) {
		int topScore=0;
		
		for(int score:javaScore) {//개선된 for:배열의 처음 방부터 끝방까지 반복시킬때 사용
			if(topScore<score) {
				topScore=score;
			}//if
		}//for
		
		return topScore;
	}//javaTopScore
	
//	public void javamax() {내가한거
//		int score[]= {89,61,96,79,100};
//		int max=score[0];// 최고 값을 구하기 위해 처음 방의 값을 넣는다.
//		for(int i=0;i<score.length;i++) {//옆방과 반복비교
//			if(max<score[i]) {
//				max=score[i];
//			}//if
//		}//for
//				
//		System.out.printf("자바의 최고점수 [%d]",max);//method로 만들것
//	}//javamax
	
	//1번 학생의 점수를 오름차순으로 정렬하여 출력//method로 만들것
	public void max(int[] score) {
	int temp =0;
	//주소가 입력되면 원래의 주소에 가서 데이터를 사용하기때문에 값이 변경된다
	//배열을 복사하여 사용
	////////////////score배열의 값을 복사하는 tepmScore배열을 생성
	//1.복사할 배열을 생성
	int[] copyScore=new int[score.length];
	//2.원본 배열에서 처음방부터 마지막 방까지 복사할 배열에 넣는다
	for(int i=0;i<score.length;i++) {
		copyScore[i]=score[i];
	}//for
	//복사된 배열을 사용하여 정렬 작업을 수행
	for(int i=0;i<copyScore.length-1;i++){//앞방의 값을 사용하기 위한
		for(int j=i+1;j<copyScore.length;j++) {//뒷방들의 값을 사용하기 위한
			if(copyScore[i]>copyScore[j]) {
				temp=copyScore[i];
				copyScore[i]=copyScore[j];
				copyScore[j]=temp;
			}//if
		}//for
	}//for
	//복사된 정렬데이터를 출력
	for(int value:copyScore) {
		System.out.printf("%-5d",value);
	}//for
//	int max=score[0];// 최고 값을 구하기 위해 처음 방의 값을 넣는다.
//	for(int i=0;i<score.length;i++) {//옆방과 반복비교
//		if(max<score[i]) {
//			max=score[i];
//		}//if
//		System.out.print(" "+score[i]);
//	}//for
	}//max
	
	/**
	 * 1등학생의 번호와 이름을 얻는 일
	 * @param totalScore 학생들의 총점
	 * @param names 학생의 이름
	 * @return 1등학생의 번호와 이름
	 */
	public String topStudent(int[] totalScore,String[] names) {
		String result="";
		
		int topNum=0;
		int tempScore=0;
		
		for(int i=0;i<totalScore.length;i++) {//최고점수를 구하기 위한 반복문
			if(tempScore<totalScore[i]) {//임시변수의 값이 배열의 i번째 방보다 작다면
				tempScore=totalScore[i];//i번째 방의 값으로 임시변수를 변경한다.
				topNum=i;
			}//if
		}//for
		
		result=(topNum+1)+"번"+names[topNum];
		
		return result;
		
	}//topStudent

	public static void main(String[] args) {
		//객체화
		UseArray2Score uas=new UseArray2Score();
		uas.processScore();
		System.out.println();
	}//main
}//class
