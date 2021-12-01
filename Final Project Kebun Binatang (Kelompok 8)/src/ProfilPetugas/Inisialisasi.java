/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProfilPetugas;
import java.util.ArrayList;
/**
 *
 * @author ASUS
 */
public class Inisialisasi {
    public static ArrayList<ProfilPetugas> ArrProfilPetugas = new ArrayList<>();
    
    public void inisialisasi(){
        ProfilPetugas petugas1 = new ProfilPetugas (1,"Aan Evian N","Staff");
        ProfilPetugas petugas2 = new ProfilPetugas (2,"Fahri Izzuddin Z","Admin");
        ProfilPetugas petugas3 = new ProfilPetugas (3,"Ishak F","Dokter Hewan");
        ArrProfilPetugas.add(petugas1);
        ArrProfilPetugas.add(petugas2);
        ArrProfilPetugas.add(petugas3);
    }
}
