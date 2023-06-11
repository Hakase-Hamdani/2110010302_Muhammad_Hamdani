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
    //membuat instance dataTUser agar bisa di akses sebagai userDataset
    //private dataTUser userDataset = new dataTUser();
    
    //default buat dua variable di bawah
    String defaultUsername = "admin";
    String defaultPassword = "admin";
    
    
    public TUser(int idAdmin, String username, String password) {
        this.idAdmin = idAdmin;
        this.username = username;
        this.password = password;
    }
    
    public TUser(dataTUser dataset, String username, String password) {
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
        return username;
    }
    
    //password
    public void setPassword(String password) {
        this.password = password;
    }
    
    public String getPassword() {
        return password;
    }
    
    //ArrayList<String> logUsername = userDataset.getRecordUsername();
    //ArrayList<String> logPassword = userDataset.getRecordPassword();  
    public boolean login() {
        //setUsername("admin");
        //setPassword("admin");
        if (getUsername().equals(defaultUsername) && getPassword().equals(defaultPassword)){
            return true;
        } else {
            return false;
        }
    }    
    /*  ArrayList<String> logUsername = userDataset.getRecordUsername();
        ArrayList<String> logPassword = userDataset.getRecordPassword();
        if ((logUsername.get(0).equals(null)) && (logUsername.get(0).isEmpty()) && (logPassword.get(0).equals(null)) && (logPassword.get(0).isEmpty())){            
            if (logUsername.get(0).equals(defaultUsername) && (logPassword.get(0).equals(defaultPassword))){            
                return true;
            } else {
                return false;
            }
        }
        }return false;
    */
    
}

