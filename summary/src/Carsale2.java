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

	
	//�ʱ�ȭ �޼���(������ �޼���)
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
		System.out.println("�Ǹ��� ���� => ������� : "+ inventory + "��"
				+", �������� : " + account + "����");
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
		dealer.carsale(price); //�޼����н�
		money -= price;
		own = true;
		carCount++;;
	}else{
		System.out.println("���� ������ �� �����ϴ� !");
	}
	}
	public void resultPrint(){
		System.out.println("�����ڻ��� => �����ܾ� : "+ money + "����"
				+", ������������ :" + own+", ���� ���� �� : "+carCount+"��");
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
