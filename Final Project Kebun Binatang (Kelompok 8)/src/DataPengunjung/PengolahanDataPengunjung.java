/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataPengunjung;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import sistem.pengelolaan.data.kebun.binatang.MainMenu;

/**
 *
 * @author ASUS
 */
public class PengolahanDataPengunjung {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static ArrayList<Pengunjung> april = new ArrayList<>();

    public void menupengolahandatapengunjung() throws IOException{
        Scanner scan = new Scanner(System.in);
        int menu=0;
        while (menu!=5)
        {
            System.out.println("\n\t ~MENU PENGOLAHAN DATA PENGUNJUNG~");
            System.out.println("1. Tambah Data Pengunjung");
            System.out.println("2. Lihat Data Pengunjung");
            System.out.println("3. Kembali Ke Main Menu");
            System.out.println("4. Exit");
            System.out.print("Masukkan Pilihan Anda : ");
            menu = scan.nextInt();
            switch (menu)
            {
                case 1 :
                    try {
                        writeCsv();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case 2 :
                    ReadCsv();
                    break;
                case 3 :
                    MainMenu Balik = new MainMenu();
                    Balik.MainMenu();
                case 4 :
                    System.exit(0);
                    break;
                default:
                    new PengolahanDataPengunjung();
            }
        }
    }

    public static void writeCsv() throws IOException {
        FileWriter fileWriter = new FileWriter("pengunjung.csv",true);
        Scanner scan = new Scanner(System.in);
        System.out.println("\n\t ~Penambahan Data Pengunjung~");
        System.out.print("Masukkan NIK      : ");
        long NIK = scan.nextLong();
        System.out.print("Masukkan Nama     : ");
        String Nama = scan.next();
        System.out.print("Masukkan Asal     : ");
        String Asal = scan.next();
        System.out.print("Masukkan Tanggal  : ");
        String Tanggal = scan.next();

        Pengunjung pengunjung = new Pengunjung(NIK,Nama,Asal,Tanggal);
        april.add(pengunjung);

        try {
            fileWriter.append(String.valueOf(pengunjung.getNIK_Pengunjung()));
            fileWriter.append(", ");
            fileWriter.append(pengunjung.getNama_Pengunjung());
            fileWriter.append(", ");
            fileWriter.append(pengunjung.getAsal_Pengunjung());
            fileWriter.append(", ");
            fileWriter.append(pengunjung.getTanggal_Berkunjung());
            fileWriter.append("\n");
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            try {
                fileWriter.flush();
                fileWriter.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println(ANSI_CYAN+"\nData Pengunjung Berhasil Ditambahkan"+ANSI_RESET);
    }

    public static void ReadCsv()
    {
        String file = "pengunjung.csv";
        BufferedReader reader = null;
        String line = "";
        System.out.println("\nData Pengunjung :");

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
}
