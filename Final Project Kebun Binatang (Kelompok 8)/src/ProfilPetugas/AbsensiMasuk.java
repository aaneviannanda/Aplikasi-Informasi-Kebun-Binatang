/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProfilPetugas;

/**
 *
 * @author ASUS
 */
public class AbsensiMasuk extends ProfilPetugas{
     //Inisialisasi tipe data dan variabel
    public String TanggalMasuk,JamMasuk;
    //Kontruktor

    public AbsensiMasuk(int id, String nama, String jbt, String TglM, String JamM) {
        super(id, nama, jbt);
        this.TanggalMasuk = TglM;
        this.JamMasuk = JamM;
    }
    
    public String GetTglMasuk()
    {
        return this.TanggalMasuk;
    }
    public String GetJamMasuk()
    {
        return this.JamMasuk;
    }
}
