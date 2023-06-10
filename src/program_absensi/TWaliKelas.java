/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package program_absensi;

/**
 *
 * @author Administrator 10
 */
public class TWaliKelas {
    private int IdWaliKelas;
    private String NamaWaliKelas;
    private int IdTGuru;
//    private String KelasWaliKelas;
//    private String AlamatWaliKelas;
    
    public TWaliKelas(int IdWaliKelas, String NamaWaliKelas, int IdTGuru, String KelasWaliKelas, String AlamatWaliKelas){
        this.IdWaliKelas = IdWaliKelas; 
        this.NamaWaliKelas = NamaWaliKelas;
        this.IdTGuru = IdTGuru;
//        this.KelasWaliKelas = KelasWaliKelas;
//        this.AlamatWaliKelas = AlamatWaliKelas;
    }
    
    public int getIdWaliKelas(){
        return IdWaliKelas;
    }
    
    public void setIdWaliKelas(int IdWaliKelas){
        this.IdWaliKelas = IdWaliKelas;
    }
    
    public String getNamaWaliKelas(){
        return NamaWaliKelas;
    }
    
    public void setNamaWaliKelas(String NamaWaliKelas){
        this.NamaWaliKelas = NamaWaliKelas;
    }
    
    public int getIdTGuru(){
        return IdTGuru;
    }
    
    public void setIdTGuru(int IdTGuru){
        this.IdTGuru = IdTGuru;
    }
/*    
    public String getKelasWaliKelas(){
        return KelasWaliKelas;
    }
    
    public void setKelasWaliKelas(String KelasWaliKelas){
        this.KelasWaliKelas = KelasWaliKelas;
    }
    
    public String getAlamatWaliKelas(){
        return AlamatWaliKelas;
    }
    
    public void setAlamatWaliKelas(String AlamatWaliKelas){
        this.AlamatWaliKelas = AlamatWaliKelas;
    }
*/
    
    public void displayTWaliKelas(){
        System.out.println("Nama" + NamaWaliKelas);
//        System.out.println("Kelas" + KelasWaliKelas);
//        System.out.println("Alamat" + KelasWaliKelas);
    }    
}
