/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataWahana;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import sistem.pengelolaan.data.kebun.binatang.MainMenu;

/**
 *
 * @author ASUS
 */
public class PengolahanDataWahana {
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_CYAN = "\u001B[36m";
    Scanner scan = new Scanner(System.in).useDelimiter("\n");
    int menu=0,cari;
    int Id;
    String Nama,Jenis,TahunPembelian,TanggalMaintenence;

    public void TambahDataWahana()throws IOException
    {
        System.out.println("\n\t ~Menu Tambah Data Wahana~");
        System.out.print("Masukkan Id Wahana                    : ");
        Id = scan.nextInt();
        System.out.print("Masukkan Nama Wahana                  : ");
        Nama = scan.next();
        System.out.print("Masukkan Jenis Wahana                 : ");
        Jenis = scan.next();
        System.out.print("Masukkan Tahun Pembelian              : ");
        TahunPembelian = scan.next();
        System.out.print("Masukkan Tanggal Terakhir Maintenance : ");
        TanggalMaintenence = scan.next();

        for (DataWahana cek : InisialisasiWahana.listdatawahana)
        {
            if (cek.getIDWahana()==Id)
            {
                System.out.println(ANSI_RED + "\n Id  Wahana Telah Digunakan" + ANSI_RESET);
                menupengolahandata();
            }
        }

        DataWahana WahanaBaru = new DataWahana(Id,Nama,Jenis,TahunPembelian,TanggalMaintenence);
        InisialisasiWahana.listdatawahana.add(WahanaBaru);
        FileWriter fileWriter = new FileWriter("wahana.csv",true);
        try {
            fileWriter.append(String.valueOf(WahanaBaru.getIDWahana()));
            fileWriter.append(", ");
            fileWriter.append(WahanaBaru.getNama());
            fileWriter.append(", ");
            fileWriter.append(WahanaBaru.getJenis());
            fileWriter.append(", ");
            fileWriter.append(WahanaBaru.getTahun_Pembelian());
            fileWriter.append(", ");
            fileWriter.append(WahanaBaru.getTanggal_Maintenance());
            fileWriter.append(", ");
            fileWriter.append("\n");
        }catch (Exception e){
            e.printStackTrace();
        }
        finally {
            try {
                fileWriter.flush();
                fileWriter.close();
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }
        System.out.println(ANSI_CYAN + "\n Data Berhasil Dimasukkan" + ANSI_RESET);
    }

    public void LihatDataWahana(){
        System.out.println("\n\t ~Display Data Wahana Yang Ada~");
        String file = "wahana.csv";
        BufferedReader reader = null;
        String line = "";
        System.out.println("\nData Wahana :");

        try {
            reader = new BufferedReader(new FileReader(file));
            while ((line = reader.readLine()) != null) {

                String[] row = line.split(",");
                for (String index : row) {
                    System.out.printf("%-20s", index);
                }
                System.out.println();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }

    public void CariDataWahana()throws IOException
    {
        System.out.println("\n\t ~Menu Cari Data Wahana~ ");
        System.out.print("Masukkan ID Wahana yang ingin dicari : ");
        cari = scan.nextInt();
        for (DataWahana dataWahana : InisialisasiWahana.listdatawahana)
        {
            if (cari == dataWahana.getIDWahana())
            {
                System.out.println(ANSI_CYAN+"\nData Ditemukan !!!!"+ANSI_RESET);
                System.out.println("Data Wahana dengan id "+cari+" Adalah");
                System.out.println("Id Wahana            : "+dataWahana.getIDWahana());
                System.out.println("Nama Wahana          : "+dataWahana.getNama());
                System.out.println("Jenis Wahana         : "+dataWahana.getJenis());
                System.out.println("Tahun Pembelian      : "+dataWahana.getTahun_Pembelian());
                System.out.println("Terakhir Maintenance : "+dataWahana.getTanggal_Maintenance());
                menupengolahandata();
            }
        }
        System.out.println(ANSI_RED+"Mohon maaf wahana dengan id "+cari+" tidak ditemukan"+ANSI_RESET);
    }

    public void UpdateDataWahana()throws IOException
    {
        System.out.println("\n\t ~Update Data Wahana~");
        System.out.print("Masukkan ID Wahana yang ingin diupdate : ");
        cari = scan.nextInt();
        for (int i=0; i<InisialisasiWahana.listdatawahana.size(); i++)
        {
            if (cari == InisialisasiWahana.listdatawahana.get(i).getIDWahana())
            {
                System.out.println("\nMenu Update Data Wahana");
                System.out.print("Update Id Wahana                    : ");
                Id = scan.nextInt();
                System.out.print("Update Nama Wahana                  : ");
                Nama = scan.next();
                System.out.print("Update Jenis Wahana                 : ");
                Jenis = scan.next();
                System.out.print("Update Tahun Pembelian              : ");
                TahunPembelian = scan.next();
                System.out.print("Update Tanggal Terakhir Maintenance : ");
                TanggalMaintenence = scan.next();

                for (DataWahana cek : InisialisasiWahana.listdatawahana)
                {
                    if (cek.getIDWahana()==Id && cek.getIDWahana()!=cari)
                    {
                        System.out.println(ANSI_RED + "\n Id  Wahana Telah Digunakan" + ANSI_RESET);
                        menupengolahandata();
                    }
                }

                DataWahana UpdateDataWahana = new DataWahana(Id,Nama,Jenis,TahunPembelian,TanggalMaintenence);
                InisialisasiWahana.listdatawahana.set(i,UpdateDataWahana);
                FileWriter fileWritera = null;
                try {
                    fileWritera = new FileWriter("wahana.csv");
                } catch (IOException e) {
                    e.printStackTrace();
                }
                try {
                    fileWritera.append("Id_Wahana");
                    fileWritera.append(", ");
                    fileWritera.append("Nama Wahana");
                    fileWritera.append(", ");
                    fileWritera.append("Kategori Wahana");
                    fileWritera.append(", ");
                    fileWritera.append("Tahun Pembelian");
                    fileWritera.append(", ");
                    fileWritera.append("Terakhir Maintenance");
                    fileWritera.append(", ");
                    fileWritera.append("\n");
                    for (DataWahana csvwahana : InisialisasiWahana.listdatawahana)
                    {
                        fileWritera.append(String.valueOf(csvwahana.getIDWahana()));
                        fileWritera.append(", ");
                        fileWritera.append(csvwahana.getNama());
                        fileWritera.append(", ");
                        fileWritera.append(csvwahana.getJenis());
                        fileWritera.append(", ");
                        fileWritera.append(csvwahana.getTahun_Pembelian());
                        fileWritera.append(", ");
                        fileWritera.append(csvwahana.getTanggal_Maintenance());
                        fileWritera.append(", ");
                        fileWritera.append("\n");
                    }
                }
                catch (Exception e){
                    e.printStackTrace();
                }
                finally {
                    try {
                        fileWritera.flush();
                        fileWritera.close();
                    }
                    catch (Exception e){
                        e.printStackTrace();
                    }
                }
                System.out.println(ANSI_CYAN+"\nData Berhasil Di Update"+ANSI_RESET);
                menupengolahandata();
            }
        }
        System.out.println(ANSI_RED+"\nMohon maaf wahana dengan id "+cari+" tidak ditemukan"+ANSI_RESET);
    }

    public void DeleteDataWahana()throws IOException{
        System.out.println("\n\t ~Hapus Data Wahana~");
        System.out.print("Masuk kan ID Wahana yang ingin dihapus : ");
        cari = scan.nextInt();
        for (int i=0; i<InisialisasiWahana.listdatawahana.size(); i++)
        {
            if (cari == InisialisasiWahana.listdatawahana.get(i).getIDWahana())
            {
                InisialisasiWahana.listdatawahana.remove(i);
                FileWriter fileWritera = null;
                try {
                    fileWritera = new FileWriter("wahana.csv");
                } catch (IOException e) {
                    e.printStackTrace();
                }
                try {
                    fileWritera.append("Id_Wahana");
                    fileWritera.append(", ");
                    fileWritera.append("Nama Wahana");
                    fileWritera.append(", ");
                    fileWritera.append("Kategori Wahana");
                    fileWritera.append(", ");
                    fileWritera.append("Tahun Pembelian");
                    fileWritera.append(", ");
                    fileWritera.append("Terakhir Maintenance");
                    fileWritera.append(", ");
                    fileWritera.append("\n");
                    for (DataWahana csvwahana : InisialisasiWahana.listdatawahana)
                    {
                        fileWritera.append(String.valueOf(csvwahana.getIDWahana()));
                        fileWritera.append(", ");
                        fileWritera.append(csvwahana.getNama());
                        fileWritera.append(", ");
                        fileWritera.append(csvwahana.getJenis());
                        fileWritera.append(", ");
                        fileWritera.append(csvwahana.getTahun_Pembelian());
                        fileWritera.append(", ");
                        fileWritera.append(csvwahana.getTanggal_Maintenance());
                        fileWritera.append(", ");
                        fileWritera.append("\n");
                    }
                }
                catch (Exception e){
                    e.printStackTrace();
                }
                finally {
                    try {
                        fileWritera.flush();
                        fileWritera.close();
                    }
                    catch (Exception e){
                        e.printStackTrace();
                    }
                }
                System.out.println(ANSI_CYAN+"Data Berhasil Di Delete"+ANSI_RESET);
                menupengolahandata();
            }
        }
        System.out.println(ANSI_RED+"Mohon maaf wahana dengan id "+cari+" tidak ditemukan"+ANSI_RESET);
    }

    public void menupengolahandata()throws IOException
    {

        while (menu!=8)
        {
            System.out.println("\n");
            System.out.println("\t ~MENU PENGOLAHAN DATA WAHANA~");
            System.out.println("1. Tambah Data Wahana");
            System.out.println("2. Lihat Data Wahana");
            System.out.println("3. Cari Data Wahana");
            System.out.println("4. Update Data Wahana");
            System.out.println("5. Delete Data Wahana");
            System.out.println("6. Kembali ke Main Menu");
            System.out.println("7. exit");
            System.out.print("Masukkan Pilihan Anda : ");
            menu = scan.nextInt();
            switch (menu){
                case 1 :
                    TambahDataWahana();
                    break;

                case 2 :
                    LihatDataWahana();
                    break;

                case 3 :
                    CariDataWahana();
                    break;

                case 4 :
                    UpdateDataWahana();
                    break;

                case 5 :
                    DeleteDataWahana();
                    break;

                case 6 :
                    MainMenu Balik = new MainMenu();
                    Balik.MainMenu();
                case 7 :
                    System.exit(0);
                    break;
                default:
                    new PengolahanDataWahana();
            }
        }
    }
}
