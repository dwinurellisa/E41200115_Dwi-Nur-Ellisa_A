package Searching;

import java.util.Scanner;

/**
 *
 * @author Ellisa
 */
public class BinarySearch {
    public static int[] data = null;
    public static int awal, tengah, akhir, temp, count;
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Jumlah data = ");
        int jumlah = scan.nextInt();
        
        data = new int[jumlah];
        for(int x = 0; x < data.length; x++) {
            System.out.print("Masukkan data ke-"+(x+1)+" = ");
            data[x] = scan.nextInt();
        }
        
        System.out.print("\nData = ");
        for(int x = 0; x < data.length; x++)
            System.out.print(data[x] + " ");
        
        //proses sorting
        sorting();
        
        System.out.println();
	System.out.print("Sorting : ");
	for(int x = 0; x < data.length; x++)			
            System.out.print(data[x]+" ");
		
            //Input data yang dicari
            System.out.print("\nData yang dicari : ");			
            int cari = scan.nextInt();
		
            //Proses Metode Pencarian Binary Searching
            System.out.println();
            boolean temu = false;
		awal = 0;
		akhir = data.length - 1;
		temp = 0;
		count = 0;
		int iterasi = 0;
		while(temu != true){								
                    tengah = (awal + akhir) / 2;
                    iterasi++;
		
                    //	value == cari
                    if(data[tengah] == cari){
			temu = true;
			break;
                    }
			
                    //value < cari
                    else if(data[tengah] < cari){
			awal = tengah + 1;
                    }
				
                    //value > cari
                    else if(data[tengah] > cari){
			akhir = tengah - 1;
                    }
			
                    // Cek Worst Case
                    if(temp != data[tengah])
			temp = data[tengah];
			else
                            count++;
                    //batasan untuk worst case
                    if(count == 3)
			break;	
                }
		
        //Output
        if(temu == true)		
            System.out.println("\nData "+cari+" ditemukan pada index ke-"+tengah+"\n");			
        else
            System.out.println("\nData "+cari+" tidak ditemukan");
    }
	
    // Sorting Ascending	
    public static void sorting() {
        int temp = 0;
        for(int x = 0; x < data.length; x++) {
            for(int y = 0; y < data.length; y++) {
                if(x == y) {} 
                else {
                    if(data[x] < data[y]){
                        temp = data[y];				
                        data[y] = data[x];
                        data[x] = temp;	
                    }
                }               
            }
        }
    }
}

