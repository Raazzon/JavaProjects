
package multithreadedclientserver;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;


public class ClientMultiThread {

    
    public static void main(String[] args) {
        String str1 =" ";
        try
        {
            Socket soc = new Socket("localhost",7896);
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            DataOutputStream dos = new DataOutputStream(soc.getOutputStream());
            DataInputStream dis = new DataInputStream(soc.getInputStream());
            
            boolean flag =true;
            System.out.println("Type Message : Type BYE to Quit");
            while(flag)
            {
                str1 = br.readLine();
                if(str1.equalsIgnoreCase("bye"))flag =false;
                else
                {
                 dos.writeUTF(str1);
                    System.out.println(dis.readUTF());
                }   
            }
            
            
        }
        catch(Exception e)
        {
         e.getStackTrace();
        }
    }
    
}
