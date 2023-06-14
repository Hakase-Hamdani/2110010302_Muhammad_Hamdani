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
public class dataTSiswa {
    private ArrayList<Integer> IdSiswa;
    private ArrayList<String> namaSiswa;
    private ArrayList<Boolean> jkSiswa;
    private ArrayList<String> tlSiswa;
    private ArrayList<String> tgllSiswa;
    private ArrayList<String> AlamatSiswa;
    
    public dataTSiswa(){
        IdSiswa = new ArrayList<Integer>();
        namaSiswa = new ArrayList<String>();
        jkSiswa = new ArrayList<Boolean>();
        tlSiswa = new ArrayList<String>();
        tgllSiswa = new ArrayList<>();
        AlamatSiswa = new ArrayList<String>();
    }
    
    //idSiswa
    public void insertIdSiswa(Integer isi){
        this.IdSiswa.add(isi);
    }
    
    public ArrayList<Integer> getRecordIdSiswa(){
        return this.IdSiswa;
    }
    
    //namaSiswa
    public void insertnamaSiswa(String isi){
        this.namaSiswa.add(isi);
    }
    
    public ArrayList<String> getRecordnamaSiswa(){
        return this.namaSiswa;
    }
    
    //jkSiswa
    public void insertjkSiswa(Boolean isi){
        this.jkSiswa.add(isi);
    }
    
    public ArrayList<Boolean> getRecordjkSiswa(){
        return this.jkSiswa;
    }
    
    //tlSiswa
    public void inserttlSiswa(String isi){
        this.tlSiswa.add(isi);
    }
    
    public ArrayList<String> getRecordtlSiswa(){
        return this.tlSiswa;
    }
    
    //tgllSiswa
    public void inserttgllSiswa(String isi){
        this.tgllSiswa.add(isi);
    }
    
    public ArrayList<String> getRecordtgllSiswa(){
        return this.tgllSiswa;
    }
    
    //AlamatSiswa
    public void insertAlamatSiswa(String isi){
        this.AlamatSiswa.add(isi);
    }
    
    public ArrayList<String> getRecordAlamatSiswa(){
        return this.AlamatSiswa;
    }
    
}
