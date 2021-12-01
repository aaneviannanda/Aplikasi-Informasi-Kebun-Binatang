/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Animalia;

import Animalia.Invertebrata.arthropoda;
import Animalia.Invertebrata.withoutLegs;
import Animalia.Vertebrata.Amfibi;
import Animalia.Vertebrata.Aves;
import Animalia.Vertebrata.Mamalia;
import Animalia.Vertebrata.Pisces;
import Animalia.Vertebrata.Reptil;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import sistem.pengelolaan.data.kebun.binatang.MainMenu;

/**
 *
 * @author ASUS
 */
public class mainAnimalia {
    private final ArrayList <Mamalia> listMamalia = new ArrayList<>();
    private final ArrayList <Aves> listAves = new ArrayList<>();
    private final ArrayList <Pisces> listPisces = new ArrayList<>();
    private final ArrayList <Reptil> listReptil = new ArrayList<>();
    private final ArrayList <Amfibi> listAmfibi = new ArrayList<>();
    private final ArrayList <arthropoda> listArthropoda = new ArrayList<>();
    private final ArrayList <withoutLegs> listWithoutLegs = new ArrayList<>();

    Scanner mainAnimalia = new Scanner(System.in);

    //Mamalia
    Mamalia beruangMadu1 = new Mamalia(101,12,"jantan","beruang madu");
    Mamalia sapi1 = new Mamalia(111, 4,"betina","Sapi Holstein");
    Mamalia monyet1 = new Mamalia(121, 3,"jantan","Bekantan");
    Mamalia harimau1 = new Mamalia(131,7,"jantan","Harimau Sumatra");
    Mamalia anjingLaut1 = new Mamalia(141,3,"betina","Anjing Laut Phocidae");
    //Aves
    Aves burungMerak1 = new Aves(201,8,"jantan","Burung Merak");
    Aves burung1 = new Aves(221,2,"betina","Merpati");
    Aves burung2 = new Aves(231,4,"jantan","Kolibri");
    Aves burung3 = new Aves(222,2,"jantan","Ayam Guinea");
    Aves burung4 = new Aves(223,5,"betina", "Burung Hantu");
    //Pisces
    Pisces ikanKoi1 = new Pisces(301,2,"betina","Ikan Koi");
    Pisces ikan1 = new Pisces(311,1,"jantan","Ikan Mas");
    Pisces ikan2 = new Pisces(312,3,"betina","Psychrolutes marcidus");
    Pisces ikan3 = new Pisces(313,1,"betina","Piranha");
    Pisces ikan4 = new Pisces(314,3,"jantan", "Ikan Pari");
    //Reptil
    Reptil buaya1 = new Reptil(401,5,"betina", "Buaya");
    Reptil reptil1 = new Reptil(411,10,"jantan","Penyu");
    Reptil reptil2 = new Reptil(412,8,"jantan","Komodo");
    Reptil reptil3 = new Reptil(413,9,"betina","Ular");
    Reptil reptil4 = new Reptil(414,20,"jantan","Galapagos");
    //Amfibi
    Amfibi kodok1 = new Amfibi(501, 1,"jantan", "Kodok Merah");
    Amfibi amfibi1 = new Amfibi(511,4,"betina","Katak Pohon");
    Amfibi amfibi2 = new Amfibi(512,3,"betina","Salamander");
    Amfibi amfibi3 = new Amfibi(513,2,"jantan","Sesilia");
    Amfibi amfibi4 = new Amfibi(514,1,"betina","Diplocaulus");

    //Invertebrata kaki beruas
    arthropoda Scorpion = new arthropoda(601,1,"betina",8,"Scorpion");
    arthropoda kb1 = new arthropoda(611,3,"betina",10,"Udang Galah");
    arthropoda kb2 = new arthropoda(612,4,"jantan",30,"Kelabang");
    arthropoda kb3 = new arthropoda(613,2,"jantan",8,"Kalajengking");
    arthropoda kb4 = new arthropoda(614,2,"betina",400,"Kaki Seribu");
    //Invertebrata tak berkaki
    withoutLegs uburUbur1 = new withoutLegs(701,2,"Aseksual","Canonball Jellyfish");
    withoutLegs TB1 = new withoutLegs(711,1,"Generatif","Bulu Babi");
    withoutLegs TB2 = new withoutLegs(712,3,"Hermafrodit","Bekicot");
    withoutLegs TB3 = new withoutLegs(713,4,"Hermafrodit","Keong");
    withoutLegs TB4 = new withoutLegs(714,5,"Fragmentasi","Cacing Tanah");


