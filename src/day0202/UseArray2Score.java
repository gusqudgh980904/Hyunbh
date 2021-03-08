package day0202;

/**
 *	������ �迭�� �⺻�� ���� ���
 * @author user
 */
public class UseArray2Score {
	public static final int JAVA_SCORE=0;
	public static final int ORACLE_SCORE=1;
	public static final int JSP_SCORE=2;
	
	public void processScore() {
		
		String[] names= {"����ȣ","������","���μ�","���й�","�ڱ��"};
		//������ �迭�� �౸�� ��ȣ�� ������� ������ Error�� �߻�
		int[][] score= {{89,91,73},{61,70,72},{96,99,98},{79,77,80},{100,98,99}};
//		int javascore=0;
//		int oraclescore=0;
//		int JSPscore=0;
//		int totalscore=0;//���� �Ѱ�
		int stuTotal=0;
		int javaTotal=0;
		int oracleTotal=0;
		int jspTotal=0;
		int[] totalscore=new int[score.length];//�л��� �ο��� ��� �迭 ����
		int[] javascore=new int[score.length];//�л��� �ο��� ��� �迭 ����
//		int[][] score= {{89,91,73,61,70},{72,96,99,98,79},{77,80,100,98,99}};
//		System.out.println(score.length+"��"+score[0].length+"��");
		System.out.println("��ȣ\t�̸�\t�ڹ�\t����Ŭ\tJSP\t����\t���");
		System.out.println("-------------------");
		for(int i=0;i<score.length;i++) {//��-��� �л�
			System.out.printf("%d\t%s\t",i+1,names[i],i-1);
			for(int j=0;j<score[i].length;j++) {//��-�л� �Ѹ��� �������
//				totalscore+=score[i][j];//���� �Ѱ�
				System.out.printf("%d\t",score[i][j]);
				stuTotal+=score[i][j];
			}//for
			javaTotal+=score[i][JAVA_SCORE];
			oracleTotal+=score[i][ORACLE_SCORE];
			jspTotal+=score[i][JSP_SCORE];
			
			javascore[i]=score[i][JAVA_SCORE];//����л��� �ڹ����� �Է�
			totalscore[i]=stuTotal;//���� �迭�� �л� ������ �Է�
//			System.out.printf("%d\t%d\t",totalscore,totalscore/names.length);
			System.out.printf("%d\t%.2f\n",stuTotal,(double)stuTotal/score[i].length);
			//������ ���ϴ� ������ �ʱ�ȭ
			stuTotal=0;
		}//for
		//��������
//		javascore=score[0][0]+score[1][0]+score[2][0]+score[3][0]+score[4][0]; ���� �Ѱ�
//		oraclescore=score[0][1]+score[1][1]+score[2][1]+score[3][1]+score[4][1];
//		JSPscore=score[0][2]+score[1][2]+score[2][2]+score[3][2]+score[4][2];
//		System.out.println("--------------------------");
//		System.out.printf("����                 %d     %d   %d\n",javascore,oraclescore,JSPscore);
//		System.out.printf("���                 %d     %d   %.1f \n",javascore/names.length,oraclescore/names.length,(double)JSPscore/names.length);
//		System.out.printf("�� �����ο�[%d],���� ����� [%d]",names.length,score[0].length);
		double cnt=score.length;
		System.out.printf("����\t\t%d\t%d\t%d\n",javaTotal,oracleTotal,jspTotal);
		System.out.printf("���\t\t%.2f\t%.2f\t%.2f\n",javaTotal/cnt,oracleTotal/cnt,jspTotal/cnt);
		System.out.printf("1���л�[%s]\n",topStudent(totalscore, names));//method�� ����� return type String����
		System.out.printf("�ڹ��� �ְ����� [%d]\n",javaTopScore(javascore));//method�� �����
		System.out.printf("�� �����ο�[%d],���� ����� [%d]\n",(int)cnt,score[0].length);
		//������ �迭�� ���� �Է�(������ �迭�� ���� ������ �迭�� �ּҸ� ������)
		max(score[0]);
	}//processScore
	
	/**
	 * �ڹ� �ְ����� ���
	 * @param javaScore
	 * @return
	 */
	private int javaTopScore(int[] javaScore) {
		int topScore=0;
		
		for(int score:javaScore) {//������ for:�迭�� ó�� ����� ������� �ݺ���ų�� ���
			if(topScore<score) {
				topScore=score;
			}//if
		}//for
		
		return topScore;
	}//javaTopScore
	
//	public void javamax() {�����Ѱ�
//		int score[]= {89,61,96,79,100};
//		int max=score[0];// �ְ� ���� ���ϱ� ���� ó�� ���� ���� �ִ´�.
//		for(int i=0;i<score.length;i++) {//����� �ݺ���
//			if(max<score[i]) {
//				max=score[i];
//			}//if
//		}//for
//				
//		System.out.printf("�ڹ��� �ְ����� [%d]",max);//method�� �����
//	}//javamax
	
	//1�� �л��� ������ ������������ �����Ͽ� ���//method�� �����
	public void max(int[] score) {
	int temp =0;
	//�ּҰ� �ԷµǸ� ������ �ּҿ� ���� �����͸� ����ϱ⶧���� ���� ����ȴ�
	//�迭�� �����Ͽ� ���
	////////////////score�迭�� ���� �����ϴ� tepmScore�迭�� ����
	//1.������ �迭�� ����
	int[] copyScore=new int[score.length];
	//2.���� �迭���� ó������� ������ ����� ������ �迭�� �ִ´�
	for(int i=0;i<score.length;i++) {
		copyScore[i]=score[i];
	}//for
	//����� �迭�� ����Ͽ� ���� �۾��� ����
	for(int i=0;i<copyScore.length-1;i++){//�չ��� ���� ����ϱ� ����
		for(int j=i+1;j<copyScore.length;j++) {//�޹���� ���� ����ϱ� ����
			if(copyScore[i]>copyScore[j]) {
				temp=copyScore[i];
				copyScore[i]=copyScore[j];
				copyScore[j]=temp;
			}//if
		}//for
	}//for
	//����� ���ĵ����͸� ���
	for(int value:copyScore) {
		System.out.printf("%-5d",value);
	}//for
//	int max=score[0];// �ְ� ���� ���ϱ� ���� ó�� ���� ���� �ִ´�.
//	for(int i=0;i<score.length;i++) {//����� �ݺ���
//		if(max<score[i]) {
//			max=score[i];
//		}//if
//		System.out.print(" "+score[i]);
//	}//for
	}//max
	
	/**
	 * 1���л��� ��ȣ�� �̸��� ��� ��
	 * @param totalScore �л����� ����
	 * @param names �л��� �̸�
	 * @return 1���л��� ��ȣ�� �̸�
	 */
	public String topStudent(int[] totalScore,String[] names) {
		String result="";
		
		int topNum=0;
		int tempScore=0;
		
		for(int i=0;i<totalScore.length;i++) {//�ְ������� ���ϱ� ���� �ݺ���
			if(tempScore<totalScore[i]) {//�ӽú����� ���� �迭�� i��° �溸�� �۴ٸ�
				tempScore=totalScore[i];//i��° ���� ������ �ӽú����� �����Ѵ�.
				topNum=i;
			}//if
		}//for
		
		result=(topNum+1)+"��"+names[topNum];
		
		return result;
		
	}//topStudent

	public static void main(String[] args) {
		//��üȭ
		UseArray2Score uas=new UseArray2Score();
		uas.processScore();
		System.out.println();
	}//main
}//class
