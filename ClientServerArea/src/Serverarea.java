
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;


public class Serverarea {
    public static void main(String[] args) throws IOException {
       ServerSocket ss = new ServerSocket(1201);
       Socket s = ss.accept(); 
       
       String l ,b ;
       DataInputStream dis;
       DataOutputStream dos;
       while(true)
       {
        dis = new DataInputStream(s.getInputStream());
        dos = new DataOutputStream(s.getOutputStream()); 
        
        l = dis.readUTF();
        int lenght = Integer.parseInt(l);
        b= dis.readUTF();
        int breadth = Integer.parseInt(b);
        
        int area = lenght*breadth;        
        int peri = 2*(lenght+breadth);
        dos.writeUTF(Integer.toString(area));
        dos.writeUTF(Integer.toString(peri));
        dos.close();
        dis.close();
       }
       
       
       
    }
    
    
    
}
