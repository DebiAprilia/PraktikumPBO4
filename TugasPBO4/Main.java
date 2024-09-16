/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPBO4;

/**
 *
 * @author user
 */
public class Main {
    public static void main(String[] args){
        Pekerja pekerja1 = new Pekerja("Ahmad", 36, "Web Developer", 25000000);
        
        //Untuk menampilkan data pekerja
        System.out.println(pekerja1.toString());
        
        //Mengubah nama
        pekerja1.setNama("Andri");
        
        //Menampilkan data setelah perubahan
        System.out.println("\nData Pekerja Setelah diubah :");
        System.out.println(pekerja1.toString());
    }
}







