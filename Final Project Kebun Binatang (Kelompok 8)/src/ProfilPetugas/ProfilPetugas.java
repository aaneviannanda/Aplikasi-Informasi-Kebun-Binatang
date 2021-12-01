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
public class ProfilPetugas {
    //Inisialisasi tipe data dan variabel
    private int id_petugas;
    private String nama_petugas, jabatan;
    //Kontruktor
    public ProfilPetugas(int id, String nama, String jbt){
        this.id_petugas = id;
        this.nama_petugas = nama;
        this.jabatan = jbt;
    }

    public int GetId()
    {
        return this.id_petugas;
    }
    public String GetNama()
    {
        return this.nama_petugas;    
    }
    public String GetJabatan()
    {
        return this.jabatan;    
    }
}
