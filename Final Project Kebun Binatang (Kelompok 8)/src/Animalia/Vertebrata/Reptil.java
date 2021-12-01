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
public class Reptil extends ColdBlooded{
    private String ciriReptil;
    private String namaBinatang;

    public Reptil(int idAnimal, int umur,  String gender, String namaBinatang){
        super(idAnimal,umur,gender);
        this.ciriReptil = "Ciri-ciri reptil\n" +
                "1. Hewan ini bernapas dengan paru-paru\n" +
                "2. Kulit reptilia sangat keras, kering, dan bersisik\n" +
                "3. Kulit reptil yang keras disebabkan adanya zat kapur (zat kitin) seperti pada kura-kura\n" +
                "4. Hewan ini berdarah dingin\n" +
                "5. Reptil tidak bisa menghasilkan panas tubuh sendiri.\n";
        this.namaBinatang = namaBinatang;
    }

    public String getCiriReptil() {
        return ciriReptil;
    }

    public void setCiriReptil(String ciriReptil) {
        this.ciriReptil = ciriReptil;
    }

    public String getNamaBinatang() {
        return namaBinatang;
    }

    public void setNamaBinatang(String namaBinatang) {
        this.namaBinatang = namaBinatang;
    }
}
