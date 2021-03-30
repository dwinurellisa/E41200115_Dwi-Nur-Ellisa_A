/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Tugas1 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);

        int awal, akhir;

        System.out.println("                 Menampilkan Bilangan Genap Dari kecil Ke Besar                                     ");
        System.out.println("---------------------------------------------------------------------------------------");

        System.out.print("Masukkan nilai awal: ");
        awal = input.nextInt();
        System.out.print("Masukkan nilai akhir: ");
        akhir = input.nextInt();
        System.out.println(" ");

        System.out.println("Bilangan Genap");
        for (int i = awal; i <= akhir; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println("");
    }
}
