/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum5;

/**
 *
 * @author DavidAN
 */
public class Anjing extends Hewan{
    
    // Override method tampilkanInfo
    @Override
    public void TampilkanInfo() {
        super.TampilkanInfo();
        System.out.println("Suara Hewan: Woof woof");
        System.out.println("Hewan ini adalah anjing");
    }    
}
