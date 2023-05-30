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
public class dataTGuru {
    
    private ArrayList<Integer> IdGuru;
    private ArrayList<Integer> IdTWaliKelas;
    private ArrayList<String> NamaGuru;
    private ArrayList<String> MpGuru;
    private ArrayList<String> AlamatGuru;
    
    public dataTGuru(){
        IdGuru = new ArrayList<Integer>();
        IdTWaliKelas = new ArrayList<Integer>();
        NamaGuru = new ArrayList<String>();
        MpGuru = new ArrayList<String>();
        AlamatGuru = new ArrayList<String>();
    }
    
    //IdGuru
    public void insertIdGuru(Integer isi){
        this.IdGuru.add(isi);
    }
    
    public ArrayList<Integer> getRecordIdGuru(){
        return this.IdGuru;
    }
    
    //IdTWaliKelas
    public void insertIdTWaliKelas(Integer isi){
        this.IdTWaliKelas.add(isi);
    }
    
    public ArrayList<Integer> getRecordIdTWaliKelas(){
        return this.IdTWaliKelas;
    }
    
    //NamaGuru
    public void insertNamaGuru(String isi){
        this.NamaGuru.add(isi);
    }
    
    public ArrayList<String> getRecordNamaGuru(){
        return this.NamaGuru;
    }
    
    //MpGuru
    public void insertMpGuru(String isi){
        this.MpGuru.add(isi);
    }
    
    public ArrayList<String> getRecordMpGuru(){
        return this.MpGuru;
    }
    
    //AlamatGuru
    public void insertAlamatGuru(String isi){
        this.AlamatGuru.add(isi);
    }
    
    public ArrayList<String> getRecordAlamatGuru(){
        return this.AlamatGuru;
    }
    
}
