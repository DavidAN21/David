/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum4;

/**
 *
 * @author DavidAN
 */
public class Pekerja extends Manusia{
    private double gaji;

    //Konstruktor untuk menginisialisasi semua atribut
    public Pekerja(String nama, int usia, String pekerjaan, double gaji) {
       super(nama, usia, pekerjaan);
       this.gaji = gaji;
    }

    //Metode getter untuk gaji
    public double getGaji() {
        return gaji;
    }

    //Metode setter untuk gaji
    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    //Override metode toString() untuk menampilkan informasi lengkap tentang pekerja
    @Override
    public String toString() {
        return "Nama: " + getNama() + "\nUsia: " + usia + "\nPekerjaan: " + pekerjaan + "\nGaji: " + gaji;
    }
}
