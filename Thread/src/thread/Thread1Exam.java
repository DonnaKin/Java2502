package thread;

class Top extends Thread{
	public void run(){
		int i;
		for(i=0; i<50; i++)
			System.out.print(i+"\t");
		if(i%10==0)
			System.out.println();
	}
}
public class Thread1Exam {
	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		Top d = new Top();
		d.start();
		System.out.println("프로그램 종료");
	}
}
