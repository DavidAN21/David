/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum6;

/**
 *
 * @author DavidAN
 */
public class Main {
    public static void main(String[] args) {
        
        Hewan kucing1 = new Hewan(); // Kucing merupakan subclass dari Hewan
        kucing1.bersuara(); // Output: Hewan bersuara
        kucing1.makan("ikan"); // Output: Hewan makan ikan
        kucing1.makan("ikan", 2); // Output: Hewan makan 2 porsi ikan
        
        System.out.println("");
        Hewan hewan = new Kucing();
        hewan.bersuara();
        
        Kucing kucing = new Kucing();
        kucing.makan("ikan"); // Memanggil metode makan() dari kelas Hewan
        kucing.makan("ikan", 2); // Memanggil metode makan() yang overloaded
        
        System.out.println("");
        
        Anjing anjing = new Anjing();
        anjing.bersuara(); // Output: Woof
        anjing.makan("daging", 3); // Memanggil metode makan() yang overloaded pada kelas Hewan
    }
}
