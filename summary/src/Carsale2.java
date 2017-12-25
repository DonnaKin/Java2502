class Person{
	int money;
}
interface resultPrintInterface{
	void resultPrint();
}
class Dealer2 extends Person implements resultPrintInterface {
	String carName;
	final int PRICE = 2500;
	int inventory;
	int account;

	
	//초기화 메서드(생성자 메서드)
	public Dealer2(String carName, int inventory, int account){
		this.carName = carName;
		this.inventory = inventory;
		this.account = account;
	}
	public void carsale(int money){
		account += money;
		inventory--;
		
	}
	public void resultPrint(){
		System.out.println("판매자 상태 => 현재재고 : "+ inventory + "대"
				+", 재정상태 : " + account + "만원");
	}
}
class Buyer2 extends Person implements resultPrintInterface{
	private int money; 
	private boolean own;
	int carCount = 0;
	
	public Buyer2(int money, boolean own){
		this.money = money;
		this.own = own;
	}
	
	public void buyCar(Dealer2 dealer, int price){
		if(price<=money){
		dealer.carsale(price); //메세지패싱
		money -= price;
		own = true;
		carCount++;;
	}else{
		System.out.println("차를 구입할 수 없습니다 !");
	}
	}
	public void resultPrint(){
		System.out.println("구매자상태 => 현재잔액 : "+ money + "만원"
				+", 차량소유여부 :" + own+", 보유 차량 수 : "+carCount+"대");
	}
}
public class Carsale2 {

	public static void main(String[] args) {
		Dealer2 dealer = new Dealer2("Ray", 10, 0);
		Buyer2 buyer = new Buyer2(4500, false);
		buyer.buyCar(dealer, 2000);
		buyer.resultPrint();
		dealer.resultPrint();
	}

}
