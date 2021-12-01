/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistem.pengelolaan.data.kebun.binatang;

import DataWahana.InisialisasiWahana;
import ProfilPetugas.Inisialisasi;
import java.io.IOException;

/**
 *
 * @author ASUS
 */
public class Main {
    /**
     * @param args the command line arguments
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        //Header
        System.out.println("\n");
        System.out.println("\t =========================================");
        System.out.println("\t =PROGRAM PENGELOLAAN DATA KEBUN BINATANG=");
        System.out.println("\t =========================================");
        System.out.println("1. Aan Evian Nanda (19081010040)");
        System.out.println("2. Fahri Izzuddin Zulkarnaen (19081010046)");
        System.out.println("3. Ishak Febrianto (19081010072)");
        System.out.println("\n");
        //Objek inisialisasi data profil petugas
        Inisialisasi init = new Inisialisasi();
        init.inisialisasi();
        //Objeck inisialisasi data wahana
        InisialisasiWahana inisialisasi = new InisialisasiWahana();
        inisialisasi.InisialisasiWahana();
        //Objek back to main menu
        MainMenu Balik = new MainMenu();
        Balik.MainMenu();
    }
    
}
