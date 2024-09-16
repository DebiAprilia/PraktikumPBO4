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
        Kendaraan saya = new Kendaraan("McLaren Speedtail", 400, "Hybrid");
        Mobil debi = new Mobil("McLaren Speedtail", 400, "Hybrid", 2);
        saya.tampilkanInfoKendaraan();
        debi.tampilkanInfoMobil();
    }
}