    public void enkapsulasiListBinatang(){
        //Mamalia
        this.getListMamalia().add(beruangMadu1);
        this.getListMamalia().add(sapi1);
        this.getListMamalia().add(monyet1);
        this.getListMamalia().add(harimau1);
        this.getListMamalia().add(anjingLaut1);
        //Aves
        this.getListAves().add(burungMerak1);
        this.getListAves().add(burung1);
        this.getListAves().add(burung2);
        this.getListAves().add(burung3);
        this.getListAves().add(burung4);
        //Pisces
        this.getListPisces().add(ikanKoi1);
        this.getListPisces().add(ikan1);
        this.getListPisces().add(ikan2);
        this.getListPisces().add(ikan3);
        this.getListPisces().add(ikan4);
        //Reptil
        this.getListReptil().add(buaya1);
        this.getListReptil().add(reptil1);
        this.getListReptil().add(reptil2);
        this.getListReptil().add(reptil3);
        this.getListReptil().add(reptil4);
        //Amfibi
        this.getListAmfibi().add(kodok1);
        this.getListAmfibi().add(amfibi1);
        this.getListAmfibi().add(amfibi2);
        this.getListAmfibi().add(amfibi3);
        this.getListAmfibi().add(amfibi4);
        //Invertebrata kaki beruas
        this.getListArthropoda().add(Scorpion);
        this.getListArthropoda().add(kb1);
        this.getListArthropoda().add(kb2);
        this.getListArthropoda().add(kb3);
        this.getListArthropoda().add(kb4);
        //Invertebrata tak berkaki
        this.getListWithoutLegs().add(uburUbur1);
        this.getListWithoutLegs().add(TB1);
        this.getListWithoutLegs().add(TB2);
        this.getListWithoutLegs().add(TB3);
        this.getListWithoutLegs().add(TB4);
    }

    public void menuKembali(int menu) throws IOException{
        switch(menu){
            case 1:
                menuZOO();
                break;

            case 2:
                informasiBinatang();
                break;

            case 3:
                break;

        }
    }

    public void kembaliListDanInfoBinatang() throws IOException{
        System.out.println("Kembali?");
        System.out.println("1. Ya");
        System.out.println("2. Tidak");
        int kembali = mainAnimalia.nextInt();
        if(kembali == 1){
            menuKembali(2);
        }else
            System.exit(0);
    }

    //Void Menu Mamalia
    public void infoMamalia() throws IOException{
        System.out.println();
        System.out.println(getListMamalia().get(0).getCiriMamalia());
        System.out.println();
        System.out.println(getListMamalia().get(0).getCiriWB());
        System.out.println();
        getListMamalia().get(0).valueSpine();
        System.out.println();
        kembaliListDanInfoBinatang();
    }
    public void printListMamalia() throws IOException{
        for(int i=0;i<listMamalia.size();i++) {
            System.out.println("List Binatang Mamalia ke- " +(i+1));
            System.out.println("Nama Binatang : " + getListMamalia().get(i).getNamaBinatang());
            System.out.println("No ID         : " + getListMamalia().get(i).getIdAnimal());
            System.out.println("Umur          : " + getListMamalia().get(i).getUmur());
            System.out.println("Gender        : " + getListMamalia().get(i).getGender());
            System.out.println();
        }
        kembaliListDanInfoBinatang();
    }

    //----------------VOID MENU 1 (informasi binatang) -----------------------

