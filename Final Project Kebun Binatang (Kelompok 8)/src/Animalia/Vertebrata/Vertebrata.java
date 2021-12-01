/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Animalia.Vertebrata;
import Animalia.Animalia;

/**
 *
 * @author ASUS
 */
public class Vertebrata extends Animalia {
    private boolean spine;

    public Vertebrata(int idAnimal, int umur,  String gender) {
        super(idAnimal,umur,gender);
        spine = true;
    }

    public boolean isSpine() {
        return spine;
    }

    public void setSpine(boolean spine) {
        this.spine = spine;
    }

    public void valueSpine(){
        if (this.spine==true){
            System.out.println("Vertebrata adalah hewan yang memiliki tulang belakang");
        }
    }
}
