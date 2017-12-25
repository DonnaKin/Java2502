package string;

class TranslateKorean{
	public static String Translate(int number){ 
		String[] change = {"","일","이","삼","사","오","육","칠","팔","구"}; //바꿀 한글
		String[] unit = {"","십","백","천","만"}; //단위
		if(number<0||number>9999999){
			System.out.println("범위 초과");
		}
		String num = String.valueOf(number);//int를 string으로 변환
		StringBuffer result = new StringBuffer(); //append를 쓰기 위해 StringBuffer로 선언
		int len = num.length(); //num의 배열 방 크기
		for(int i=len-1; i>=0; i--){ 
			result.append(change[Integer.parseInt(num.substring(len-i-1, len-i))]);
			System.out.print(change[Integer.parseInt(num.substring(len-i-1, len-i))]+"\t");
			//한글로 어떻게 출력되는지 보여줌
			//len-i-1에서 len-i까지의 문자를 추출한 것을 문자열로 변환한 값의 change를 result에 추가
			if(Integer.parseInt(num.substring(len-i-1, len-i)) > 0)
				//만약 그 값이 0보다 크면 unit의 i%4 한 값을 추가
				result.append(unit[i%4]); 
			if(i%4 == 0) 
				//만약 0이라면 unit의 i%5 한 값을 추가
				result.append(unit[i%5]); 
			} 
		return result.toString(); //result값을 string으로 반환시켜줌
	}
}
public class NumToKorean {

	public static void main(String[] args) {
		System.out.println(TranslateKorean.Translate(12345));
		System.out.println(TranslateKorean.Translate(10030));
		System.out.println(TranslateKorean.Translate(25));
	}
}
