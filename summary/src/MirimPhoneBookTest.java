import java.util.Scanner;

class Mirim{
	String name;
	String phoneNumber;
	String address;
	public Mirim(String name, String phoneNumber, String address) {
		super();
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.address = address;
	}
	public void showdata(){
		System.out.println("�̸� : "+ name);
		System.out.println("��ȭ��ȣ : "+ phoneNumber);
		System.out.println("�ּ� : "+ address);
	}
	
}

class Student extends Mirim{
	int st_number;
	
	public Student(String name, String phoneNumber, String address, int st_number) {
		super(name, phoneNumber, address);
		this.st_number = st_number;
	}
	public void showdata(){ //�������̵� => ������
		super.showdata();
		System.out.println("�й� : "+ st_number);
	}
	
}

class Teacher extends Mirim{
	int tch_number;
	public Teacher(String name, String phoneNumber, String address, int tch_number) {
		super(name, phoneNumber, address);
		this.tch_number = tch_number;
	}
	public void showdata(){
		super.showdata();
		System.out.println("��� : "+ tch_number);
	}
	
}

class Handler{
	//���ο��� 10�̶�� ���ڸ� �Ѱܹ޾� MirimŸ���� 10�� ��¥�� �迭�� �����ڸ޼��忡�� ����
	Mirim myMirim[];//����
	int numOfMirim;//�迭 �ε���
	public Handler(int num){
		myMirim = new Mirim[10];//���� �� ����
		numOfMirim = 0;
	}

	public void add(int choice) {
		String name;
		String phoneNumber;
		String address;
		int st_number;
		int tch_number;
		// 1=> �л����� �Է�, �迭=�л� �ν��Ͻ� ����, �迭�� ����
		Scanner scan = new Scanner(System.in);
		System.out.print("�̸� : "); name=scan.next();
		System.out.print("��ȭ��ȣ : "); phoneNumber = scan.next();
		System.out.print("�ּ� :"); address = scan.next();
		if(choice == 1){
			System.out.print("�й� : "); st_number = scan.nextInt();
			myMirim[numOfMirim]= new Student(name, phoneNumber, address, st_number);
			numOfMirim++;
		}
		// 2=> �������� �Է�, �迭=���� �ν��Ͻ� ����, �迭�� ����
		else{
			System.out.print("��� : "); tch_number = scan.nextInt();
			myMirim[numOfMirim]= new Teacher(name, phoneNumber, address, tch_number);
			numOfMirim++;
		}
	}

	public void show() {
		for(int i=0;i<numOfMirim;i++){
			myMirim[i].showdata();
		}
	}
}

public class MirimPhoneBookTest {

	public static void main(String[] args) {
		Handler ctrl = new Handler(10);
		
		while(true){
		System.out.println("***�޴�����***");
		System.out.println("1.�л����� ����");
		System.out.println("2.������������");
		System.out.println("3.�������");
		System.out.println("4.����");
		System.out.println("���� >>>");
		
		Scanner scan = new Scanner(System.in);
		
		int choice = scan.nextInt();
		
		switch(choice){
		case 1 : ctrl.add(choice); break;
		case 2 : ctrl.add(choice); break;
		case 3 : ctrl.show(); break;
		case 4 : System.out.println("���α׷��� �����մϴ�."); return;
		default: System.out.println("������ �޴��� �ٽ� �����ϼ��� ! ! !");
		}//end of switch
	}//end of while
	}

}
