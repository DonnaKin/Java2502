
public class ThrowExam {
	public static void arrayMethod() throws ArrayIndexOutOfBoundsException{
		String[] irum = new String[3];
		irum[3] = "홍길동";
	}
	public static void main(String[] args){
		ThrowExam ts = new ThrowExam();
		try{
			arrayMethod();//호출한 곳으로 넘긴다.
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("배열 예외 발생 ");
		}
	}

}