    //Void Menu Aves
    public void infoAves() throws IOException{
        System.out.println(getListAves().get(0).getCiriAves());
        System.out.println();
        System.out.println(getListAves().get(0).getCiriWB());
        System.out.println();
        getListAves().get(0).valueSpine();
        System.out.println();
        kembaliListDanInfoBinatang();
    }
    public void printListAves() throws IOException{
        for(int i=0;i<listAves.size();i++) {
            System.out.println("List Binatang Aves ke- " +(i+1));
            System.out.println("Nama Binatang : " + getListAves().get(i).getNamaBinatang());
            System.out.println("No ID         : " + getListAves().get(i).getIdAnimal());
            System.out.println("Umur          : " + getListAves().get(i).getUmur());
            System.out.println("Gender        : " + getListAves().get(i).getGender());
            System.out.println();
        }
        kembaliListDanInfoBinatang();
    }

    //Void Menu Pisces
    public void infoPisces() throws IOException{
        System.out.println(getListPisces().get(0).getCiriPisces());
        System.out.println();
        System.out.println(getListPisces().get(0).getCiriCB());
        System.out.println();
        getListPisces().get(0).valueSpine();
        System.out.println();
        kembaliListDanInfoBinatang();
    }
    public void printListPisces() throws IOException{
        for(int i=0;i<listPisces.size();i++) {
            System.out.println("List Binatang Pisces ke- " +(i+1));
            System.out.println("Nama Binatang : " + getListPisces().get(i).getNamaBinatang());
            System.out.println("No ID         : " + getListPisces().get(i).getIdAnimal());
            System.out.println("Umur          : " + getListPisces().get(i).getUmur());
            System.out.println("Gender        : " + getListPisces().get(i).getGender());
            System.out.println();
        }
        kembaliListDanInfoBinatang();
    }

    //Void Menu Reptil
    public void infoReptil() throws IOException{
        System.out.println(getListReptil().get(0).getCiriReptil());
        System.out.println();
        System.out.println(getListReptil().get(0).getCiriCB());
        System.out.println();
        getListReptil().get(0).valueSpine();
        System.out.println();
        kembaliListDanInfoBinatang();
    }
    public void printListReptil() throws IOException{
        for(int i=0;i<listReptil.size();i++) {
            System.out.println("List Binatang Reptil ke- " +(i+1));
            System.out.println("Nama Binatang : " + getListReptil().get(i).getNamaBinatang());
            System.out.println("No ID         : " + getListReptil().get(i).getIdAnimal());
            System.out.println("Umur          : " + getListReptil().get(i).getUmur());
            System.out.println("Gender        : " + getListReptil().get(i).getGender());
            System.out.println();
        }
        kembaliListDanInfoBinatang();
    }

    //Void Menu Amfibi
    public void infoAmfibi() throws IOException{
        System.out.println(getListAmfibi().get(0).getWhatIsAmfibi());
        System.out.println(getListAmfibi().get(0).getCiriAmfibi());
        System.out.println();
        System.out.println(getListAmfibi().get(0).getCiriCB());
        System.out.println();
        getListAmfibi().get(0).valueSpine();
        System.out.println();
        kembaliListDanInfoBinatang();
    }
    public void printListAmfibi() throws IOException{
        for(int i=0;i<listAmfibi.size();i++) {
            System.out.println("List Binatang Amfibi ke- " +(i+1));
            System.out.println("Nama Binatang : " + getListAmfibi().get(i).getNamaBinatang());
            System.out.println("No ID         : " + getListAmfibi().get(i).getIdAnimal());
            System.out.println("Umur          : " + getListAmfibi().get(i).getUmur());
            System.out.println("Gender        : " + getListAmfibi().get(i).getGender());
            System.out.println();
        }
        kembaliListDanInfoBinatang();
    }

