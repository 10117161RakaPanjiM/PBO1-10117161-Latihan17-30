/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg10117161.latihan21.progamrataratanilai;
import java.util.Scanner;
/**
 *
 * @author GPS-2
 * NAMA : Raka Panji Muhabieq
 * KELAS : PBO-1
 * NIM : 10117161
 */
public class Latihan21ProgamRataRataNilai {
    public static void main(String[] args) {
        Scanner kibord = new Scanner(System.in);
        int n;
        double nilai , rata , jumlah;
        
        System.out.print("Masukkan banyaknya Mahasiswa : ");
        n = kibord.nextInt();
        jumlah = 0;
        for(int i=1;i<=n;i++){
            System.out.print("Nilai Mahasiswa ke-"+i+" : ");
            nilai = kibord.nextInt();
            jumlah = jumlah + nilai;
        }
        rata = jumlah/n;
        System.out.println("\nMaka, rata-rata Nilainya adalah "+rata);
        System.out.println("(Developed By : Raka Panji Muhabieq)");
        
    }
}