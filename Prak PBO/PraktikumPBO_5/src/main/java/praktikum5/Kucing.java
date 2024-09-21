/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum5;

/**
 *
 * @author DavidAN
 */
//class turunan Kucing
public class Kucing extends Hewan{
    
    // Override method tampilkanInfo
    @Override
    public void TampilkanInfo() {
        super.TampilkanInfo();
        System.out.println("Suara Hewan: Nya nya");
        System.out.println("Hewan ini adalah kucing");
    }
}