    //Void Menu Invertebrata dengan kaki (Arthropoda)
    public void infoArthropoda() throws IOException{
        System.out.println(getListArthropoda().get(0).getCiriArthropoda());
        System.out.println();
        getListArthropoda().get(0).valueSpine();
        System.out.println();
        kembaliListDanInfoBinatang();
    }
    public void printListArthropoda() throws IOException{
        for(int i=0;i<listArthropoda.size();i++) {
            System.out.println("List Binatang Arthropoda ke- " +(i+1));
            System.out.println("Nama Binatang : " + getListArthropoda().get(i).getNamaBinatang());
            System.out.println("No ID         : " + getListArthropoda().get(i).getIdAnimal());
            System.out.println("Umur          : " + getListArthropoda().get(i).getUmur());
            System.out.println("Gender        : " + getListArthropoda().get(i).getGender());
            System.out.println();
        }
        kembaliListDanInfoBinatang();
    }

    //Void Menu Invertebrata tanpa kaki
    public void infoWL() throws IOException{
        System.out.println(getListWithoutLegs().get(0).getCiriWL());
        System.out.println();
        getListWithoutLegs().get(0).valueSpine();
        System.out.println();
        kembaliListDanInfoBinatang();
    }
    public void printListWL() throws IOException{
        for(int i=0;i<listWithoutLegs.size();i++) {
            System.out.println("List Binatang Invertebrata tanpa kaki ke- " +(i+1));
            System.out.println("Nama Binatang : " + getListWithoutLegs().get(i).getNamaBinatang());
            System.out.println("No ID         : " + getListWithoutLegs().get(i).getIdAnimal());
            System.out.println("Umur          : " + getListWithoutLegs().get(i).getUmur());
            System.out.println("Gender        : " + getListWithoutLegs().get(i).getGender());
            System.out.println();
        }
        kembaliListDanInfoBinatang();
    }

    //--------------------VOID UTAMA----------------------
    public void informasiBinatang() throws IOException{
        System.out.println("\t ~List binatang yang ada di Kebun Binatang~\n");
        System.out.println("1. Mamalia");
        System.out.println("2. Aves (burung/unggas)");
        System.out.println("3. Pisces (ikan)");
        System.out.println("4. Reptil");
        System.out.println("5. Amfibi");
        System.out.println("6. Invertebrata dengan kaki (Athropoda)");
        System.out.println("7. Invertebrata tanpa kaki");
        System.out.println("8. Kembali Ke Main Menu");
        System.out.print("Masukkan pilihan menu: ");
        int scanMenuInformasiZoo = mainAnimalia.nextInt();
        switch (scanMenuInformasiZoo){ 
            case 1 : 
                //Menu mamalia
                System.out.println("\tMenu Mamalia\n");
                System.out.println("1. Informasi hewan mamalia");
                System.out.println("2. Lihat List data hewan");
                System.out.print("Masukkan pilihan menu: ");
                int scanMenuMamalia = mainAnimalia.nextInt();
                switch (scanMenuMamalia) {
                    case 1 :
                        infoMamalia();
                        break;
                    case 2 :
                        printListMamalia();
                        break;
                    default : 
                        System.out.println("Inputan yang anda masukkan salah");
                        informasiBinatang();
                    }
                break;
            case 2 : 
                //Menu aves
                System.out.println("\tMenu Aves\n");
                System.out.println("1. Informasi hewan aves");
                System.out.println("2. Lihat List data hewan");
                System.out.print("Masukkan pilihan menu: ");
                int scanMenuAves = mainAnimalia.nextInt();
                switch (scanMenuAves) {
                    case 1 : 
                        infoAves();
                        break;
                    case 2 : 
                        printListAves();
                        break;
                    default :  
                        System.out.println("Inputan yang anda masukkan salah");
                        informasiBinatang();
                    }
                break;
            case 3 :
                //Menu Pisces
                System.out.println("\tMenu Pisces\n");
                System.out.println("1. Informasi hewan pisces");
                System.out.println("2. Lihat List data hewan");
                System.out.print("Masukkan pilihan menu: ");
                int scanMenuPisces = mainAnimalia.nextInt();
                switch (scanMenuPisces) {
                    case 1 : 
                        infoPisces();
                        break;
                    case 2 : 
                        printListPisces();
                        break;
                    default: 
                        System.out.println("Inputan yang anda masukkan salah");
                        informasiBinatang();
                    }
                break;
            case 4 :
                //Menu reptil
                System.out.println("\tMenu Reptil\n");
                System.out.println("1. Informasi hewan reptil");
                System.out.println("2. Lihat List data hewan");
                System.out.print("Masukkan pilihan menu: ");
                int scanMenuReptil = mainAnimalia.nextInt();
                switch (scanMenuReptil) {
                    case 1 :
                        infoReptil();
                        break;
                    case 2 :
                        printListReptil();
                        break;
                    default:
                        System.out.println("Inputan yang anda masukkan salah");
                        informasiBinatang();
                    }
                break;
            case 5 : 
                //Menu amfibi
                System.out.println("\tMenu Amfibi\n");
                System.out.println("1. Informasi hewan amfibi");
                System.out.println("2. Lihat List data hewan");
                System.out.print("Masukkan pilihan menu: ");
                int scanMenuAmfibi = mainAnimalia.nextInt();
                switch (scanMenuAmfibi) {
                    case 1 :
                        infoAmfibi();
                        break;
                    case 2 :
                        printListAmfibi();
                        break;
                    default:
                        System.out.println("Inputan yang anda masukkan salah");
                        informasiBinatang();
                    }
                break;
            case 6 : 
                //Menu Invertebrata dengan kaki (Athropoda)
                System.out.println("\tMenu Arthropoda\n");
                System.out.println("1. Informasi hewan Arthropoda");
                System.out.println("2. Lihat List data hewan");
                System.out.print("Masukkan pilihan menu: ");
                int scanMenuArthropoda = mainAnimalia.nextInt();
                switch (scanMenuArthropoda) {
                    case 1 :
                        infoArthropoda();
                        break;
                    case 2 :
                        printListArthropoda();
                        break;
                    default: 
                        System.out.println("Inputan yang anda masukkan salah");
                        informasiBinatang();
                    }
                break;
            case 7 :
                //Invertebrata tanpa kaki
                System.out.println("\tMenu Invertebrata tanpa kaki\n");
                System.out.println("1. Informasi hewan Invertebrata tanpa kaki");
                System.out.println("2. Lihat List data hewan");
                System.out.print("Masukkan pilihan menu: ");
                int scanMenuWL = mainAnimalia.nextInt();
                switch (scanMenuWL) {
                    case 1 :
                        infoWL();
                        break;
                    case 2 :
                        printListWL();
                        break;
                    default :
                        System.out.println("Inputan yang anda masukkan salah");
                        informasiBinatang();
                }
                break;
            case 8 :
                MainMenu Balik = new MainMenu();
                Balik.MainMenu();
                break;
            default :
                System.out.println("Inputan yang anda masukkan salah");
                informasiBinatang();
         }
    }

