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
public class WarmBlooded extends Vertebrata {
    private String ciriWB;

    public WarmBlooded(int idAnimal, int umur,  String gender){
        super(idAnimal,umur,gender);
        ciriWB = "Ciri-ciri hewan berdarah panas (Homoioterm)\n\n" +
                "1. Hewan berdarah panas adalah hewan yang dapat menjaga suhu tubuhnya, pada suhu-suhu tertentu yang konstan biasanya lebih tinggi dibandingkan lingkungan sekitarnya.\n " +
                "2. Sebagian panas hilang melalui proses radiasi, berkeringat yang menyejukkan badan.\n " +
                "3. Melalui evaporasi berfungsi menjaga suhu tubuh agar tetap konstan.\n\n" +
                "-> Contoh hewan berdarah panas adalah bangsa burung dan mamalia. ";
    }

    public String getCiriWB() {
        return ciriWB;
    }

    public void setCiriWB(String ciriWB) {
        this.ciriWB = ciriWB;
    }
}
