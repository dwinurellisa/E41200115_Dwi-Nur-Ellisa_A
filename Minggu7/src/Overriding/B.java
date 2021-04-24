/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Overriding;

/**
 *
 * @author Ellisa
 */
public class B extends A{
    public void tampilkanKeLayar(){
        super.tampilkanKeLayar();//memanggil method milik dari superclassnya
        System.out.println("Method milik class B dipanggil");
    }
}
