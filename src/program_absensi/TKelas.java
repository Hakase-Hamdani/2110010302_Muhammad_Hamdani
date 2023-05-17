/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package program_absensi;

/**
 *
 * @author Administrator 10
 */
public class TKelas {
    private int IdKelas;
    private int IdTWaliKelas;
    private int IdTSiswa;
    private String NamaKelas;
    
    public TKelas(int IdKelas, int IdTWaliKelas, int IdTSiswa, String NamaKelas){
        this.IdKelas = IdKelas;
        this.IdTWaliKelas = IdTWaliKelas;
        this.IdTSiswa = IdTSiswa;
        this.NamaKelas = NamaKelas;
    }
    
    public int setIdKelas(){
        return IdKelas;
    }
    
    public void getIdKelas(int IdKelas){
        this.IdKelas = IdKelas;
    }
    
    public int setIdTWaliKelas(){
        return IdTWaliKelas;
    }
    
    public void getIdTWaliKelas(int IdTWaliKelas){
        this.IdTWaliKelas = IdTWaliKelas;
    }
    
    public int setIdTSiswa(){
        return IdTSiswa;
    }
    
    public void getIdTSiswa(int IdTSiswa){
        this.IdTSiswa = IdTSiswa;
    }
    
    public String setNamaKelas(){
        return NamaKelas;
    }
    
    public void getNamaKelas(String NamaKelas){
        this.NamaKelas = NamaKelas;
    }
    
    public void displayTKelas(){
        System.out.println("Nama Kelas" + NamaKelas);
        System.out.println("Wali Kelas" + IdTWaliKelas);
        System.out.println("Siswa" + IdTSiswa);
    }
    
}
