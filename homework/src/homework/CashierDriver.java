package homework;
import homework.NoCustomer;
import java.util.Vector;
class Cashier {
	
	Vector<Customer> line = new Vector<Customer>(10);
	
	public void addCustomer(Customer c){
		if(line.size()<10){
		line.addElement(c);
		System.out.println(c.str +"님이 계산하셨습니다.");
		}
		else{
			System.out.println("한 줄에 10명만 설 수 있습니다. 다음 계산대로 이동해 주세요!");
		}
	}
	public void getNextCustomer() throws NoCustomer{
		if(!line.isEmpty()){
			line.removeElement(line.firstElement());
		}
		else{
			throw new NoCustomer();
		}
	}
}

class Customer{
	public String line;
	String str;
	
	public Customer(String str) {
		super();
		this.str = str;
	}
}

class NoCustomer extends Exception{
	Vector<Customer> line = new Vector<Customer>(10);
	public void linesize() {
		if(line.isEmpty()){
			System.out.println("기다리는 고객이 없어서 계산할 수 없습니다.");
		}
	}
}
public class CashierDriver {

	public static void main(String[] args) throws NoCustomer {
		Cashier cs = new Cashier();
		
		try{
		//줄서기
		cs.addCustomer(new Customer("고객1"));
		cs.addCustomer(new Customer("고객2"));
		cs.addCustomer(new Customer("고객3"));
		cs.addCustomer(new Customer("고객4"));
		cs.addCustomer(new Customer("고객5"));
		cs.addCustomer(new Customer("고객6"));
		cs.addCustomer(new Customer("고객7"));
		cs.addCustomer(new Customer("고객8"));
		cs.addCustomer(new Customer("고객9"));
		cs.addCustomer(new Customer("고객10"));
		
		//서비스하기
		cs.getNextCustomer();
		cs.getNextCustomer();
		cs.getNextCustomer();
		cs.getNextCustomer();
		cs.getNextCustomer();
		cs.getNextCustomer();
		cs.getNextCustomer();
		cs.getNextCustomer();
		cs.getNextCustomer();
		cs.getNextCustomer();
		cs.getNextCustomer();
		cs.getNextCustomer();
		}catch(NoCustomer nc){
			nc.linesize();
		}
	}
}