package stringBuffer;

class DelChar{
	public String Delete(String str1, String str2){
		StringBuffer array = new StringBuffer(str1);//str1�� �ִ� ���ڵ��� ���� ����

		int i,j;
		for(i=0;i<str1.length();i++){
			for(j =0;j<str2.length();j++){
				if(str1.charAt(i)==str2.charAt(j))
					array.setCharAt(i,' ');
			}
		}
		
		for(int k =0;k<array.length();k++){
			if(array.codePointAt(k)==32){
				array.delete(k,k+1);
			    k--;
			}
		}
		return array.toString();
	}
}
public class DelCharTest {
	public static void main(String[] args) {
		DelChar dc = new DelChar();
		System.out.println(dc.Delete("1%5@6$7##0+", "%@$31#+"));
	}

}