
import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 0968477751
 */
public class DataBase {
    public static Connection Conn(){
    
    try{ 
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost/schoolmanagement","root","");
        JOptionPane.showMessageDialog(null, "connected");
                return con;
    }
    catch(Exception e){
           
                JOptionPane.showMessageDialog(null,e);
                return null;

    } 
   
}
    public static void main(String[] args) {
        Conn();
    }
    
}
