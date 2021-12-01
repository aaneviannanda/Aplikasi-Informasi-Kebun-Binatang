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
public class Pisces extends ColdBlooded{
    private String ciriPisces;
    private String namaBinatang;

    public Pisces(int idAnimal, int umur,  String gender, String namaBinatang){
        super(idAnimal,umur,gender);
        this.ciriPisces = "Pisces (Ikan) merupakan salah satu jenis hewan vertebrata yang bersifat poikilotermis (berdarah dingin),\n" +
                "memiliki ciri khas pada tulang belakang, insang (operculum) dan siripnya serta bergantung pada air tempatnya tinggal sebagai medium kehidupannya.\n\n" +
                "Ciri umum pisces (ikan) adalah:\n" +
                "1. Hidup di air tawar maupun air asin (laut). \n" +
                "2. Merupakan hewan poikiloterm.\n" +
                "3. Morfologinya terdiri dari kepala,dada,badan, dan ekor.\n" +
                "4. Bentuk tubuh panjang dan silindris pada daerah ekor\n" +
                "5. Memiliki sisik yang licin dan berlendir.\n" +
                "6. Geraknya dengan berenang di dalam air menggunakan sisik, gurat sisi, sirip, dan ekor.\n" +
                "7. Bernapas dengan insangyang merupakan susunan dari tulang kartilago.\n" +
                "8. Otak berdiferensiasi dengan sepuluh pasang syaraf cranial.\n" +
                "9. Jantung terdiri atas dua ruang yaitu satu serambi dan satu bilik.\n" +
                "10. Peredaran darahnya tertutup tunggal.\n" +
                "11. Fertilisasi berlangsung secara eksternal.\n" +
                "12. Gonad tunggal, besar, dan tanpa saluran. \n" +
                "13. Memiliki endoskeleton.\n";
        this.namaBinatang = namaBinatang;

    }

    public String getCiriPisces() {
        return ciriPisces;
    }

    public void setCiriPisces(String ciriPisces) {
        this.ciriPisces = ciriPisces;
    }

    public String getNamaBinatang() {
        return namaBinatang;
    }

    public void setNamaBinatang(String namaBinatang) {
        this.namaBinatang = namaBinatang;
    }
}
