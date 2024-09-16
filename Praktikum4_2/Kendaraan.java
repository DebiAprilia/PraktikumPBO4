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
    //mengganti atribut dan akses modifier
    private String nama;            //hanya bisa diakses dalam kelas ini
    protected int kecepatanMaks;    //bisa diakses di package yang sama dan subclass
    public String jenisMesin;       //bisa diakses dari mana saja
    
    //constructor
    public Kendaraan(String nama, int kecepatanMaks, String jenisMesin){
        this.nama = nama;
        this.kecepatanMaks = kecepatanMaks;
        this.jenisMesin = jenisMesin;
    }
    //getter dan setter untuk variabel private nama
    public String getNama(){
        return nama;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    //Method public untuk menampilkan informasi kendaraan
    public void tampilkanInfoKendaraan(){
        System.out.println("Nama Kendaraan: "+ nama);
        System.out.println("Kecepatan Maksimal: "+ kecepatanMaks + " km/h");
        System.out.println("Jenis Mesin: "+ jenisMesin);
    }
}
