/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum6;

/**
 *
 * @author DavidAN
 */
public class Buku extends Produk {
    double diskon;

    Buku(String nama, double harga, double diskonPersen) {
        super(nama, harga);
        this.diskon = diskonPersen;
    }

    @Override
    double hitungDiskon() {
        return harga * diskon / 100; // Hitung diskon persentase
    }
}


