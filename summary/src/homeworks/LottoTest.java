package homeworks;

class Lotto {
	int ranArr[] = new int[6];
	public void lotto(){
	for(int i=0;i<6;i++){
		ranArr[i] = (int)(Math.random()*45)+1;;
		System.out.print(ranArr[i]+"\t");
		}
	}
}
public class LottoTest{
	public static void main(String[] args) {
		Lotto l = new Lotto();
		l.lotto();
	}
}

