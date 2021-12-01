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
public class AbsensiKeluar extends AbsensiMasuk {
    //Inisialisasi tipe data dan variabel
    public String JamKeluar;
    //Kontruktor
    public AbsensiKeluar(int id, String nama, String jbt, String TglM, String JamM, String JamK) {
        super (id, nama, jbt, TglM, JamM);
        this.JamKeluar = JamK;
    }
    
    public String GetJamKeluar()
    {
        return this.JamKeluar;
    }
}
