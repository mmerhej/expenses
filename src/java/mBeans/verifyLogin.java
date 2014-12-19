/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package mBeans;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author itexecutive
 */
@ManagedBean
@SessionScoped
public final class verifyLogin {
    private String count;
    Connection con;
    Statement st;
    ResultSet rs;
    String url = "jdbc:mysql://localhost:3306/expenses";
    String user = "root";
    String password = "bday30031985";
    
    public String getCount() {
        return count;
    }
    
    public void setCount(String count) {
        this.count = count;
    }
    /**
     * Creates a new instance of verifyLogin
     */
    public verifyLogin() {
        
        
        try {
            con = DriverManager.getConnection(url, user, password);
            st = con.createStatement();
            rs = st.executeQuery("SELECT count(*) from users u where u.username='"+loginBean.fuser+"'");
            
            if (rs.next()) {
                setCount(rs.getString(1)) ;
            }
            
        } catch (SQLException ex) {
            Logger lgr = Logger.getLogger(verifyLogin.class.getName());
            lgr.log(Level.SEVERE, ex.getMessage(), ex);
            
            
        }
    }
}
