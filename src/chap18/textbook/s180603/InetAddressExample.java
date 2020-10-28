package chap18.textbook.s180603;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressExample {
	public static void main(String[] args) {
		try {
			InetAddress local = InetAddress.getLocalHost();
			System.out.println("내 컴퓨터 주소 : " +local.getHostAddress());
			
			InetAddress[] iaArr = InetAddress.getAllByName("www.naver.com");
			for(InetAddress remote : iaArr) {
				System.out.println("www.navre.com IP주소 : "+remote.getHostAddress());
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}
}
