/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum4;

/**
 *
 * @author user
 */
public class Kendaraan {
    private String merek;
    private String model;
    private int tahun;
    
    //constructor
    public Kendaraan(String merek, String model, int tahun){
        this.merek = merek;
        this.model = model;
        this.tahun = tahun;
    }
    
    //getter dan setter untuk merek
    public String getMerek(){
        return merek;
    }
    public void setMerek(String merek){
        this.merek = merek;
    }
    
    //getter dan setter untuk model
    public String getModel(){
        return model;
    }
    public void setModel(String model){
        this.model = model;
    }
    
    //getter dan setter untuk tahun
    public int getTahun(){
        return tahun;
    }
    public void setTahun(int tahun){
        this.tahun = tahun;
    }
}
