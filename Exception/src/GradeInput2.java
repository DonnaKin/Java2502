class NegativeInputException extends Exception{
	private String reason;

	public NegativeInputException(){
		super();
		reason = "�����Է�";
	}

	@Override
	public String toString() {
		return "NegativeInputException : " + reason;
	}
	
}
public class GradeInput2 {
	public static void main(String[] args) {
		

	}
}
