
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author xristos
 */
public class HibarnateCrud {
    
    Connection conn;
    public Connection getCon(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
             DriverManager.getConnection("dbc:mysql://localhost:3306/hibarnatecrud?zeroDateTimeBehavior=convertToNull","root","1234");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(HibarnateCrud.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(HibarnateCrud.class.getName()).log(Level.SEVERE, null, ex);
        }
       
       
        
        
    return conn;
    }
    
}
//?serverTimezone=Europe/Athens