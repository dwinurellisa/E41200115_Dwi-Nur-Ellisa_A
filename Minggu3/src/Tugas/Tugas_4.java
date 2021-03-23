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
public class Tugas_4 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        Scanner abc = new Scanner(System.in);
        String nama;
        int harga1, harga2, harga3, harga4, harga5;
        double hasil;
        
        System.out.println("------------------------------------------------------");
        System.out.println("             Kharisma Agung Plaza ( KAP )             ");
        System.out.println("               Promo Belanja Berhadiah                ");
        System.out.println("          Khusus Pembelian 5 Barang Pertama           ");
        System.out.println("          Dengan Harga Minimum Rp. 10.000,00          ");
        System.out.println("------------------------------------------------------");
        System.out.print("Masukkan nama pembeli : ");
        nama = abc.nextLine();
        System.out.println("");
        System.out.print("Masukkan harga barang ke-1 : ");
        harga1 = abc.nextInt();
        System.out.print("Masukkan harga barang ke-2 : ");
        harga2 = abc.nextInt();
        System.out.print("Masukkan harga barang ke-3 : ");
        harga3 = abc.nextInt();
        System.out.print("Masukkan harga barang ke-4 : ");
        harga4 = abc.nextInt();
        System.out.print("Masukkan harga barang ke-5 : ");
        harga5 = abc.nextInt();
        
        hasil = harga1 + harga2 + harga3 + harga4 + harga5;
        System.out.println("Total harga pembelian atas nama "+nama+" adalah Rp."+hasil);
        System.out.println("");
        if (hasil <= 10.000) {
            System.out.println("Terimakasih atas kunjungan anda");
        } else {
            System.out.println("Selamat....");
            System.out.println("Anda mendapat hadiah 1 buah mug cantik");
        }
        
        System.out.println("------------------------------------------------------");
        System.out.println("                  Terima Kasih                        ");
        System.out.println("    Anda sudah belanja di Kharisma Agung Plaza        ");
    }
}
