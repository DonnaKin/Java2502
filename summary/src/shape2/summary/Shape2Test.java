//���� : �߻�Ŭ������ �ٲٱ�
package shape2.summary;
//�߻�Ŭ���� + ���
abstract class Shape2{
	//�Ӽ�
	String name;
	//�����ڸ޼���
	public Shape2(String name){
		this.name=name; //���� name: �ν��Ͻ� �����Ҷ� ������ �Ű�����
	}
	//�޼���
	public abstract void getArea();
	public abstract void getSurroundings();
	/*String name;
	public Shape1(String name){
		this.name=name;
	}
	void getSurroundings(){
		System.out.println("�ѷ� ");
	};
	void getArea(){
		System.out.println("���� ");
	};
	*/
}
class Circle2 extends Shape2{
	private double r;
	final double PI = 3.14;
	//������ �޼���
	public Circle2(String name, double r){
		super(name);
		this.r=r;
	}
	//�޼��� �������̵�
	public void getArea(){
		System.out.println(name+"�� ����: "+(PI*r*r));
	}
	public void getSurroundings(){
		System.out.println(name+"�� �ѷ�: "+(2*PI*r));
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
	//�����ڸ޼���
	public Square2(String name, double w, double h){
		super(name);
		this.w=w;
		this.h=h;
	}
	//�޼��� �������̵�
	public void getArea(){
		System.out.println(name+"�� ����: "+(w*h));
	}
	public void getSurroundings(){
		System.out.println(name+"�� �ѷ�: "+2*(w+h));
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
		Circle2 c2 = new Circle2("��",5);
		Square2 s2 = new Square2("�簢��",2,10);
		c2.getArea();
		c2.getSurroundings();
		s2.getArea();
		s2.getSurroundings();
	}
}
