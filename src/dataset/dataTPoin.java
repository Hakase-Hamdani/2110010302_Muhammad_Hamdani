package dataset;
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hakase
 */
public class dataTPoin {
    private ArrayList<Integer> IdPoin;
    private ArrayList<String> IdTSiswa;
    private ArrayList<Integer> IdTGuru;
    private ArrayList<Integer> JmlPoin;
    private ArrayList<Boolean> JnsPoin;
    private ArrayList<String> KetPoin;
    
    public dataTPoin(){
        IdPoin = new ArrayList<Integer>();
        IdTSiswa = new ArrayList<>();
        IdTGuru = new ArrayList<Integer>();
        JmlPoin = new ArrayList<Integer>();
        JnsPoin = new ArrayList<Boolean>();
        KetPoin = new ArrayList<String>();
    }
    
    //idPoin
    public void insertIdPoin(Integer isi){
        this.IdPoin.add(isi);
    }
    
    public ArrayList<Integer> getRecordIdPoin(){
        return this.IdPoin;
    }
    
    //IdTSiswa
    public void insertIdTSiswa(String isi){
        this.IdTSiswa.add(isi);
    }
    
    public ArrayList<String> getRecordIdTSiswa(){
        return this.IdTSiswa;
    }
    
    //IdTGuru
    public void insertIdTGuru(Integer isi){
        this.IdTGuru.add(isi);
    }
    
    public ArrayList<Integer> getRecordIdTGuru(){
        return this.IdTGuru;
    }
    
    //JmlPoin
    public void insertJmlPoin(Integer isi){
        this.JmlPoin.add(isi);
    }
    
    public ArrayList<Integer> getRecordJmlPoin(){
        return this.JmlPoin;
    }
    
    //JnsPoin
    public void insertJnsPoin(Boolean isi){
        this.JnsPoin.add(isi);
    }
    
    public ArrayList<Boolean> getRecordJnsPoin(){
        return this.JnsPoin;
    }
    
    //KetPoin
    public void insertKetPoin(String isi){
        this.KetPoin.add(isi);
    }
    
    public ArrayList<String> getRecordKetPoin(){
        return this.KetPoin;
    }
}

