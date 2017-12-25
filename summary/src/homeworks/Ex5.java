package homeworks;
import java.util.StringTokenizer;
import java.io.*;

public class Ex5 {
	public static void main(String[] args) throws IOException {
		try {
			FileReader fr = new FileReader("result_1.txt");
			BufferedReader br = new BufferedReader(fr);
			String csvStr = "";
			String tmpStr = "";
			while(tmpStr != null){
				tmpStr = br.readLine();
				if(tmpStr != null){
					csvStr += tmpStr+"\t";
				}
			}
			StringTokenizer parse = new StringTokenizer(csvStr,"\t");
			int length = parse.countTokens()/4;
			String[]name = new String[length];
			String []address = new String[length];
			String []phone = new String[length];
			String []teacher = new String[length];
			String []student = new String[length];
			for(int i=0;i<length;i++){
				name[i] = parse.nextToken();
				address[i] = parse.nextToken();
				phone[i] = parse.nextToken();
				teacher[i] = parse.nextToken();
				student[i] = parse.nextToken();
			}
			for(int j=0; j<length;j++){
				System.out.println(name[j]+"\t"+address[j]+"\t"+phone[j]+"\t"+teacher[j]+"\t"+student[j]);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}
}
