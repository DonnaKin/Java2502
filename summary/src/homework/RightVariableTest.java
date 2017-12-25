package homework;

class isRightVariable{
	public void isRightVariable(String str1){
	String str[] = {"abstract","assert","boolean","break","byte","cast","catch","char","class",
			"const","continue","default","do","double","else","extends","false","final","finally",
			"float","for","goto","if","implements","import","instance","int","interface","long",
			"native","new","null","package","private","protected","public","return","short","static",
			"super","switch","synchronized","this","throw","throws","transient","true","try","void",
			"volatile","while"};
	char c = str1.charAt(0);
//	char[] c_arr = str1.toCharArray();
	if(str1.length()>10){
		System.out.println("변수 명의 길이가 너무 깁니다."); return;
	}
	for(int i = 0; i<str.length;i++){
		if(str1==str[i]){
			System.out.println("false");
			return;
		}
		if(Character.isDigit(c) == true){
			System.out.println("false");
			return;
		}
		if(str1.contains(" ")){
			System.out.println("false");return;
		}
		if(Character.isUpperCase(c)!=true){
			System.out.println("false");return;
		}
		if(Character.isJavaIdentifierStart(str1.charAt(0))!=true){
			System.out.println("false");return;
		}
		if(Character.isJavaIdentifierPart(str1.charAt(i))){
			System.out.println("false");return;
		}
		if(str1.contains("_")||str1.contains("$")){
			System.out.println("true");return;
	}
			
		}
	}
}
public class RightVariableTest {
	public static void main(String[] args) {
		isRightVariable Rvariable = new isRightVariable();
		Rvariable.isRightVariable("9aaa");
		Rvariable.isRightVariable("aa_1");
		Rvariable.isRightVariable("abstract");
		Rvariable.isRightVariable("Abstract");
		Rvariable.isRightVariable("*abstract");
	}

}
