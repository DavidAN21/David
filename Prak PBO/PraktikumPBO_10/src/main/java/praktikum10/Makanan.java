/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum10;

/**
 *
 * @author DavidAN
 */
public class Makanan implements Pembayaran{
    @Override
    public double hitungPajak(double harga) {
    return harga + (harga* 0.05);
    } 
}