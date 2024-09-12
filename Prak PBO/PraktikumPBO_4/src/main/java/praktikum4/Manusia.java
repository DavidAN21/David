/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum4;

/**
 *
 * @author DavidAN
 */
public class Manusia {
    private String nama;        //Atribut nama sebagai private
    protected int usia;         //Atribut usia sebagai protected
    public String pekerjaan;    //Atribut pekerjaan sebagai public

    //Konstruktor untuk menginisialisasi atribut
    public Manusia(String nama, int usia, String pekerjaan) {
        this.nama = nama;
        this.usia = usia;
        this.pekerjaan = pekerjaan;
    }

    //Metode getter untuk nama
    public String getNama() {
        return nama;
    }

    //Metode setter untuk nama
    public void setNama(String nama) {
        this.nama = nama;
    }
}
