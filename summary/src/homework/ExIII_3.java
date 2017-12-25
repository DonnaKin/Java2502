package homework;

import java.util.Scanner;

class Check{
	public Check(){
		
		int random = Random.randomNumber();
		Scanner scan = new Scanner(System.in);
		int c,count=1;
		do{
			System.out.print("숫자 입력(0~99)");
			c  = scan.nextInt();
			if(c>99 || c<0){
				System.out.println("범위를 초과하였습니다.");
				return;
			}
			if(c==random){
				System.out.println("정답입니다!");return;
			}
			else if(c>random)
				System.out.print("너무 큽니다. ("+count+"회)\n");
			else if(c<random)
				System.out.print("너무 작습니다. ("+count+"회)\n");
			count++;
		}while(count<8);
		if(c>8)
			System.out.println("다음 기회에...");
	}

}

class Random{
	static int random;
	public static int randomNumber(){
		return random = (int)(Math.random()*100);
	}	
}

public class ExIII_3 {
	public static void main(String[] args) {
		System.out.println("0~100사이의 정수 맞추기 프로그램");
		Check ck = new Check();
	}
}