    public void menuZOO() throws IOException{
        enkapsulasiListBinatang();
        System.out.println("\t ~MENU PENGOLAHAN DATA KEBUN BINATANG~\n");
        System.out.println("1. Lihat Informasi binatang");
        System.out.println("2. Kembali Ke Main Utama");
        System.out.println("3. Exit\n");
        System.out.print("Masukkan pilihan anda: ");
        int scanPilMenuZoo = mainAnimalia.nextInt();
        switch (scanPilMenuZoo) {
            case 1 :
                informasiBinatang();
                break;
            case 2 : 
                MainMenu Balik = new MainMenu();
                Balik.MainMenu();
                break;
            case 3 :
                System.exit(0);
                break;
            default: 
                System.out.println("Inputan yang anda masukkan salah");
                menuZOO();  
        }
    }

    //SETTER GETTER ARRAY LIST
    public ArrayList<Mamalia> getListMamalia() {
        return listMamalia;
    }

    public ArrayList<Aves> getListAves() {
        return listAves;
    }

    public ArrayList<Pisces> getListPisces() {
        return listPisces;
    }

    public ArrayList<Reptil> getListReptil() {
        return listReptil;
    }

    public ArrayList<Amfibi> getListAmfibi() {
        return listAmfibi;
    }

    public ArrayList<arthropoda> getListArthropoda() {
        return listArthropoda;
    }

    public ArrayList<withoutLegs> getListWithoutLegs() {
        return listWithoutLegs;
    }

}
