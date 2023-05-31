/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataset;
import java.util.ArrayList;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
/**
 *
 * @author hakase
 */
public class dataTAbsensi {
    
    private ArrayList<Integer> IdAbsen;
    private ArrayList<Integer> IdTSiswa;
    private ArrayList<LocalDate> WktAbsen;
    private ArrayList<String> KetAbsen;
    
    public dataTAbsensi(){
        IdAbsen = new ArrayList<Integer>();
        IdTSiswa = new ArrayList<Integer>();
        WktAbsen = new ArrayList<LocalDate>();
        KetAbsen = new ArrayList<String>();        
    }
    
    // IdAbsen
    public void insertIdAbsen(int isi){
        this.IdAbsen.add(isi);
    }
    
    public ArrayList<Integer> getRecordIdAbsen(){
        return this.IdAbsen;
    }
    
    //IdTSiswa
    public void insertIdTSiswa(int isi){
        this.IdTSiswa.add(isi);
    }
    
    public ArrayList<Integer> getRecordIdTSiswa(){
        return this.IdTSiswa;
    }
    
    //WktAbsen
    public void insertWktAbsen(LocalDate isi){
        this.WktAbsen.add(isi);
    }
    
    public ArrayList<LocalDate> getRecordWktAbsen(){
        return this.WktAbsen;
    }
    
    //KetAbsen
    public void insertKetAbsen(String isi){
        this.KetAbsen.add(isi);
    }
    
    public ArrayList<String> getRecordKetAbsen(){
        return this.KetAbsen;
    }
    
}
