
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import javax.swing.JOptionPane;


public class ClientUDP {
    public static void main(String[] args) throws SocketException, IOException 
    {        
       
        
        
        try 
        {
            DatagramSocket clientsocket = new DatagramSocket();             
            InetAddress ipaddress = InetAddress.getByName("127.0.0.1");
            
            byte [] sendData = new byte[1024];
            byte [] recData = new byte[1024];
            
            String sentence = JOptionPane.showInputDialog("Enter Any Sentence for capitalization");
            sendData = sentence.getBytes();
            
            DatagramPacket sendpacket =  new DatagramPacket(sendData,sendData.length ,ipaddress ,8125);
            clientsocket.send(sendpacket );
            
            DatagramPacket recpacket = new DatagramPacket(recData,recData.length);
            clientsocket.receive(recpacket );
            String modifiedstr  = new String(recpacket.getData());
            System.out.println("From Server :   " + modifiedstr);
            clientsocket.close();
        }
        catch(Exception e)
        {
         e.getStackTrace();
        }
           
       }

    
    
}
