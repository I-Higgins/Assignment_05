
import javax.net.*;
import javax.net.ssl.*;
import java.io.*;
import java.util.*;
import java.security.*;




public class ChatClient {

public static void main(String args[]){

	InetAddress group = InetAddress.getByName(239.0.202.1);
	MulticastSocket multicast = new MulticastSocket(40202);
	byte[] buf = new byte[1500];
	DatagramPacket dp = new DatagramPacket(buf, buf.length);




	ms.receive(dp);
	dp.getData(), dp.length();
	DatagramPacket pkt = new DatagramPacket(buf, buf.length);

	String address1 = "239.0.202.1";
	InetAddress address = new address1.getHostAddress();
	multicast.joinGroup(address);



	}




}
