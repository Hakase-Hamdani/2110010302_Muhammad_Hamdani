/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package program_absensi;

/**
 *
 * @author Administrator 10
 */
public class TPoin {
    private int IdPoin;
    private int IdTSiswa;
    private int IdTGuru;
    private int JmlPoin;
    private String KetPoin;
    
    public TPoin(int IdPoin, int IdTSiswa, int IdTGuru, int JmlPoin, String KetPoin){
        this.IdPoin = IdPoin; 
        this.IdTSiswa = IdTSiswa;
        this.IdTGuru = IdTGuru;
        this.JmlPoin = JmlPoin;
        this.KetPoin = KetPoin;
    }
    
    //set get InPoin
    public int getIdPoin(){
        return IdPoin;
    }
    
    public void setIdPoin(int IdPoin){
        this.IdPoin = IdPoin;
    }
    
    //set get IdTSiswa
    public int getIdTsiswa(){
        return IdTSiswa;
    }
    
    public void setIdTSiswa(int IdTSiswa){
        this.IdTSiswa = IdTSiswa;
    }
    
    //get set IdTGuru
    public int getIdTGuru(){
        return IdTGuru;
    }
    
    public void setIdTGuru(int IdTGuru){
        this.IdTGuru = IdTGuru;
    }
    
    public int getJmlPoin(){
        return JmlPoin;
    }
    
    public void setJmlPoin(int JmlPoin){
        this.JmlPoin = JmlPoin;
    }
    
    //get set KetPoin
    public String getKetPoin(){
        return KetPoin;
    }
    
    public void setKetPoin(String KetPoin){
        this.KetPoin = KetPoin;
    }
    
    
    public void displayTGuru(){
        System.out.println("Nama Siswa" + IdTSiswa);
        System.out.println("Nama Guru" + IdTGuru);
        System.out.println("Jumlah Poin" + JmlPoin);
        System.out.println("Keterangan" + KetPoin);

    }  
}
