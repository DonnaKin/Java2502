//과제 : 추상클래스로 바꾸기
package shape2.summary;
//추상클래스 + 상속
abstract class Shape2{
	//속성
	String name;
	//생성자메서드
	public Shape2(String name){
		this.name=name; //뒤의 name: 인스턴스 생성할때 들어오는 매개변수
	}
	//메서드
	public abstract void getArea();
	public abstract void getSurroundings();
	/*String name;
	public Shape1(String name){
		this.name=name;
	}
	void getSurroundings(){
		System.out.println("둘레 ");
	};
	void getArea(){
		System.out.println("넓이 ");
	};
	*/
}
class Circle2 extends Shape2{
	private double r;
	final double PI = 3.14;
	//생성자 메서드
	public Circle2(String name, double r){
		super(name);
		this.r=r;
	}
	//메서드 오버라이딩
	public void getArea(){
		System.out.println(name+"의 넓이: "+(PI*r*r));
	}
	public void getSurroundings(){
		System.out.println(name+"의 둘레: "+(2*PI*r));
	}
	/*int r=5;
	void getSurroundings(){
		System.out.println(2*r*3.14);
	}
	void getArea(){
		System.out.println(r*r*3.14);
	}
	*/
}
class Square2 extends Shape2{
	private double w;
	private double h;
	//생성자메서드
	public Square2(String name, double w, double h){
		super(name);
		this.w=w;
		this.h=h;
	}
	//메서드 오버라이딩
	public void getArea(){
		System.out.println(name+"의 넓이: "+(w*h));
	}
	public void getSurroundings(){
		System.out.println(name+"의 둘레: "+2*(w+h));
	}
	/*int w=5,h=4;
	void getSurroundings(){
		System.out.println(2*(w+h));
	}
	void getArea(){
		System.out.println(w*h);
	}*/
}
public class Shape2Test {

	public static void main(String[] args) {
		Circle2 c2 = new Circle2("원",5);
		Square2 s2 = new Square2("사각형",2,10);
		c2.getArea();
		c2.getSurroundings();
		s2.getArea();
		s2.getSurroundings();
	}
}
