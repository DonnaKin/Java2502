package textbook;

class Top2 implements Runnable{
	public void run(){
		for(int i=0;i<30;i++)
			System.out.print((Thread.currentThread()).getName()+i+"\t");
	}
}

public class Runnable4Exam {
	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		Top2 t= new Top2();
		Thread thd1 = new Thread(t);
		Thread thd2 = new Thread(t);
		thd1.setName("new_a");
		thd2.setName("new_b");
		thd1.setPriority(9);
		thd2.setPriority(thd2.MIN_PRIORITY);
		System.out.println(thd1.getPriority());
		System.out.println(thd2.getPriority());
		thd1.start();
		thd2.start();
		System.out.println("프로그램 종료");
	}
}
