/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Animalia.Invertebrata;
import Animalia.Animalia;

/**
 *
 * @author ASUS
 */
public class Invertebrata extends Animalia {
    private boolean spine;

    public Invertebrata(int idAnimal, int umur, String gender) {
        super(idAnimal,umur,gender);
        spine = false;
    }

    public boolean isSpine() {
        return spine;
    }

    public void setSpine(boolean spine) {
        this.spine = spine;
    }

    public void valueSpine(){
        if (this.spine==false){
            System.out.println("Invertebrata adalah hewan yang tidak memiliki tulang belakang");
        }
    }
}
