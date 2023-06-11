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
public class dataTWaliKelas {
    private ArrayList<Integer> IdWaliKelas;
    private ArrayList<String> NamaWaliKelas;
    private ArrayList<Integer> IdTGuru;
    
    public dataTWaliKelas(){
        IdWaliKelas = new ArrayList<Integer>();
        NamaWaliKelas = new ArrayList<String>();
        IdTGuru = new ArrayList<Integer>();
    }
    
    //idWaliKelas
    public void insertIdWaliKelas(Integer isi){
        this.IdWaliKelas.add(isi);
    }
    
    public ArrayList<Integer> getRecordIdWaliKelas(){
        return this.IdWaliKelas;
    }
    
    //NamaWaliKelas
    public void insertNamaWaliKelas(String isi){
        this.NamaWaliKelas.add(isi);
    }
    
    public ArrayList<String> getRecordNamaWaliKelas(){
        return this.NamaWaliKelas;
    }
    
    //IdTGuru
    public void insertIdTGuru(Integer isi){
        this.IdTGuru.add(isi);
    }
    
    public ArrayList<Integer> getRecordIdTGuru(){
        return this.IdTGuru;
    }
}
