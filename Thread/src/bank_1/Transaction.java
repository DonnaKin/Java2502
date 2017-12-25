package bank_1;

class Account{
	int balance;

	public Account() {
		super();
		balance = 0;
	}
	public int getBalance() {
		return balance;
	}
	public void deposit(int amount){ //입금
		balance += amount;
	}
	public void withdraw(int amount){ //출금
		balance -= amount;
	}
	
}
public class Transaction implements Runnable{
	private Account acc;
	public Transaction(Account acc) {
		super();
		this.acc = acc;
	}
	public static void main(String[] args) {
		Account acc = new Account();
		System.out.println("입금 전 잔액 : "+acc.getBalance());
		Transaction tr = new Transaction(acc);
		Thread th1 = new Thread(tr);
		th1.start();//10000원 입금 => 스레드 동작
		tr.run();//10000원 입금 => main 스레드 동작
		System.out.println("입금 후 잔액 : "+acc.getBalance()); //tr.run()의 10000원만 입금
	}
	public void run() {
		try {
			deposit(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	private void deposit(int i) throws InterruptedException {
		acc.deposit(i);
		Thread.sleep(1000);
	}
}
