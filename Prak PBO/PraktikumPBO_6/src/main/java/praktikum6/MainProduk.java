/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum6;

/**
 *
 * @author DavidAN
 */
public class MainProduk {
    public static void main(String[] args) {
        KeranjangBelanja keranjang = new KeranjangBelanja();

        Produk buku1 = new Buku("Laskar Pelangi", 100000, 10); // Diskon 10%
        Produk elektronik1 = new Elektronik("Keyboard", 2000000, 15); // Diskon flat 300000
        Produk pakaian1 = new Pakaian("Jersey", 50000, 20); // Diskon 20%

        keranjang.tambahProduk(buku1);
        keranjang.tambahProduk(elektronik1);
        keranjang.tambahProduk(pakaian1);

        double totalHarga = keranjang.hitungTotalHargaSetelahDiskon();
        System.out.println("Total harga setelah diskon: " + totalHarga);
    }
}

