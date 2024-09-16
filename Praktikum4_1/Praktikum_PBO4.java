/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum4;

/**
 *
 * @author user
 */
public class Praktikum_PBO4 {
    public static void main(String[] args){
        Kendaraan mobil = new Kendaraan("Honda", "Brio", 2020);
        
        //untuk menampilkan data awal
        System.out.println("Merek : "+ mobil.getMerek());
        System.out.println("Model : "+ mobil.getModel());
        System.out.println("Tahun : "+ mobil.getTahun());
        
        //untuk mengubah data
        mobil.setModel("HRV");
        mobil.setTahun(2024);
        
        //untuk menampilkan data  setelah perubahan
        System.out.println("Model baru : "+mobil.getModel());
        System.out.println("Tahun baru : "+mobil.getTahun());
    }
}
