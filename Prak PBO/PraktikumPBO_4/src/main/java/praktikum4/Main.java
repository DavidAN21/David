/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum4;

/**
 *
 * @author DavidAN
 */
public class Main {
    public static void main(String[] args) {
        //Membuat objek
        Pekerja pekerja1= new Pekerja("David", 20, "Pembasmi nyamuk", 9000000);
        //Menampilkan nama pekerja
        System.out.println("\nNama pekerja: " + pekerja1.getNama());
        System.out.println("");
        //Menampilkan informasi lengkap
        System.out.println(pekerja1);
        System.out.println("\nMengubah nama pekerja");
        
        //Mengubah nama objek
        pekerja1.setNama("David Andrey");
        System.out.println(pekerja1);
    }
}
