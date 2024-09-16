/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPBO4;

/**
 *
 * @author user
 */
public class Pekerja extends Manusia {
    private int gaji;       //atribut tambahan gaji
    
    //constructor
    public Pekerja(String nama, int usia, String pekerjaan, int gaji){
        super(nama, usia, pekerjaan);
        this.gaji = gaji;
    }
    //method getter dan setter untuk gaji
    public int getGaji(){
        return gaji;
    }
    public void setGaji(){
        this.gaji = gaji;
    }
    //method untuk menampilkan info pekerja
    @Override
    public String toString(){
        return "Nama Pekerja : " + getNama() + 
                "\nUsia : " + usia + 
                "\nPekerjaan : " + pekerjaan +
                "\nGaji : " + gaji;
    }
}
