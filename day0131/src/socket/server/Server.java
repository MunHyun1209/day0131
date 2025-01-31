package socket.server;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

public class Server {

	public static void main(String[] args) {
		
		
		//*문제예시*
		//서버의 IP를 알아야함
		//TCP/IP소켓을 사용하여 클라이언트에서 서버로 연결처리하는 프로그램을 아래처럼 구현했다
		//그러나 서버와 소켓이 연결되지 않았습니다. 문제점을 코드에서 찾아 원인을 파악하고,
		//해결방법을 코드작성해서 제출하세요
		//127.0.0.1 에서만 접근이 가능한
		
		
		//try {
			//InetAddress ia = InetAddress.getLocalHost();
			//System.out.println(ia.getHostAddress());//이렇게 해도 되고

		//	String myIp=InetAddress.getLocalHost().getHostAddress();
		//	System.out.println(myIp);//이렇게 해도 됨
		
		//} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
		//	e.printStackTrace();
		//}
		
		//ServerSocket serverSocket2=new ServerSocket();
		//serverSocket2.bind(new InetSocketAddress("localhost",12345));//이렇게 하는방식도 있다~~
		
		
		try (ServerSocket serverSocket=new ServerSocket(12345)){
			//0.0.0.0 모든 네트워크에서 접근이 가능, 내부,외부 모두
			//ServerSocket serverSocket=new ServerSocket(12345);//try 옆에 붙여도 됨
			Socket client = serverSocket.accept();
			InetSocketAddress ia =(InetSocketAddress)client.getRemoteSocketAddress();
			System.out.println("address :" +ia.getAddress());
			System.out.println("HostName : "+ia.getHostName());
			//serverSocket.close();
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}
