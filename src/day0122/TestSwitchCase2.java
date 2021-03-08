package day0122;

/**
 *	switch~case¿¡ break »ç¿ë.
 *	break¸¦ ¸¸³ª¸é switch ºí·°À» ºüÁ® ³ª°£´Ù.
 * @author user
 */
public class TestSwitchCase2 {

	public static void main(String[] args) {
		
		int i=1;
		switch (i) {
		case 0:System.out.println("¿µ"); break; //break´Â switch~case, while, do~while¾È¿¡¼­¸¸ »ç¿ëÇÒ ¼ö ÀÖ´Ù.
		case 1:System.out.println("ÀÏ");
		case 2:System.out.println("ÀÌ"); break;
		case 3:System.out.println("»ï"); break;
		default:System.out.println("¾øÀ½"); //default¿¡´Â break;¸¦ ¾È½áµµ ±¦Âú´Ù
		}//end switch
		
		System.out.println("------------------------------------------------");
		int year=1988;
		switch (year%12) {//¶ì¸¦ ±¸ÇÏ·Á¸é ÅÂ¾î³­ÇØ¸¦ 12·Î ³ª´« ³ª¸ÓÁö »ç¿ë.0~11±îÁöÀÇ ¼ö ¹ß»ı.
		case 0: System.out.println("¿ø¼şÀÌ¶ì");break;
		case 1: System.out.println("´ß¶ì");break;
		case 2: System.out.println("°³¶ì");break;
		case 3: System.out.println("µÅÁö¶ì");break;
		case 4: System.out.println("Áã¶ì");break;
		case 5: System.out.println("¼Ò¶ì");break;
		case 6: System.out.println("È£¶ûÀÌ¶ì");break;
		case 7: System.out.println("Åä³¢¶ì");break;
		case 8: System.out.println("¿ë¶ì");break;
		case 9: System.out.println("¹ì¶ì");break;
		case 10: System.out.println("¸»¶ì");break;
		default:System.out.println("¾ç¶ì");
		}
		
		

	}//main
}//class
