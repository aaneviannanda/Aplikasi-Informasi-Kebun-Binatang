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
public class withoutLegs extends Invertebrata {
    private String ciriWL;
    private String namaBinatang;

    public withoutLegs(int idAnimal, int umur, String gender, String namaBinatang){
        super(idAnimal,umur,gender);
        ciriWL = "Invertebrata/Avertebrata yang tidak memiliki kaki adalah fillum golongan selain athropoda,\n" +
                "alias tujuh lainnya, yaitu:\n" +
                "1. Annelida\n" +
                "2. Coelenterata\n" +
                "3. Echinodermata\n" +
                "4. Mollusca\n" +
                "5. Nemathelminthes\n" +
                "6. Platyhelminthes\n" +
                "7. Porifera\n" +
                "Ketujuh fillum tersebut ada yang memiliki bentuk seperti cacing dan ada yang tidak seperti cacing\n";
        this.namaBinatang = namaBinatang;
    }

    public String getCiriWL() {
        return ciriWL;
    }

    public void setCiriWL(String ciriWL) {
        this.ciriWL = ciriWL;
    }

    public String getNamaBinatang() {
        return namaBinatang;
    }

    public void setNamaBinatang(String namaBinatang) {
        this.namaBinatang = namaBinatang;
    }
}