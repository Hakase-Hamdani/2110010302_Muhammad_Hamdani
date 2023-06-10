/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataset;
import java.util.ArrayList;

/**
 *
 * @author hakase
 */
public class dataTKelas {
    private ArrayList<Integer> IdKelas;
    private ArrayList<Integer> IdTWaliKelas;
    private ArrayList<Integer> IdTSiswa;
    private ArrayList<String> NamaKelas;
    
    public dataTKelas(){
        IdKelas = new ArrayList<Integer>();
        IdTWaliKelas = new ArrayList<Integer>();
        IdTSiswa = new ArrayList<Integer>();
        NamaKelas = new ArrayList<String>();
        
    }
    
    //idKelas
    public void insertIdKelas(Integer isi){
        this.IdKelas.add(isi);
    }
    
    public ArrayList<Integer> getRecordIdKelas(){
        return this.IdKelas;
    }
    
    //idTWaliKelas
    public void insertIdTWaliKelas(Integer isi){
        this.IdTWaliKelas.add(isi);
    }
    
    public ArrayList<Integer> getRecordIdTWaliKelas(){
        return this.IdTWaliKelas;
    }
    
    //IdTSiswa
    public void insertIdTSiswa(Integer isi){
        this.IdTSiswa.add(isi);
    }
    
    public ArrayList<Integer> getRecordIdTSiswa(){
        return this.IdTSiswa;
    }
    
    //NamaKelas
    public void insertNamaKelas(String isi){
        this.NamaKelas.add(isi);
    }
    
    public ArrayList<String> getRecordNamaKelas(){
        return this.NamaKelas;
    }
    
    
    
}
