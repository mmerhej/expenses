/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package mBeans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
/**
 *
 * @author itexecutive
 */
@ManagedBean
@SessionScoped
public class loginBean {
    public static String fuser;
    public static String fpass;
    
    public String getFuser() {
        return fuser;
    }
    
    public void setFuser(String fuser) {
        this.fuser = fuser;
    }
    
    public String getFpass() {
        return fpass;
    }
    
    public void setFpass(String fpass) {
        this.fpass = fpass;
    }
    
    /**
     * Creates a new instance of loginBean
     */
    public loginBean() {
    }  
}