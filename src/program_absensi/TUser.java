/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package program_absensi;
import dataset.dataTUser;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrator 10
 */
public class TUser {
    private int idAdmin;
    private String username;
    private String password;
    
    String defaultUsername = "admin";
    String defaultPassword = "admin";
    //dataTUser dataTUserObj = new dataTUser();
    
    //String TUsrUsr = dataTUserObj.getRecordUsername().get(0);
    //String TUsrPswd = dataTUserObj.getRecordPassword().get(0);
    
    
    
    public TUser(int idAdmin, String username, String password) {
        this.idAdmin = idAdmin;
        this.username = username;
        this.password = password;
    }
    
    public TUser(String username, String password) {
        //this.userDataset = dataset;  //inisiasi variabel dataset 
        this.username = username;
        this.password = password;
    }
    
    public TUser(){}
    
    //idAdmin
    public void setIdAdmin(int idAdmin) {
        this.idAdmin = idAdmin;
    }
    
    public int getIdAdmin() {
        return idAdmin;
    }
    
    //username
    public void setUsername(String username) {
        this.username = username;
    }
    
    public String getUsername() {
        System.out.print("getUsername "+ username);
        return username;
    }
    
    //password
    public void setPassword(String password) {
        this.password = password;
    }
    
    public String getPassword() {
        return password;
    }
     
    public boolean login(String username, String password) {
    if ((username.equals(defaultUsername)) && password.equals(defaultPassword)){
        return true;
       }
        return false;
    }
}

