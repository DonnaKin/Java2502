package car1.summary;
//인터페이스 + 상속
interface print1{
	void result();
}
class person{
	int money;
}
class Dealer3 extends person{
	int price;
	int inventory;
	int money;
	int account;
	String carName = "레이";
	public Dealer3(int price, int inventory,int account){
		this.price=price;
		this.inventory = inventory;
		this.account = account;
	}
	public void deal(int money){//구매자가 넘긴 돈
		account += money;
		inventory -=1; 
	}
	public void result(){
		System.out.println("판매자 상태 -> 재산 : "+account+"만원"+" 차 재고 : "+inventory);
	}
}
class Buyer3 extends person{
	int money;
	boolean own;
	public Buyer3( int money,boolean own){
		this.money = money;
		this.own = own;
	}
	public void buy(Dealer3 deal,int price){//메세지 패싱
		money -= price;
		own = true;
	}
	public void result(){
		System.out.println("구매자 상태 -> 현재잔고: "+money+"만원"+" 차 소유여부: "+own);
	}
}
public class Car{
	public static void main(String[] args) {
		Dealer3 d1 = new Dealer3(2000,10,0);
		Buyer3 b1 = new Buyer3(5000,false);
		
		d1.deal(2000); d1.result();
		b1.buy(d1,2000); b1.result();
		}
}
