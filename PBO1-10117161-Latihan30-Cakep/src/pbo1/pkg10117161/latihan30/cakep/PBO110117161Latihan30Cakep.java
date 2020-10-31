/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo1.pkg10117161.latihan30.cakep;
import java.util.Scanner;
/**
 *
 * @author GPS-2
 * NAMA : Raka Panji Muhabieq
 * KELAS : PBO-1
 * NIM : 10117161
 */
public class PBO110117161Latihan30Cakep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String red    = "\u001b[31m";
        String green  = "\u001b[32m";
        String yellow = "\u001b[33m";
        String blue = "\u001b[34m";
        String black = "\u001b[30m";
        String magenta = "\u001b[35m";
        String cyan   = "\u001b[36m";
        System.out.println(""+red+"Kamu "+green+"ngerjain sendiri "+yellow+"latihan 17 sampe "+blue+"latihan 30 ini?");
        System.out.print("Jawab "+red+"(Yoi/Enggak) : ");
        String jawab = scanner.next();
        if("yoi".equalsIgnoreCase(jawab)){
            System.out.println("\n"+red+"Cakep Bener. "+magenta+"Good Job");
        } else if ("enggak".equalsIgnoreCase(jawab)){
            System.out.println("\n"+red+"Tetep cakep sih.\n"+cyan+"Sing penting paham konsep nya yee.\n"+black+"Keep the code works dude");
        }
        System.out.println("(Developed By : Raka Panji Muhabieq)");
    }
}