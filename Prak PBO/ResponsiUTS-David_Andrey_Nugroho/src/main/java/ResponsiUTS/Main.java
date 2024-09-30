/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ResponsiUTS;

/**
 *
 * @author DavidAN
 */
public class Main {
    public static void main(String[] args) {
        //Polimorfisme Produk
        Produk A1 = new Elektronik("HP", 4500000, 3);
        Produk A2 = new Makanan("Sosis", 2000, "28/04/2025");
        
        //Polimorfisme Pegawai
        Pegawai B1 = new PegawaiTetap("David Andrey Nugroho", 9000000, 1500000);
        Pegawai B2 = new PegawaiKontrak("Dapiz", 5200000, 12);
       
        //Menampilkan informasi produk
        System.out.println("Output dari Produk:");
        System.out.println("Elektronik");
        A1.tampilkanInfo();
        System.out.println();
        System.out.println("Makanan");
        A2.tampilkanInfo();
        System.out.println("\n=========================================\n");

        //Menampilkan informasi pegawai
        System.out.println("Output dari Pegawai:");
        B1.tampilkanInfo();
        System.out.println();
        B2.tampilkanInfo();
    }   
}
