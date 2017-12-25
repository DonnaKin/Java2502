package TCP;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServerExam2 {

	public static void main(String[] args) {
		ServerSocket ss;
		try {
			ss = new ServerSocket(1998);
			System.out.println("TCP ���� �����");
		
		Socket so;
		try {
			so = ss.accept();
			BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		BufferedReader br=new BufferedReader(new InputStreamReader(so.getInputStream()));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(so.getOutputStream()));
		
		while(true) {
			System.out.println(">>>>>>Ŭ���̾�Ʈ�� �޽����� ��ٸ�����<<<<<<");
			String get_msg=br.readLine();
			System.out.println("�����ּ� :"+so.getInetAddress());
			System.out.println("�������� :"+get_msg);
			
			System.out.println("�����޽���:");
			
			String send_msg=in.readLine();
			bw.write(send_msg+"\n");
			bw.flush();
			if(send_msg.equals("exit")) {
				so.close();
				bw.close();
				System.exit(0);
			}
		}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}