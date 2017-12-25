import java.util.InputMismatchException;
import java.util.Scanner;

class NegativeInputException1 extends Exception{
	private String reason;

	public NegativeInputException1(){
		super();
		reason = "음수입력";
	}
	@Override
	public String toString() {
		return "NegativeInputException : " + reason;
	}
	
}
public class GradeInput {

	public static void main(String[] args) {
		try{
		int newGrade;
		Scanner scan = new Scanner(System.in);
		System.out.print("점수입력 : ");
		while(scan.hasNext()){
			newGrade = scan.nextInt();
			if(newGrade < 0) throw new NegativeInputException();
			System.out.print("점수입력 : ");
		}
		}catch(InputMismatchException ime){
			System.out.println(ime.toString());
		}catch(NegativeInputException nie){
			System.out.println(nie.toString());
		}
	}

}
