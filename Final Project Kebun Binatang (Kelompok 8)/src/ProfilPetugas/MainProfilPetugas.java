/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProfilPetugas;

import java.io.IOException;
import java.util.Scanner;
import sistem.pengelolaan.data.kebun.binatang.MainMenu;

/**
 *
 * @author ASUS
 */
public class MainProfilPetugas {
    public void MainProfilPetugas () throws IOException  {
        Scanner Scan = new Scanner(System.in);
        //
        System.out.println("");
        System.out.println("\t MENU PENGOLAHAN DATA PETUGAS");
        System.out.println("1. Profil Petugas");
        System.out.println("2. Absensi");
        System.out.println("3. Kembali Ke Menu Utama");
        System.out.println("4. Exit");
        System.out.print("Masukkan Pilihan Anda : ");
        int menu = Scan.nextInt();
        switch (menu) {
            case 1 :
                PengolahanDataProfilPetugas olahdata = new PengolahanDataProfilPetugas();
                olahdata.menupengolahandata();
                break;
            case 2 :
                PengolahanDataAbsensi olahabsen = new PengolahanDataAbsensi();
                olahabsen.menupengolahanabsen();
                break;
            case 3 :
                MainMenu Balik = new MainMenu();
                Balik.MainMenu();
                break;
            case 4 :
                System.exit(0);
                break;
            default :
               System.err.println("Mohon Masukan Pilihan Dengan Benar!");
        }
    }
}
