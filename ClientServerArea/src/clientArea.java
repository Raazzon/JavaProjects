
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;


public class clientArea {
    
    public static void main(String[] args) throws IOException {
        Socket s= new Socket("localhost",1201);
        DataInputStream dis = new DataInputStream(s.getInputStream());
        DataOutputStream dos = new DataOutputStream(s.getOutputStream());
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter length");
        String l = br.readLine();
        System.out.println("Enter Breadth");
        String b = br.readLine();
        
        dos.writeUTF(l);
        dos.writeUTF(b);
        
        String area = dis.readUTF();
        String peri = dis.readUTF();
        
        System.out.println("Area : " +area + "\n" + "Perimeter : "+peri);
        
        dis.close();
        dos.close();
        
        
    }
    
}
