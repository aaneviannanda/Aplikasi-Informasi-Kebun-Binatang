/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataWahana;

/**
 *
 * @author ASUS
 */
public class DataWahana {
    private int IDWahana;
    private String Nama_Wahana, Jenis_Wahana, Tahun_Pembelian, Tanggal_Maintenance;

    public DataWahana(int IDWahana, String Nama, String Jenis,String TahunPembelian, String TanggalMaintenance){
        this.IDWahana=IDWahana;
        this.Nama_Wahana=Nama;
        this.Jenis_Wahana =Jenis;
        this.Tahun_Pembelian =TahunPembelian;
        this.Tanggal_Maintenance =TanggalMaintenance;
    }

    public int getIDWahana()
    {
        return this.IDWahana;
    }

    public String getNama()
    {
        return this.Nama_Wahana;
    }

    public String getJenis()
    {
        return this.Jenis_Wahana;
    }

    public String getTanggal_Maintenance() {
        return Tanggal_Maintenance;
    }

    public String getTahun_Pembelian() {
        return Tahun_Pembelian;
    }
}
