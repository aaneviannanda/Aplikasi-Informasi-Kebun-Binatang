/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataWahana;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class InisialisasiWahana {
    public static ArrayList<DataWahana> listdatawahana = new ArrayList<>();

    public void InisialisasiWahana(){
        DataWahana IstanaBoneka = new DataWahana(1, "Istana Boneka", "Anak - Anak","2017","10-04-2019");
        DataWahana KeretaMisteri = new DataWahana(2,"Kereta Misteri","Horror", "2018","14-04-2019");
        DataWahana RollerCoaster = new DataWahana(3,"Roller Coaster","Extreme","2015","10-04-2019");
        DataWahana ArumJeram = new DataWahana(4,"Arum Jeram","Extreme", "2019","25-26-2019");
        DataWahana MuseumSejarah = new DataWahana(5,"Museum Sejarah", "Pendidikan", "2018","21-01-2019");

        listdatawahana.add(IstanaBoneka);
        listdatawahana.add(KeretaMisteri);
        listdatawahana.add(RollerCoaster);
        listdatawahana.add(ArumJeram);
        listdatawahana.add(MuseumSejarah);

        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter("wahana.csv");
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            fileWriter.append("Id_Wahana");
            fileWriter.append(", ");
            fileWriter.append("Nama Wahana");
            fileWriter.append(", ");
            fileWriter.append("Kategori Wahana");
            fileWriter.append(", ");
            fileWriter.append("Tahun Pembelian");
            fileWriter.append(", ");
            fileWriter.append("Terakhir Maintenance");
            fileWriter.append(", ");
            fileWriter.append("\n");
            for (DataWahana csvwahana : listdatawahana)
            {
                fileWriter.append(String.valueOf(csvwahana.getIDWahana()));
                fileWriter.append(", ");
                fileWriter.append(csvwahana.getNama());
                fileWriter.append(", ");
                fileWriter.append(csvwahana.getJenis());
                fileWriter.append(", ");
                fileWriter.append(csvwahana.getTahun_Pembelian());
                fileWriter.append(", ");
                fileWriter.append(csvwahana.getTanggal_Maintenance());
                fileWriter.append(", ");
                fileWriter.append("\n");
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            try {
                fileWriter.flush();
                fileWriter.close();
            }
            catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
