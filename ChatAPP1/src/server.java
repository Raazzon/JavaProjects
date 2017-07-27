
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class server implements ActionListener{

    
    static  Socket s;
    static ServerSocket ss;
    static DataInputStream dis;
    static DataOutputStream dos;
    
    JFrame f;
    JButton sentbtn;
    static JTextArea msg_area;
    JTextField msg_txt;
    
    
    public server() {
        f= new JFrame("Server Program");
        f.setSize(500, 500);
        f.setDefaultCloseOperation(3);
        f.setLayout(null);
        
        sentbtn = new JButton("Sent");
        sentbtn.setBounds(345, 370, 65, 50);
        sentbtn.addActionListener(this);
        
        msg_area = new JTextArea();
        msg_area.setBounds(10, 10, 400, 350);
       msg_area.setBackground(Color.BLACK);
       // msg_area.setForeground(Color.WHITE);
       // msg_area.setCaretColor(Color.red);
        
        msg_txt = new JTextField();
        msg_txt.setBounds(10, 370, 320 , 50);
        
        f.add(sentbtn);
        f.add(msg_area);
        f.add(msg_txt);
        
        f.setVisible(true);
        
    }
    
    public static void main(String[] args) {
        new server();
        
        try
       {
         
        ss= new ServerSocket(1201);
        s = ss.accept();      
        
        dis = new DataInputStream(s.getInputStream());
        dos = new DataOutputStream(s.getOutputStream());
        //receive
        
         String str="";
        while(!str.equals("Exit"))
        {
       str = dis.readUTF();
       msg_area.setText(msg_area.getText().trim()+"\n"+str);
        }
        dis.close();
        dos.close();
       }catch(Exception e)
       {
           System.out.println(e);
       }
        
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String msg = msg_txt.getText().trim();
        try {
            dos.writeUTF(msg);
        } catch (IOException ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
