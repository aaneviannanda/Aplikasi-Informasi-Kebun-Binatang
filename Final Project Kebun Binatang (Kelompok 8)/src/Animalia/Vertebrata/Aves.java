/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Animalia.Vertebrata;

/**
 *
 * @author ASUS
 */
public class Aves extends WarmBlooded{
    private String ciriAves;
    private String namaBinatang;

    public Aves(int idAnimal, int umur,  String gender, String namaBinatang){
        super(idAnimal,umur,gender);
        this.ciriAves = "Pasti kita sudah tidak asing lagi dengan ayam, berbagai jenis burung, serta bebek. Itu semua adalah beberapa contoh dari aves.\n" +
                "Aves hidup dimana-mana, ada yang tinggal di kebun, kota, dan juga taman.\n " +
                "Ada yang tinggal di hutan tropis, gurun, hutan, atau lautan. Bahkan ada burung yang hidup di bongkahan es Arktik dan Antartika.\n" +
                "Ciri-ciri umum aves adalah:" +
                "1. Mempunyai sayap untuk terbang\n" +
                "2. Bernapas dengan paru-paru\n" +
                "3. Punya pundi-pundi udara yang berfungsi untuk menyimpan udara pada waktu terbang\n" +
                "4. Berdarah panas\n" +
                "5. Mempunyai suhu tubuh yang tetap\n" +
                "6. Berkembang biak dengan bertelur\n" +
                "7. Pembuahan terjadi di dalam induk betinanya (internal)\n";
        this.namaBinatang = namaBinatang;
    }

    public String getCiriAves() {
        return ciriAves;
    }

    public void setCiriAves(String ciriAves) {
        this.ciriAves = ciriAves;
    }

    public String getNamaBinatang() {
        return namaBinatang;
    }

    public void setNamaBinatang(String namaBinatang) {
        this.namaBinatang = namaBinatang;
    }
}
