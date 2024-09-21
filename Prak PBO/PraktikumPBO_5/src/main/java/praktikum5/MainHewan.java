/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum5;

/**
 *
 * @author DavidAN
 */
public class MainHewan {
    public static void main(String[] args) {
        // Membuat objek Kucing dan Anjing
        Kucing kucing1 = new Kucing();
        kucing1.namaHewan = "Meiky";
        kucing1.umur = 4;
        kucing1.jenis = "Anggora";
        kucing1.TampilkanInfo();
        
        System.out.println("");
        
        Anjing anjing2 = new Anjing();
        anjing2.namaHewan = "Upsy";
        anjing2.umur = 5;
        anjing2.jenis = "Chihuahua";
        anjing2.TampilkanInfo();
    }      
}
