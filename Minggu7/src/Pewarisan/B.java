/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pewarisan;

/**
 *
 * @author Ellisa
 */
public class B extends A {// Mendeklarasikan Class B yang diturunkan dari Class A
    int z;
    
    void TampilkanJumlah(){
        //subclass dapat mengaksse member dari ssuperclass
        System.out.println("Jumlah :"+ (x+y+z));
    }
}
