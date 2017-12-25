package thread;

class SendMessage extends Thread{
	String message;
	public SendMessage(String message){
		super();
		this.message = message;
	}
	public void say(){
		System.out.print(message+" ");
	}
	public void sayNtimes(int n){
		for(int i=0; i<n;i++){
			say();
		}
	}
	public void run(){
		sayNtimes(10);
	}
}

public class Laugh {
	public static void main(String[] args) {
		SendMessage s1 = new SendMessage("Ha");
		SendMessage s2 = new SendMessage("Ho");
		s1.start();
		s2.start();
	}
}
