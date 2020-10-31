/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo1.pkg10117161.latihan25.ejaannama;
import java.util.Scanner;
/**
 *
 * @author
 * NAMA : Raka Panji Muhabieq
 * KELAS : PBO-1
 * NIM : 10117161
 */
public class PBO110117161Latihan25EjaanNama {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nama depan anda untuk di eja : ");
        String nama = scanner.next();
        System.out.println("\nEjaan untuk "+nama+" adalah : ");
        int jumlah = nama.length();
        for(int i=1;i<=jumlah;i++){
            String sub_nama = nama.substring(i-1, i);
            System.out.println("Huruf ke-"+i+" : "+sub_nama);
        }
        System.out.println("(Developed By : Raka Panji Muhabieq)");
    }
}
