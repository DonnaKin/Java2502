package car1.summary;
//�������̽� + ���
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
	String carName = "����";
	public Dealer3(int price, int inventory,int account){
		this.price=price;
		this.inventory = inventory;
		this.account = account;
	}
	public void deal(int money){//�����ڰ� �ѱ� ��
		account += money;
		inventory -=1; 
	}
	public void result(){
		System.out.println("�Ǹ��� ���� -> ��� : "+account+"����"+" �� ��� : "+inventory);
	}
}
class Buyer3 extends person{
	int money;
	boolean own;
	public Buyer3( int money,boolean own){
		this.money = money;
		this.own = own;
	}
	public void buy(Dealer3 deal,int price){//�޼��� �н�
		money -= price;
		own = true;
	}
	public void result(){
		System.out.println("������ ���� -> �����ܰ�: "+money+"����"+" �� ��������: "+own);
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
