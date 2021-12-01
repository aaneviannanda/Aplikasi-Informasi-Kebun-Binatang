/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProfilPetugas;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class PengolahanDataProfilPetugas {
    //Inisialisasi Objek Buffer Reader
    InputStreamReader input_user = new InputStreamReader(System.in);
    BufferedReader input_buffer = new BufferedReader(input_user);
    //Inisialisasi Object Scanner
    Scanner input = new Scanner(System.in);
    //Fungsi tambah data profil petugas
    public void InputDataPetugas() throws IOException{
        System.out.println("");
        System.out.println("\t ~ MENU TAMBAH DATA PETUGAS ~");
        System.out.print("Masukan id Petugas   : ");
        int id = input.nextInt();
        System.out.print("Masukan Nama Petugas : ");
        String nama = input_buffer.readLine();
        System.out.print("Masukan Jabatan      : ");
        String jbt = input_buffer.readLine();
        //Pengecekan Id petugas
        for (ProfilPetugas cek : Inisialisasi.ArrProfilPetugas)
        {
            if (cek.GetId()==id)
            {
                System.out.println("\n Id Petugas Telah Digunakan!");
                menupengolahandata();
            }
        }
        ProfilPetugas databaru = new ProfilPetugas(id,nama,jbt);
        Inisialisasi.ArrProfilPetugas.add(databaru);
        System.out.println("\nData Berhasil Di Tambahkan!");
    }
    //Fungsi tampil data profil petugas
    public void TampilDataPetugas(){
        System.out.println("");
        System.out.println("\t ~ MENU TAMPIL DATA PETUGAS ~");
        for (ProfilPetugas profilPetugas : Inisialisasi.ArrProfilPetugas)
        {
            System.out.println("Id Petugas   : "+profilPetugas.GetId()+"\nNama Petugas : "+profilPetugas.GetNama()+"\nJabatan      : "+profilPetugas.GetJabatan());
            System.out.println("=================================");
        }
    }
    //Fungsi ubah data profil petugas
    public void UpdateDataPetugas() throws IOException{
        System.out.println("");
        System.out.println("\t ~ MENU UBAH DATA PETUGAS ~");
        if (Inisialisasi.ArrProfilPetugas.size()<1)
        {
            System.out.print("Data Tidak Ada!");                     
        }
        else
        { 
            System.out.print("Masukan Id data yang akan diubah : ");
            int cari = input.nextInt();
            for (int i=0; i<Inisialisasi.ArrProfilPetugas.size(); i++)
            {
                if (cari == Inisialisasi.ArrProfilPetugas.get(i).GetId())
                {
                    //Inputan data baru
                    System.out.print("Masukan id Baru      : ");
                    int idbaru = input.nextInt();
                    System.out.print("Masukan Nama Baru    : ");
                    String namabaru = input_buffer.readLine();
                    System.out.print("Masukan Jabatan Baru : ");
                    String jbtbaru = input_buffer.readLine();
                    //Pengecekan Id petugas
                    for (ProfilPetugas cek : Inisialisasi.ArrProfilPetugas)
                    {
                        if (cek.GetId()==idbaru && cek.GetId()!= cari)
                        {
                            System.out.println("\n Id Petugas Telah Digunakan!");
                            menupengolahandata();
                        }
                    }
                    //Menyimpan data baru ke ArrSimpan
                    ProfilPetugas UpdateProfil = new ProfilPetugas (idbaru,namabaru,jbtbaru);
                    Inisialisasi.ArrProfilPetugas.set(i, UpdateProfil);
                    System.out.println("\nData Berhasil Di Ubah!");
                }
            }
        }
    }
    //Fungsi ubah data profil petugas
    public void DeleteDataPetugas(){
        System.out.println("");
        System.out.println("\t ~ MENU HAPUS DATA PETUGAS ~");
        System.out.print("Masukan Id data yang akan dihapus : ");
        int cari = input.nextInt();
        for (int i=0; i<Inisialisasi.ArrProfilPetugas.size(); i++)
        {
            if (cari == Inisialisasi.ArrProfilPetugas.get(i).GetId())
            {
                Inisialisasi.ArrProfilPetugas.remove(i);
                System.out.println("\nData Berhasil Di Hapus!");
            }
            else
            {
            System.out.println("Mohon Maaf Id tidak ditemukan!");
            }
        }
    }
    //Menu pengolahan data petugas
    public void menupengolahandata() throws IOException
    {   
        //Tampilan menu pengolahan data profil petugas
        int menu = 0;
        while (menu != 7)
        {
            System.out.print("\n\n\t ~SUB MENU PROFIL PETUGAS~ \n1.Input data Petugas\n2.Lihat Data Petugas\n3.Update Data Petugas\n4.Delete Data Petugas\n5.Kembali ke Menu Data Petugas\n6.Exit\nMasukan pilihan anda : ");
            menu = input.nextInt();
            switch (menu) 
            {
                case 1:
                    InputDataPetugas();
                    break;
                case 2:
                    TampilDataPetugas();
                    break;
                case 3:
                    UpdateDataPetugas();
                    break;
                case 4:
                    DeleteDataPetugas();
                    break;
                case 5:
                    MainProfilPetugas ButtonMainMenu = new MainProfilPetugas();
                    ButtonMainMenu.MainProfilPetugas();
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    new PengolahanDataProfilPetugas();
            }
        }   
    }
}
