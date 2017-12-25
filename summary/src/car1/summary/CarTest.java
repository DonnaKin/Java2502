package car1.summary;

class Car{
	String name;
	public Car(String name){
		this.name=name;
	}
	public void result(){
		System.out.println("차 거래");
	}
}
class Dealer1 extends Car{
	int price;
	int rest;
	int money;
	public Dealer1(String name,int price, int rest){
		super(name);
		this.price=price;
		this.rest = rest;
	}
	public void deal(){
		System.out.println(name+"를 팔았다..☆");
	}
	public void result(){
		money += price;
		rest--; 
		System.out.println("재산 : "+money+"재고 : "+rest);
	}
}
class Buyer1 extends Car{
	int money;
	int rest;
	public Buyer1(String name, int money, int rest){
		super(name);
		this.money = money;
		this.rest = rest;
	}
	public void buy(){
		System.out.println(name+"을 겟또☆");
	}
	public void result(){
		money -= 2000;
		rest++;
		System.out.println("재산 : "+money+"차 재고 : "+rest);
	}
}
public class CarTest{
	public static void main(String[] args) {
		Dealer1 d1 = new Dealer1("ray",2000,10);
		Buyer1 b1 = new Buyer1("ray",5000,0);
		
		d1.deal(); d1.result();
		b1.buy(); b1.result();
		}
}

