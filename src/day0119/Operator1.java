package day0119;
/**
단항 연산자
~,!,+,-,++,--
*/
class Operator1 {
	public static void main(String[] args) {
		int i=19, j=-10;
		System.out.println("~"+i+"="+~i);//-20:~양수->부호변경 1증가.
        System.out.println("~"+j+"="+~j);//9    :~음수->부호변경 1감소.

		boolean flag1=true, flag2=false;
        System.out.println("!"+flag1+"="+!flag1);//false
		System.out.println("!"+flag2+"="+!flag2);//true

		boolean flag3=!(3>2);/*!은 true나 false 앞에만 붙일 수 있다. 
		관계연산자와 단항 연산자가 함께 사용되면 단항이 먼저 연산된다.*/
		System.out.println(flag3);

		System.out.println("+"+i+"="+ +i);//19
        System.out.println("+"+j+"="+ +j);//-10
        //2의 보수연산자:값은 그대로이고 부호만 변경
		System.out.println("-"+i+"="+ -i);//-19: 값은 그대로 이고 부호만 변경
        System.out.println("-"+j+"="+ -j);//10

		i=100;
		j=50;

		//전위연산:대상체 앞에 연산자 사용.
		++i;//100->101
        --j;//50-49
		System.out.println("전위 연산 후 i: "+i+" ,j:"+j);

		//후위연산:대상체 뒤에 연산자 사용.
	    i++;//101->102
		j--;//49->48
		System.out.println("후위 연산 후 i:"+i+" ,j"+j);

		//++,--는 전위연산과 후위연산이 다른 값을 대입한다.
		i=0;
		j=10;
		//전위:내것 먼저
		i=++j;
		System.out.println("전위 연산 후 i:"+i+" ,j:"+j);//i=j=11

		//후위:남의 것 먼저
		i=0;
		j=10;
		i=j++;
		System.out.println("후위 연산 후 i:"+i+", j:"+j);//i=10,j=11

		i=0;
		System.out.println(i++);//0
		System.out.print(i);//1

        
	}//main
}//clas
