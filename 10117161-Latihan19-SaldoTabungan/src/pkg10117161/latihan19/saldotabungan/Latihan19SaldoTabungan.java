/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg10117161.latihan19.saldotabungan;
import java.util.Scanner;
/**
 *
 * @author 
 * NAMA : Raka Panji Muhabieq
 * KELAS : PBO-1
 * NIM : 10117161
 * Deskripsi Program: Program ini berisi Program yang menampilkan saldo 
 * setiap bulan (bulan ke-6).
 */
public class Latihan19SaldoTabungan {
     public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("masukkan saldo awal : ");
        int saldoAwal = scanner.nextInt();
        System.out.print("masukkan bunga : (%)");
        String bunga = scanner.next();
        System.out.print("masukkan lama tabungan (bulan): ");
        int lamaBulan = scanner.nextInt();
        hitung(saldoAwal,bunga,lamaBulan);
    }

    public static void hitung(int saldoAwal, String bunga, int lamaBulan){
        double bungaString= Double.parseDouble(bunga); //ubah string ke double
        double bungaFinal = bungaString/ 100 + 1;
        for(int i = 1; i <= lamaBulan; i++){
            saldoAwal *= bungaFinal;
            System.out.println("saldo di bulan ke-" + i + " Rp " + saldoAwal);
        }

    }
}
