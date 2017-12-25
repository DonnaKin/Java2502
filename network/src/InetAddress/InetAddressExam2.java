package InetAddress;

import java.net.*;

public class InetAddressExam2 {

	public static void main(String[] args) {
		InetAddress ia;
		try {
			ia = InetAddress.getByName("java.sun.com");
			System.out.println("IP주소 : "+ia.getHostAddress());
			System.out.println("도메인 이름 : "+ia.getHostName());
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		
	}

}
