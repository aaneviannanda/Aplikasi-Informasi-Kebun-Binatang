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
public class Amfibi extends ColdBlooded{
    private String ciriAmfibi;
    private String whatIsAmfibi;
    private String namaBinatang;

    public Amfibi(int idAnimal, int umur,  String gender, String namaBinatang){
        super(idAnimal,umur,gender);
        this.whatIsAmfibi = "Amfibi terdiri dari dua kata yaitu amphi dan bio. Amphi yang berarti ganda dan bio yang berarti hidup.\n" +
                "Jadi, dari kata tersebut kalau kita artikan bahwa hewan amfibi adalah hewan yang hidup di dua alam, yaitu darat dan air.\n" +
                "Amfibi termasuk dalam kelompok hewan bertulang belakang atau vertebrata.\n\n";

        this.ciriAmfibi = "1. Merupakan hewan poikiloterm atau berdarah dingin.\n" +
                "2. Memiliki kulit halus sampai kasar dan banyak kelenjar, serta berlendir.\n" +
                "3. Jantung terdiri dari tiga ruang, yaitu satu ventrikel dan dua atrium.\n" +
                "4. Memiliki telur yang terbungkus gelatin.\n" +
                "5. Mengalami metamorfosis sempurna.\n" +
                "6. Termasuk hewan tetrapoda (berkaki empat) memiliki alat gerak berupa dua pasang kaki yang terdapat selaput renang di antara jari-jarinya.\n" +
                "7. Alat pernapasan saat masih larva/berudu berupa insang, setelah dewasa menggunakan paru-paru dan kulit.\n" +
                "Memiliki mata yang terdapat selaput (membrana niktitans) untuk menyelam.\n" +
                "Melakukan reproduksi dengan cara bertelur dan pembuahan eksternal, dimana betina melepaskan telurnya, kemudian akan dibuahi oleh pejantan di luar tubuh.\n";

        this.namaBinatang = namaBinatang;
    }

    public String getCiriAmfibi() {
        return ciriAmfibi;
    }

    public void setCiriAmfibi(String ciriAmfibi) {
        this.ciriAmfibi = ciriAmfibi;
    }

    public String getWhatIsAmfibi() {
        return whatIsAmfibi;
    }

    public void setWhatIsAmfibi(String whatIsAmfibi) {
        this.whatIsAmfibi = whatIsAmfibi;
    }

    public String getNamaBinatang() {
        return namaBinatang;
    }

    public void setNamaBinatang(String namaBinatang) {
        this.namaBinatang = namaBinatang;
    }
}
