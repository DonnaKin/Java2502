package cashier;

import java.util.Vector;

class Customer {
	String name;

	public Customer(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
} //class

class Queue {
	Vector q = new Vector(10);

	public boolean isEmpty() {
		return q.isEmpty(); // 기본메소드
	}

	public Object dequeue() throws QueueEmptyException {
		if (isEmpty() == true) {
			throw new QueueEmptyException();
		}
		Object obj = q.firstElement(); // 기본메소드
		q.removeElement(obj); // 기본메소드
		return obj;
	}

	public void enqueue(Object obj) {
		q.addElement(obj); // 기본메소드
	}
} //class

class QueueEmptyException extends Exception {
	public QueueEmptyException() {
	}

	public QueueEmptyException(String msg) {
		super(msg);
	}
} //class

class Cashier {
	Queue customerQueue = new Queue();

	public void addCustomer(Customer customer) { // 손님 추가하기
		customerQueue.enqueue(customer);
	};

	public void getNextCustomer() {
		Customer cust;

		try {
			cust = (Customer) (customerQueue.dequeue());
			System.out.println(cust.getName() + "님이 계산하셨습니다.");
		} catch (QueueEmptyException e) {
			System.out.println("기다리는 고객이 없어서 계산할 수 없습니다.");
		}
	} //getNextCustomer
} // class

public class CashierDriver_1 {
	public static void main(String[] args) {
		Cashier cs = new Cashier();

		cs.addCustomer(new Customer("고객1"));
		cs.addCustomer(new Customer("고객2"));
		cs.addCustomer(new Customer("고객3"));

		cs.getNextCustomer();
		cs.getNextCustomer();
		cs.getNextCustomer();
		cs.getNextCustomer();
	}
}