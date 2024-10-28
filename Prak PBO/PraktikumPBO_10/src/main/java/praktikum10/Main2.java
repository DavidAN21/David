/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum10;

/**
 *
 * @author DavidAN
 */
public class Main2 {
    public static void main(String[] args) {
         // Objek Elektronik
        Pembayaran HP = new Elektronik();
        System.out.println("Harga HP setelah dikenakan pajak: Rp." +
HP.hitungPajak(3000000));
        // Objek Makanan
        Pembayaran AyamGeprek = new Makanan();
        System.out.println("Harga ayam geprek setelah dikenakan pajak:  Rp." +
AyamGeprek.hitungPajak(10000));
    } 
}
