package homework;

class Max{
	public Max(int ...number){
		int maxnum = 0;
		if(number.length>10){
			System.out.println("인자값이 너무 많습니다.");
			return;
		}
		for(int i=0;i<number.length;i++){
			if(maxnum<number[i])
				maxnum = number[i];
		}
		System.out.println("최댓값 : "+maxnum);
	}
}
public class MaxTest {
	public static void main(String[] args) {
		Max max_v = new Max(10,99,500,293,79,69,1000,493);
		
	}

}
