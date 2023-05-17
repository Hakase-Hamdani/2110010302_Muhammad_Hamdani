/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package program_absensi;

/**
 *
 * @author Administrator 10
 */
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TSiswa {
    private int idSiswa;
    private String namaSiswa;
    private Boolean jkSiswa;
    private String tlSiswa;
    private LocalDate tgllSiswa;
    private String alamatSiswa;
    
    public TSiswa(int idSiswa, String namaSiswa, Boolean jkSiswa, String tlSiswa, LocalDate tgllSiswa, String alamatSiswa){
        this.idSiswa = idSiswa; //jelas
        this.namaSiswa = namaSiswa; //jelas
        this.jkSiswa = jkSiswa; //jenis kelamin
        this.tlSiswa = tlSiswa; //tempat lahir
        this.tgllSiswa = tgllSiswa; //tanggal lahir
        this.alamatSiswa = alamatSiswa; //alamat
    }
    
    //get set idSiswa
    public int getidSiswa(){
        return idSiswa;
    }
    
    public void setidSiswa(int idSiswa){
        this.idSiswa = idSiswa;
    }
    
    //get set namaSiswa
    public String getnamaSiswa(){
        return namaSiswa;
    }
    
    public void setnamaSiswa(String namaSiswa){
        this.namaSiswa = namaSiswa;
    }
    
    //get set jkSiswa
    public Boolean getjkSiswa(){
        return jkSiswa;
    }
    
    public void setjkSiswa(Boolean jkSiswa){
        this.jkSiswa = jkSiswa;
    }
    
    //get set ttlSiswa
    public String gettlSiswa(){
        return tlSiswa;
    }
    
    public void settlSiswa(String tlSiswa){
        this.tlSiswa = tlSiswa;
    }
    
    //get set ttglSiswa
    public LocalDate gettgllSiswa(){
        return tgllSiswa;
    }
    
    public void settgllSiswa(LocalDate tgllSiswa){
        this.tgllSiswa = tgllSiswa;
    }
    
    //get set alamatSiswa
    public String getalamatSiswa(){
        return alamatSiswa;
    }
    
    public void setalamatSiswa(String alamatSiswa){
        this.alamatSiswa = alamatSiswa;
    }
    
    //display
    public void displaytSiswa(){
        System.out.println("Nama" + namaSiswa);
        System.out.println("Jenis Kelamin" + jkSiswa);
        System.out.println("Tempat Lahir" + tlSiswa);
        System.out.println("Tanggal Lahir" + tgllSiswa);
        System.out.println("Alamat" + alamatSiswa);
        
    }
    
    
}
