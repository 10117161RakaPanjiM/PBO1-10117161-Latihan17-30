/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg10117161.latihan21.pogramrataratanilai;
import java.util.Scanner;

/**
 *
 * @author 
 * NAMA     : Raka Panji Muhabieq
 * KELAS : PBO-1
 * NIM : 10117161
 * Deskripsi program    : program ini berisi perhitungan rata-rata nilai
 */
public class PBO110117161Latihan21ProgranRataRataNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         //Inisialisasi
        int n; 
        int jml;
        int nilai[];
        float rata, jumlah = 0;
        
        Scanner input = new Scanner(System.in);
 
        System.out.print("Masukkan Banyaknya Mahasiswa : ");
        n = input.nextInt();
 
        nilai = new int[n];
 
        for(int i = 0; i <= n-1; i++){
            System.out.print("Nilai Mahasiswa ke-"+(i+1) + " : ");
            nilai[i] = input.nextInt();
        }
 
        for(int j = 0; j <= n-1; j++){
            jumlah = jumlah + nilai[j];
        }
 
        rata = jumlah / n;
 
        System.out.println();
        System.out.println("Maka, rata-rata Nilainnya adalah : " + rata);
        System.out.println("(Developed by : Titus Ferdinand A. Utler)");
    }
}