package car1.summary;

class Car1{
	String name;
	public Car1(String name){
		this.name=name;
	}
	public void result(){
		System.out.println("�� �ŷ�");
	}
}
class Dealer2 extends Car{
	int price;
	int rest;
	int money;
	public Dealer2(String name,int price, int rest){
		super(name);
		this.price=price;
		this.rest = rest;
	}
	public void deal(){
		System.out.println(name+"�� �ȾҴ�..��");
	}
	public void result(){
		money += price;
		rest--; 
		System.out.println("��� : "+money+" �� ��� : "+rest);
	}
}
class Buyer2 extends Car{
	int money;
	int rest;
	public Buyer2(String name, int money, int rest){
		super(name);
		this.money = money;
		this.rest = rest;
	}
	public void buy(){
		System.out.println(name+"�� �ٶǡ�");
	}
	public void result(){
		money -= 2000;
		rest++;
		System.out.println("��� : "+money+" �� ��� : "+rest);
	}
}
public class CarTest1{
	public static void main(String[] args) {
		Dealer1 d1 = new Dealer1("ray",2000,10);
		Buyer1 b1 = new Buyer1("ray",5000,0);
		
		d1.deal(); d1.result();
		b1.buy(); b1.result();
		}
}

