/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo1.pkg10117161.latihan28.gantikata;
import java.util.Scanner;
/**
 *
 * @author GPS-2
 * NAMA : Raka Panji Muhabieq
 * KELAS : PBO-1
 * NIM : 10117161
 */
public class PBO110117161Latihan28GantiKata {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=====Program Mengganti Kata=====\n");
        System.out.print("Masukkan Kalimat : ");
        String kalimat = scanner.nextLine();
        System.out.print("Ganti Kata : ");
        String ganti = scanner.next();
        System.out.print("Menjadi Kata : ");
        String jadi = scanner.next();
        System.out.println("\n=====Hasil Formatting=====");
        System.out.println("Kalimat Awal  : "+kalimat);
        System.out.println("Kalimat Akhir : "+kalimat.replaceAll(ganti, jadi));
        System.out.println("(Developed By : Raka Panji Muhabieq)");
    }
}
