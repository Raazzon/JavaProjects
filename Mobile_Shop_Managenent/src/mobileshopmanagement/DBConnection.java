/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mobileshopmanagement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author rajan
 */
public class DBConnection {
       private Connection conn;
        private Statement st;
        private ResultSet rs;
   public static Connection ConnectDB(){
     
   try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:8080/mobile","root","");
             Statement st = conn.createStatement();
            return conn;
        } catch (Exception ex) {
            System.out.println("Error:  "+ex);
        
    }
    return null;
}
    

 public void getdata(){
        try{
            String query = "select * from users";
            rs = st.executeQuery(query);
            System.out.println("");
            while(rs.next()){
                String username =rs.getString("username");
                String password =rs.getString("password");
                System.out.println("Username:" +username+" "+"Password:"+password );
            }
        
        
        }catch(Exception ex){
            System.out.println(ex);
            
        }
        
        
        
 }
 }