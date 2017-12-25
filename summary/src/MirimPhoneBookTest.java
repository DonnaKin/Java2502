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
		System.out.println("이름 : "+ name);
		System.out.println("전화번호 : "+ phoneNumber);
		System.out.println("주소 : "+ address);
	}
	
}

class Student extends Mirim{
	int st_number;
	
	public Student(String name, String phoneNumber, String address, int st_number) {
		super(name, phoneNumber, address);
		this.st_number = st_number;
	}
	public void showdata(){ //오버라이딩 => 다형성
		super.showdata();
		System.out.println("학번 : "+ st_number);
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
		System.out.println("사번 : "+ tch_number);
	}
	
}

class Handler{
	//메인에서 10이라는 인자를 넘겨받아 Mirim타입의 10개 방짜리 배열을 생성자메서드에서 생성
	Mirim myMirim[];//선언
	int numOfMirim;//배열 인덱스
	public Handler(int num){
		myMirim = new Mirim[10];//생성 후 연결
		numOfMirim = 0;
	}

	public void add(int choice) {
		String name;
		String phoneNumber;
		String address;
		int st_number;
		int tch_number;
		// 1=> 학생정보 입력, 배열=학생 인스턴스 생성, 배열에 저장
		Scanner scan = new Scanner(System.in);
		System.out.print("이름 : "); name=scan.next();
		System.out.print("전화번호 : "); phoneNumber = scan.next();
		System.out.print("주소 :"); address = scan.next();
		if(choice == 1){
			System.out.print("학번 : "); st_number = scan.nextInt();
			myMirim[numOfMirim]= new Student(name, phoneNumber, address, st_number);
			numOfMirim++;
		}
		// 2=> 교사정보 입력, 배열=교사 인스턴스 생성, 배열에 저장
		else{
			System.out.print("사번 : "); tch_number = scan.nextInt();
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
		System.out.println("***메뉴선택***");
		System.out.println("1.학생정보 저장");
		System.out.println("2.교사정보저장");
		System.out.println("3.정보출력");
		System.out.println("4.종료");
		System.out.println("선택 >>>");
		
		Scanner scan = new Scanner(System.in);
		
		int choice = scan.nextInt();
		
		switch(choice){
		case 1 : ctrl.add(choice); break;
		case 2 : ctrl.add(choice); break;
		case 3 : ctrl.show(); break;
		case 4 : System.out.println("프로그램을 종료합니다."); return;
		default: System.out.println("적당한 메뉴를 다시 선택하세요 ! ! !");
		}//end of switch
	}//end of while
	}

}
