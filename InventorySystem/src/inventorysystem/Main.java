/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventorysystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        
         {
        Connection connection = null;
        
        try {
            String url = "jdbc:mysql://localhost:3306/inventorysystem?user=root&password=root";
            connection = DriverManager.getConnection(url);
            
        } catch (SQLException error) {
            JOptionPane.showMessageDialog(null,"ERROOOOOOOOO" +  error.getMessage());
        }
        
        
    }
    
    }
}
       
