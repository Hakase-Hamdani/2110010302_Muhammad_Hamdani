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
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TAbsensi {
    private int IdAbsen;
    private int IdTSiswa;
    private int IdTGuru;
    private LocalDate WktAbsen;
    private String KetAbsen;
    
    public TAbsensi(int IdAbsen, int IdTSiswa, LocalDate WktAbsen, String KetAbsen){
        this.IdAbsen = IdAbsen; //jelas
        this.IdTSiswa = IdTSiswa; //jelas
        this.WktAbsen = WktAbsen; //waktu absen
        this.KetAbsen = KetAbsen; //keterangan absen
    }
    
    public int getIdAbsen(){
        return IdAbsen;
    }
    
    public void setIdAbsen(int IdAbsen){
        this.IdAbsen = IdAbsen;
    }
    
    public int getIdTSiswa(){
        return IdTSiswa;
    }
    
    public void setIdTSiswa(int IdTSiswa){
        this.IdTSiswa = IdTSiswa;
    }
    
    public int getIdTGuru(){
        return IdTGuru;
    }
    
    public void setIdTGuru(){
        this.IdTGuru = IdTGuru;
    }
            
    public LocalDate getWktAbsen(){
        return WktAbsen;
    }
    
    public void setWktAbsen(LocalDate WktAbsen){
        this.WktAbsen = WktAbsen;
    }
    
    public String getKetAbsen(){
        return KetAbsen;
    }
    
    public void setKetAbsen(String KetAbsen){
        this.KetAbsen = KetAbsen;
    }
    
    
    public void displaytSiswa(){
        System.out.println("ID Siswa" + IdTSiswa);
        System.out.println("Waktu Absen" + WktAbsen);
        System.out.println("Keterangan Absen" + KetAbsen);
    }
}
