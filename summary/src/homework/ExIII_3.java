package homework;

import java.util.Scanner;

class Check{
	public Check(){
		
		int random = Random.randomNumber();
		Scanner scan = new Scanner(System.in);
		int c,count=1;
		do{
			System.out.print("���� �Է�(0~99)");
			c  = scan.nextInt();
			if(c>99 || c<0){
				System.out.println("������ �ʰ��Ͽ����ϴ�.");
				return;
			}
			if(c==random){
				System.out.println("�����Դϴ�!");return;
			}
			else if(c>random)
				System.out.print("�ʹ� Ů�ϴ�. ("+count+"ȸ)\n");
			else if(c<random)
				System.out.print("�ʹ� �۽��ϴ�. ("+count+"ȸ)\n");
			count++;
		}while(count<8);
		if(c>8)
			System.out.println("���� ��ȸ��...");
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
		System.out.println("0~100������ ���� ���߱� ���α׷�");
		Check ck = new Check();
	}
}

