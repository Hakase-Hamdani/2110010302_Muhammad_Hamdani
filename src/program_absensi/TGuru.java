/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package program_absensi;

/**
 *
 * @author Administrator 10
 */
public class TGuru {
    
    private int IdGuru;
    private int IdTWaliKelas;
    private String NamaGuru;
    private String MpGuru;
    private String AlamatGuru;
	
	/*
	this.IdGuru = IdGuru; //jelas
    this.idTGuru = idTGuru; //jelas
    this.wktAbsen = wktAbsen; //jenis kelamin
    this.ketAbsensi = ketAbsensi; //tempat lahir
   */
    
    public TGuru(int IdGuru, int IdTWaliKelas, String NamaGuru, String MpGuru, String AlamatGuru){
        this.IdGuru = IdGuru; 
        this.IdTWaliKelas= IdTWaliKelas;
        this.NamaGuru = NamaGuru;
        this.MpGuru = MpGuru;
        this.AlamatGuru = AlamatGuru;
    }
    
    public int getIdGuru(){
        return IdGuru;
    }
    
    public void setIdGuru(int IdGuru){
        this.IdGuru = IdGuru;
    }
    
    public int getIdTWaliKelas(){
        return IdTWaliKelas;
    }
    
    public void setIdTWaliKelas(int IdTWaliKelas){
        this.IdTWaliKelas = IdTWaliKelas;
    }
    
    public String getNamaGuru(){
        return NamaGuru;
    }
    
    public void setNamaGuru(String NamaGuru){
        this.NamaGuru = NamaGuru;
    }
    
    public String getMpGuru(){
        return MpGuru;
    }
    
    public void setMpGuru(String MpGuru){
        this.MpGuru = MpGuru;
    }
    
    public String getAlamatGuru(){
        return AlamatGuru;
    }
    
    public void setAlamatGuru(String AlamatGuru){
        this.AlamatGuru = AlamatGuru;
    }
    
    
    public void displayTGuru(){
        System.out.println("Wali Kelas" + IdTWaliKelas);
        System.out.println("Nama" + NamaGuru);
        System.out.println("Mata Pelajaran" + MpGuru);
        System.out.println("Keterangan Absen" + AlamatGuru);
    }
    
}
