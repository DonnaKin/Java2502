package string;

class TranslateKorean{
	public static String Translate(int number){ 
		String[] change = {"","��","��","��","��","��","��","ĥ","��","��"}; //�ٲ� �ѱ�
		String[] unit = {"","��","��","õ","��"}; //����
		if(number<0||number>9999999){
			System.out.println("���� �ʰ�");
		}
		String num = String.valueOf(number);//int�� string���� ��ȯ
		StringBuffer result = new StringBuffer(); //append�� ���� ���� StringBuffer�� ����
		int len = num.length(); //num�� �迭 �� ũ��
		for(int i=len-1; i>=0; i--){ 
			result.append(change[Integer.parseInt(num.substring(len-i-1, len-i))]);
			System.out.print(change[Integer.parseInt(num.substring(len-i-1, len-i))]+"\t");
			//�ѱ۷� ��� ��µǴ��� ������
			//len-i-1���� len-i������ ���ڸ� ������ ���� ���ڿ��� ��ȯ�� ���� change�� result�� �߰�
			if(Integer.parseInt(num.substring(len-i-1, len-i)) > 0)
				//���� �� ���� 0���� ũ�� unit�� i%4 �� ���� �߰�
				result.append(unit[i%4]); 
			if(i%4 == 0) 
				//���� 0�̶�� unit�� i%5 �� ���� �߰�
				result.append(unit[i%5]); 
			} 
		return result.toString(); //result���� string���� ��ȯ������
	}
}
public class NumToKorean {

	public static void main(String[] args) {
		System.out.println(TranslateKorean.Translate(12345));
		System.out.println(TranslateKorean.Translate(10030));
		System.out.println(TranslateKorean.Translate(25));
	}
}
