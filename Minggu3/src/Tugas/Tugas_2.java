/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

import java.util.Scanner;

/**
 *
 * @author Ellisa
 */
public class Tugas_2 {
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        System.out.print("Masukkan jumlah nilai untuk array random number : ");
        int v = s.nextInt();
        int[] randomNumber = new int [v];
        
        //input nilai
        for (int i = 0; i < v; i++) {
            System.out.print("nilai ke-" + i + " : ");
            randomNumber[i] = s.nextInt();
        }
        //output nilai
        System.out.print("Nilai array : ");
        System.out.print(" [ ");
        for (int i : randomNumber){
            System.out.print(i + " ");
        }
        System.out.println(" ]");
    }
}
