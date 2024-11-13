/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum11;

/**
 *
 * @author DavidAN
 */
public class Main {
    public static void main(String[] args) {  
        Pengarang p1 = new Pengarang("J.K. Rowling");  
        Pengarang p2 = new Pengarang("J.R.R. Tolkien");  

        Buku b1 = new Buku("Harry Potter and the Philosopher's Stone", p1);  
        Buku b2 = new Buku("The Hobbit", p2);   

        Perpustakaan perpustakaan = new Perpustakaan();  

        perpustakaan.tambahBuku(b1);  
        perpustakaan.tambahBuku(b2);    

        System.out.println("Informasi Perpustakaan:");  
        perpustakaan.infoPerpustakaan();
        System.out.println("");

        // Hapus perpustakaan  
        perpustakaan.HapusPerpustakaan();  
        
    } 
}
   
