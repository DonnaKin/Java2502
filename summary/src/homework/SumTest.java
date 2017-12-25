package homework;

class Sum{
	public Sum(int ...number){
		int total = 0;
		if(number.length>10){
			System.out.println("인자값이 너무 많습니다.");
			return;
		}
		for(int i=0;i<number.length;i++){
			total += number[i];
		}
		System.out.println("더한 값 : "+total);
	}
}
public class SumTest {
	public static void main(String[] args) {
		Sum sum_v = new Sum(1,5,3,2,6);
	}

}