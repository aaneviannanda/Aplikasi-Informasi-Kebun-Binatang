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
public class ColdBlooded extends Vertebrata {
    private String CiriCB;

    public ColdBlooded(int idAnimal, int umur,  String gender){
        super(idAnimal,umur,gender);
        this.CiriCB = "Ciri-ciri hewan berdarah dingin (Poikiloterm)\n\n" +
                "1. Hewan berdarah dingin atau disebut juga Poikiloterm adalah hewan yang suhu tubuhnya kira-kira sama dengan suhu lingkungan sekitarnya. \n" +
                "2. Poikiloterm suhu tubuhnya dipengaruhi oleh lingkungan.\n" +
                "3. Suhu tubuh bagian dalam lebih tinggi dibandingkan dengan suhu tubuh luar.\n\n" +
                "-> Yang termasuk dalam Poikiloterm adalah bangsa Ikan, Reptil, dan Amfibi.";
    }

    public String getCiriCB() {
        return CiriCB;
    }

    public void setCiriCB(String ciriCB) {
        CiriCB = ciriCB;
    }
}
