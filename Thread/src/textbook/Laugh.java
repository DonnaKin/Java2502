package textbook;

class SendMessage implements Runnable{
	String message;
	public SendMessage(String message){
		super();
		this.message = message;
	}
	public void say(){
		System.out.print(message+" ");
	}
	public void sayNtimes(int n) throws InterruptedException{
		for(int i=0; i<n;i++){
			say();
			Thread.sleep(1000);
		}
	}
	public void run(){
		try {
			sayNtimes(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

public class Laugh {
	public static void main(String[] args) {
		Thread s1 = new Thread(new SendMessage("ha"));
		Thread s2 = new Thread(new SendMessage("ho"));
		s1.start();
		s2.start();
	}
}
