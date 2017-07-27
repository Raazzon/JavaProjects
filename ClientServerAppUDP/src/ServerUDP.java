
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;


public class ServerUDP {
    public static void main(String[] args) throws SocketException, IOException 
    {    
        DatagramSocket serversocket = new DatagramSocket(8125);
            byte [] sendData = new byte[1024];
            byte [] recData = new byte[1024];
            System.out.println("Server Strating............");
        while(true)
        {
        try {   
            DatagramPacket recpacket = new DatagramPacket(recData,recData.length);
            serversocket.receive(recpacket );
             recData = recpacket.getData();
             String sentence = new String(recData);
             String capitalizatin = sentence.toUpperCase();
             sendData = capitalizatin.getBytes();
             
             InetAddress ipaddress = recpacket.getAddress();
             int port = recpacket.getPort();
             
            DatagramPacket sendpacket =  new DatagramPacket(sendData,sendData.length ,ipaddress ,port);
            serversocket.send(sendpacket );
            serversocket.close();
            
        }
        catch(Exception e)
        {
           e.getStackTrace();   
        }
        }

    }
    
}
