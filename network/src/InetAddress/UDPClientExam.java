package InetAddress;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class UDPClientExam {

	public static void main(String[] args) {
		System.out.println("���� �޽��� : ");
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String msg;
		try {
			msg = in.readLine();
			DatagramPacket dp;
		try {
			dp = new DatagramPacket(msg.getBytes(),msg.getBytes().length,InetAddress.getByName("10.96.123.163"),
					3000);
			DatagramSocket ds = new DatagramSocket();
			ds.send(dp);
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}

}