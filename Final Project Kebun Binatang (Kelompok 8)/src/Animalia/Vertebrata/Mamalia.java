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
public class Mamalia extends WarmBlooded {
    private String namaBinatang;
    private String ciriMamalia;

    public Mamalia(int idAnimal, int umur,  String gender, String namaBinatang){
        super(idAnimal,umur,gender);
        this.ciriMamalia = "Mamalia adalah kelas hewan menyusui yang terdapat dalam sub filum vertebrata atau bertulang belakang.\n\n" +
                "Berikut adalah ciri-ciri dari Hewan mamalia:\n" +
                "1. Merupakan hewan homoiterm atau berdarah panas.\n" +
                "2. Termasuk hewan bertulang belakang atau vertebrata.\n" +
                "3. Tubuhnya memiliki sistem organ yang lengkap dan bisa dibedakan anggota tubuhnya (kepala, leher, badan, dan ekor).\n" +
                "4. Memiliki glandula mammae atau kelenjar susu yang berfungsi sebagai sumber energi anaknya.\n" +
                "5. Memiliki rambut.\n" +
                "6. Bernapas menggunakan paru-paru.\n" +
                "7. Memiliki alat indera, yaitu mata, telinga, lidah, kulit dan hidung.\n" +
                "8. Alat kelamin terpisah antara jantan dan betina dalam satu individu.\n" +
                "9. Memiliki otak yang berukuran besar dan berkembang dengan baik.\n" +
                "10. Berkembang biak dengan melahirkan.";
        this.setNamaBinatang(namaBinatang);
    }

    public String getCiriMamalia() {
        return ciriMamalia;
    }

    public void setCiriMamalia(String ciriMamalia) {
        this.ciriMamalia = ciriMamalia;
    }

    public String getNamaBinatang() {
        return namaBinatang;
    }

    public void setNamaBinatang(String namaBinatang) {
        this.namaBinatang = namaBinatang;
    }

    @Override
    public String toString() {
        return "Mamalia{" +
                "namaBinatang='" + namaBinatang + '\'' +
                ", ciriMamalia='" + ciriMamalia + '\'' +
                '}';
    }
}
