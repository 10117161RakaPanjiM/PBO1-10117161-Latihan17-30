/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo1.pkg10117161.latihan27.hurufbesarkecil;
import java.util.Scanner;
/**
 *
 * @author GPS-2
 * NAMA : Raka Panji Muhabieq
 * KELAS : PBO-1
 * NIM : 10117161
 */
public class PBO110117161Latihan27HurufBesarKecil {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Kalimat : ");
        String kalimat = scanner.nextLine();
        System.out.println("\n=====Hasil Formatting=====");
        System.out.println("Huruf Besar : "+kalimat.toUpperCase());
        System.out.println("Huruf Kecil : "+kalimat.toLowerCase());
        System.out.println("(Developed By : Raka Panji Muhabieq)");
    }
}