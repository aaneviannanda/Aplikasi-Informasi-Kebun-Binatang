/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistem.pengelolaan.data.kebun.binatang;

import Animalia.mainAnimalia;
import DataPengunjung.PengolahanDataPengunjung;
import DataWahana.PengolahanDataWahana;
import ProfilPetugas.MainProfilPetugas;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class MainMenu {

    /**
     * @throws IOException
     */
    public void MainMenu() throws IOException {
        //Inisialisasi Objek Scanner
        Scanner Scan = new Scanner(System.in);
        //Menu Utama Program Pengolahan Data Kebun Binatang
        int menu = 0;
        while (menu != 6)
        {
            System.out.println("\n\t -MENU UTAMA-");
            System.out.println("1. Pengolahan Data Petugas");
            System.out.println("2. Pengolahan Data Pengunjung");
            System.out.println("3. Pengolahan Data Wahana");
            System.out.println("4. Pengolahan Data Kebun Binatang");
            System.out.println("5. Exit");
            System.out.print("Masukkan Pilihan Anda : ");
            menu = Scan.nextInt();
            switch (menu) {
                case 1 :
                    MainProfilPetugas olahpetugas = new MainProfilPetugas();
                    olahpetugas.MainProfilPetugas();
                    break;
                case 2 :
                    PengolahanDataPengunjung olahdata = new PengolahanDataPengunjung();
                    olahdata.menupengolahandatapengunjung();
                    break;
                case 3 :
                    PengolahanDataWahana pengolahanDataWahana = new PengolahanDataWahana();
                    try {
                        pengolahanDataWahana.menupengolahandata();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case 4 :
                    mainAnimalia MA = new mainAnimalia();
                    MA.menuZOO();
                    break;
                case 5 :
                    System.exit(0);
                    break;
                default:
                    System.err.println("Mohon Masukan Pilihan Dengan Benar!");
            }
        }
    } 
}
