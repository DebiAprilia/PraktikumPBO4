/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum4;

/**
 *
 * @author user
 */
public class Mobil extends Kendaraan {
    private int jumlahPintu;    //atribut tambahan khusus mobil
    
    //constructor
    public Mobil(String nama, int kecepatanMaks, String jenisMesin, int jumlahPintu){
        super(nama, kecepatanMaks, jenisMesin);     //untuk memanggil constructor dari kelas induk
        this.jumlahPintu = jumlahPintu;
    }

    //method untuk menampilkan informasi mobil
    public void tampilkanInfoMobil(){
        //kecepatanMaks dapat diakses karena akses modifiernya protected
        System.out.println("Kecepatan Maksimal MobilL: "+ kecepatanMaks + " km/h");
        System.out.println("Jumlah Pintu: "+ jumlahPintu);
    }
}
