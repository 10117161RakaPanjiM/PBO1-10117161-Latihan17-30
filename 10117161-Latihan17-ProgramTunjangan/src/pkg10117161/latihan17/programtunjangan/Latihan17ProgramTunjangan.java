/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg10117161.latihan17.programtunjangan;

import java.util.Scanner;

/**
 *
 * @author
 * NAMA : Raka Panji Muhabieq
 * KELAS : PBO-1
 * NIM : 10117161
 * Deskripsi program: program ini berisi program untuk menampilkan hasil
 * perhitungan gaji berserta tunjangannya
 */
public class Latihan17ProgramTunjangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String status;
        double gajiPokok, totalGaji, tunjangan;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("--------Program Tunjangan------------");
        System.out.print("Berapa gaji pokok anda perbulan? : Rp ");
        gajiPokok = scanner.nextDouble();
        System.out.print("Status Anda? (menikah/belum)\t: ");
        status = scanner.next();
        
        tunjangan = (status.equals("menikah"))? 0.35 * gajiPokok : 0;
        totalGaji = tunjangan + gajiPokok;
        
        System.out.println("=====Hasil Perhitungan Gaji Anda=====");
        System.out.println("Gaji Pokok  : Rp " + gajiPokok);
        System.out.println("Tunjangan   : RP " + tunjangan);
        System.out.println("Total Gaji  : Rp " + totalGaji);
        System.out.println("(Developed by : Raka Panji Muhabieq)");
        
    }
    
}
