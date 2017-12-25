package TCP;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCPClientExam {

	public static void main(String[] args) {
		InetAddress ia;
		try {
			ia = InetAddress.getByName("10.96.123.163");
			Socket so;
		try {
			so = new Socket(ia,5000);
			System.out.println("보낼 메시지 : ");
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String msg = in.readLine();
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(so.getOutputStream()));
		
		bw.write(msg+"\n");
		bw.flush();
		bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}

}
