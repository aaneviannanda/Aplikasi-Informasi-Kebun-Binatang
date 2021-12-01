/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Animalia;

/**
 *
 * @author ASUS
 */
public class Animalia {
    private int idAnimal;
    private int umur;
    private String ciriAnimal;
    private String gender;

    public Animalia(int idAnimal, int umur,  String gender){
        this.idAnimal = idAnimal;
        this.umur = umur;
        this.ciriAnimal = "1. Bersifat heterotrof ( tidak memiliki klorofil )\n" +
                "\n" +
                "2. Bersifat motil ( aktif bergerak pindah tempat )\n" +
                "\n" +
                "3. Multiseluler , eukariotik, dengan sel tanpa dinding sel\n" +
                "\n" +
                "4. bereaksi cepat terhadap rangsang";
        this.gender = gender;
    }
    public int getIdAnimal() {
        return idAnimal;
    }

    public void setIdAnimal(int idAnimal) {
        this.idAnimal = idAnimal;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public String getCiriAnimal() {
        return ciriAnimal;
    }

    public void setCiriAnimal(String ciriAnimal) {
        this.ciriAnimal = ciriAnimal;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
