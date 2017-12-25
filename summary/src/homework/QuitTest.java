package homework;
import java.io.*;
public class QuitTest {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter("newsong.txt"));
			while(true){
				String str = br.readLine();
				if(str.equalsIgnoreCase("q"))break;
				bw.write(str);
				bw.flush();
			}
		} catch (IOException e) {
			System.err.println(e);
		}

	}

}
