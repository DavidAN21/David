/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum3;

/**
 *
 * @author David Andrey
 */
public class Main {
    public static void main(String[] args) {
        Hewan kucing = new Hewan("Meiki", 2);
        kucing.suara();
        kucing.info();
        System.out.println("");
        
        
        System.out.println("===============================");
  
        System.out.println("Tugas pertemuan 3");      
        System.out.println("Objek 1");
        Mobil Dapiz = new Mobil("Porsche", "Carrera GT", 2004, "Silver");
        Dapiz.displayInfo();
        Dapiz.startEngine();
        Dapiz.ubahWarna("Violet");
        System.out.println("");
        System.out.println("");
        System.out.println("Objek 2");
        Mobil Andrew = new Mobil("BMW", "M3GTR", 2004, "Putih-Biru");
        Andrew.displayInfo();
        Andrew.startEngine();
        Andrew.ubahWarna("Hijau");
    }
}