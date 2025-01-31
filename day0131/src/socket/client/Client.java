package socket.client;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;

public class Client {
	//클라이언트가 작동하려면 서버가 먼저 작동이 되고 있어야함.
	public static void main(String[] args) {
		//Socket socket = new Socket("ip가 들어가는 부분->127.0.0.1 이런식으로 ", 0);//


		try{
			//String ip = InetAddress.getLocalHost().getHostAddress(); getHostAddress-> 내PC 문제해석할때 주의
			//System.out.println("ip:"+ip);
			
			//Socket socket = new Socket("192.168.10.51",12345);//소켓에 ip주소 직접 입력해줘도 됨
			System.out.println("서버에 요청");
			Socket socket = new Socket();
			socket.connect(new InetSocketAddress("192.168.10.51",12345));//첫번째꺼 ip주소, 두번째 port 번
			//Socket socket = new Socket("192.168.10.51",12345);
			
			System.out.println("연결 성공");
			socket.close(); //이렇게 소켓 닫아줘야함 
		
		} catch (IOException e) {
			e.printStackTrace();
		}
	
	}

}
