/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Animalia.Invertebrata;

/**
 *
 * @author ASUS
 */
public class arthropoda extends Invertebrata {
    private String ciriArthropoda;
    private int jumlahKaki;
    private String namaBinatang;

    public arthropoda(int idAnimal, int umur, String gender, int jumlahKaki, String namaBinatang){
        super(idAnimal,umur,gender);
        ciriArthropoda = "Ciri-ciri athropoda:\n" +
                "1. Tubuh dan kaki yang bersegmen.\n" +
                "2. Termasuk golongan hewan triplobastik selomata, yaitu rongga tubuh sejati dan memiliki tiga lapisan tubuh.\n" +
                "3. Tubuh diselimuti eksoskeleton (terbuat dari senyawa protein dan kitin) yang berfungsi untuk melindungi dan membentuk kerangka tubuh.\n" +
                "4. Tubuh terbagi menjadi tiga bagian, yaitu kepala (caput), dada (toraks), dan perut (abdomen).\n " +
                "5. Sudah memiliki sistem saraf, sistem pencernaan, sistem ekskresi, sistem peredaran darah maupun indra.\n" +
                "6. Menggunakan insang, trakea, permukaan tubuh, atau paru-paru buku sebagai alat respirasi.\n" +
                "7. Termasuk hewan berumah dua artinya jenis kelamin sudah terpisah antara jantan dan betina.\n" +
                "8. Reproduksi dilakukan dengan seksual dan aseksual. Seksual, yaitu dengan fertilisasi internal (pembuahan terjadi di dalam tubuh). Aseksual, yaitu dengan partenogenesis (jantan tidak terlibat dalam proses pembuahan) dan paedogenesis (reproduksi terjadi pada individu muda).\n";
        this.jumlahKaki = jumlahKaki;
        this.namaBinatang = namaBinatang;
    }

    public String getCiriArthropoda() {
        return ciriArthropoda;
    }

    public void setCiriArthropoda(String ciriArthropoda) {
        this.ciriArthropoda = ciriArthropoda;
    }

    public int getJumlahKaki() {
        return jumlahKaki;
    }

    public void setJumlahKaki(int jumlahKaki) {
        this.jumlahKaki = jumlahKaki;
    }

    public String getNamaBinatang() {
        return namaBinatang;
    }

    public void setNamaBinatang(String namaBinatang) {
        this.namaBinatang = namaBinatang;
    }
}
