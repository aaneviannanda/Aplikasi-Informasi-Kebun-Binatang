/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProfilPetugas;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class PengolahanDataAbsensi {
    //Inisialisasi Objek Buffer Reader
    InputStreamReader input_user = new InputStreamReader(System.in);
    BufferedReader input_buffer = new BufferedReader(input_user);
    //Inisialisasi Objek SCanner
    Scanner input = new Scanner(System.in);
    //Inisialisasi Objek ArrayList
    static ArrayList<AbsensiMasuk> AbsenIn = new ArrayList<>();
    static ArrayList<AbsensiKeluar> AbsenOut = new ArrayList<>();
    //Inisialisasi Objek Array
    static AbsensiMasuk [] AddAbsenIn = new AbsensiMasuk [100];
    static AbsensiMasuk [] AddAbsenOut = new AbsensiMasuk [100];
    //Fungsi tambah data absensi in
    public void InputAbsensiIn() throws IOException{
        System.out.println("");
        System.out.println("Data Profil Petugas");
        for (ProfilPetugas profilPetugas : Inisialisasi.ArrProfilPetugas)
        {
            System.out.println("Id Petugas   : "+profilPetugas.GetId()+"\nNama Petugas : "+profilPetugas.GetNama()+"\nJabatan      : "+profilPetugas.GetJabatan());
            System.out.println("=================================");
        }
        System.out.println("\t ~ MENU TAMBAH DATA ABSENSI IN ~");
        int cari;
        String tglM,jamM;
        if(Inisialisasi.ArrProfilPetugas.size() > 0){
            System.out.print("Masukan Id Petugas yang ingin ditambahkan : ");
            cari = input.nextInt();
            for (int i=0; i<Inisialisasi.ArrProfilPetugas.size(); i++){
                if (cari == Inisialisasi.ArrProfilPetugas.get(i).GetId()){
                    System.out.println("\t ~Masukan Data Absensi In~\n");
                    System.out.println("Id Petugas            : "+Inisialisasi.ArrProfilPetugas.get(i).GetId()+"\nNama Petugas          : "+Inisialisasi.ArrProfilPetugas.get(i).GetNama()+"\nJabatan               : "+Inisialisasi.ArrProfilPetugas.get(i).GetJabatan());
                    System.out.print("Masukan Tanggal Masuk : ");
                    tglM = input_buffer.readLine();
                    System.out.print("Masukan Waktu Masuk   : ");
                    jamM = input_buffer.readLine();
                    AddAbsenIn[dataIn] = new AbsensiMasuk(Inisialisasi.ArrProfilPetugas.get(i).GetId(), Inisialisasi.ArrProfilPetugas.get(i).GetNama(),Inisialisasi.ArrProfilPetugas.get(i).GetJabatan(), tglM, jamM);
                    AbsenIn.add(AddAbsenIn[dataIn]);
                    dataIn ++;
                    System.out.println("\nData Berhasil Di Tambahkan!");
                }
            }
        }
        else
        {
            System.out.println("Belum ada data Profil Petugas!\n");
        }
    }
    //Fungsi tambah data absensi out
    public void InputAbsensiOut() throws IOException{
        System.out.println("");
        System.out.println("Data Profil Petugas");
        for (ProfilPetugas profilPetugas : Inisialisasi.ArrProfilPetugas)
        {
            System.out.println("Id Petugas   : "+profilPetugas.GetId()+"\nNama Petugas : "+profilPetugas.GetNama()+"\nJabatan      : "+profilPetugas.GetJabatan());
            System.out.println("=================================");
        }
        System.out.println("\t ~ MENU TAMBAH DATA ABSENSI OUT ~");
        int cari1;
        String jamK;
        if(AbsenIn.size() > 0){
            System.out.print("Masukan Id Petugas yang ingin ditambahkan : ");
            cari1 = input.nextInt();
            for (int i=0; i<AbsenIn.size(); i++){
                if (cari1 == AbsenIn.get(i).GetId()){
                    System.out.println("\t ~Masukan Data Absensi Out~\n");
                    System.out.println("Id Petugas             : "+AbsenIn.get(i).GetId()+"\nNama Petugas           : "+AbsenIn.get(i).GetNama()+"\nJabatan                : "+AbsenIn.get(i).GetJabatan());
                    System.out.println("Masukan Tanggal Masuk  : "+AbsenIn.get(i).GetTglMasuk());
                    System.out.println("Masukan Waktu Masuk    : "+AbsenIn.get(i).GetJamMasuk());
                    System.out.print("Masukan Waktu Keluar   : ");
                    jamK = input_buffer.readLine();
                    AddAbsenOut [dataOut] = new AbsensiKeluar(AbsenIn.get(i).GetId(), AbsenIn.get(i).GetNama(), AbsenIn.get(i).GetJabatan(), AbsenIn.get(i).TanggalMasuk, AbsenIn.get(i).JamMasuk, jamK);
                    AbsenOut.add((AbsensiKeluar) AddAbsenOut[dataOut]);
                    dataOut ++;
                    System.out.println("\nData Berhasil Di Tambahkan!");
                    AbsenIn.remove(i);
                    dataIn --;
                }
            }
        }
        else
        {
            System.out.println("Belum ada data Absensi In!\n");
        }
    }
    //Fungsi lihat petugas yang sedang bekerja
    public void LihatPetugasBekerja(){
        System.out.println("");
        System.out.println("\t ~ MENU LIHAT PETUGAS YANG SEDANG BEKERJA ~");
        if (AbsenIn.size()<1)
        {
            System.out.print("Data Tidak Ada!");
        }
        else
        {
            for ( dataIn = 0; dataIn < AbsenIn.size(); dataIn++)
            {
                System.out.println("Data ke-"+dataIn);
                System.out.println("Id Petugas    : "+AbsenIn.get(dataIn).GetId()+"\nNama Petugas  : "+AbsenIn.get(dataIn).GetNama()+"\nJabatan       : "+AbsenIn.get(dataIn).GetJabatan());
                System.out.println("Tanggal Masuk : "+AbsenIn.get(dataIn).GetTglMasuk());
                System.out.println("Jam Masuk     : "+AbsenIn.get(dataIn).GetJamMasuk());
                System.out.println("=================================");
            }
        }
    }
    //Fungsi lihat track record absensi
    public void LihatTrackRecordAbsensi(){
        System.out.println("");
        System.out.println("\t ~ MENU TRACK RECORD ABSENSI ~");
        if (AbsenOut.size()<1)
        {
            System.out.print("Data Tidak Ada!");
        }
        else
        {
            for ( dataOut = 0; dataOut < AbsenOut.size(); dataOut++)
            {
                System.out.println("Data ke-"+dataOut);
                System.out.println("Id Petugas    : "+AbsenOut.get(dataOut).GetId()+"\nNama Petugas  : "+AbsenOut.get(dataOut).GetNama()+"\nJabatan       : "+AbsenOut.get(dataOut).GetJabatan());
                System.out.println("Tanggal Masuk : "+AbsenOut.get(dataOut).GetTglMasuk());
                System.out.println("Jam Masuk     : "+AbsenOut.get(dataOut).GetJamMasuk());
                System.out.println("Jam Keluar    : "+AbsenOut.get(dataOut).GetJamKeluar());
                System.out.println("=================================");
            }
        }
    }
    //Menu pengolahan data absensi
    int dataIn=0, dataOut=0;
    public void menupengolahanabsen() throws IOException{
        int menu = 0;
        while (menu != 7)
        {
            System.out.print("\n\n\t ~SUB MENU ABSENSI PETUGAS~ \n1.Input data Absensi In\n2.Input Data Absensi Out\n3.Lihat Petugas Yang Sedang Bekerja\n4.Track Record Absensi\n5.Kembali Ke Menu Data Petugas\n6.Exit\nMasukan pilihan anda : ");
            menu = input.nextInt();
            switch (menu) 
            {
                case 1:
                    InputAbsensiIn();
                    break;
                case 2:
                    InputAbsensiOut();
                    break;
                case 3:
                    LihatPetugasBekerja();
                    break;
                case 4:
                    LihatTrackRecordAbsensi();
                    break;
                case 5:
                    MainProfilPetugas ButtonMainMenu = new MainProfilPetugas();
                    ButtonMainMenu.MainProfilPetugas();
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    new PengolahanDataAbsensi();
            }
        }
    }
}
