/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg10117161.latihan20.tagetsaldotabungan;

/**
 *
 * @author
 * NAMA : Raka Panji Muhabieq
 * KELAS : PBO-1
 * NIM : 10117161
 * Deskripsi Program: Program ini berisi Program yang menampilkan target
 * saldo tabungan.
 */
public class Latihan20TagetSaldoTabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int saldo, saldo_awal = 3500000, bunga = 8, saldo_target = 6000000;
        
        saldo(saldo_awal, saldo_target, bunga);
        
    }
    
    public static void saldo(int saldo_awal, int saldo_target, int bunga) {
        int saldo2, saldo_akhir = saldo_awal, i=1;
        
        do {
            saldo2 = saldo_akhir * bunga/100;
            saldo_akhir += saldo2;
            System.out.println("Saldo dibulan ke-"+i+" Rp"+String.format("%,d", saldo_akhir).replace(",", "."));
            i++;
        } while(saldo_akhir < saldo_target);
    
    }
    
}