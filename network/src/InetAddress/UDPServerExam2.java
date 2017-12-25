package InetAddress;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UDPServerExam2 {

	public static void main(String[] args) {
		DatagramSocket ds;
		try {
			ds = new DatagramSocket(20);
			byte[] data = new byte[65508];
		
		DatagramPacket dp = new DatagramPacket(data,data.length);
		System.out.println("UDP���� �����");
		while(true){
		try {
			ds.receive(dp);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String msg = new String(dp.getData()).trim();
		
		System.out.println("���� �ּ� : "+dp.getAddress());
		System.out.println("���� �޽��� : "+msg);
		}
		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		}
	}


