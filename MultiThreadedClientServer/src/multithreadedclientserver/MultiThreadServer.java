
package multithreadedclientserver;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;


public class MultiThreadServer {
    public static void main(String[] args) {
        try
    {
        
        ServerSocket listensocSocket = new ServerSocket(7896);
        System.out.println("server Running.....");
        while(true)
        {
            Socket clientsocket = listensocSocket.accept();
            Connection1 con = new Connection1(clientsocket);
        }
        
    }
    catch(Exception e)
    {
     e.getStackTrace();
    }
    }
    
    
}

class Connection1 extends Thread
{
    Socket clientsocket;
    DataOutputStream dos;
    DataInputStream dis;
    public Connection1(Socket aclientSocket) {
       
     clientsocket = aclientSocket;
     
     try
     {
       dos = new DataOutputStream(clientsocket.getOutputStream());
       dis = new DataInputStream(clientsocket.getInputStream());
       this.start();
     }
     catch(Exception e)
     {
       e.getStackTrace();
     }
    }
    
    
    
    public void run()
    {
       
        try
        {
            for(;;)
            {
             String data =  dis.readUTF();
             dos.writeUTF("From Server : " + data.toUpperCase());
            }
        }
        catch(Exception e)
        {
         e.getStackTrace();
        }
        finally
        {
            try {
                clientsocket.close();
            } catch (IOException ex) {
                Logger.getLogger(Connection1.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
