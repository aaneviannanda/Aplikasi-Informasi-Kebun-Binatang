/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataPengunjung;

/**
 *
 * @author ASUS
 */
public class Pengunjung {
    private long NIK_Pengunjung;
    private String Tanggal_Berkunjung, Nama_Pengunjung, Asal_Pengunjung;

    public Pengunjung(long nik, String Nama, String asal, String tanggal)
    {
        this.NIK_Pengunjung =nik;
        this.Tanggal_Berkunjung =tanggal;
        this.Nama_Pengunjung =Nama;
        this.Asal_Pengunjung =asal;
    }

    public long getNIK_Pengunjung() {
        return NIK_Pengunjung;
    }

    public String getNama_Pengunjung() {
        return Nama_Pengunjung;
    }

    public String getAsal_Pengunjung() {
        return Asal_Pengunjung;
    }

    public String getTanggal_Berkunjung() {
        return Tanggal_Berkunjung;
    }
}
