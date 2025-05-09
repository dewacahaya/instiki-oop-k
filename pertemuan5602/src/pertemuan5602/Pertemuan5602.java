/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan5602;

import java.util.Scanner;

/**
 *
 * @author Decay
 * TGL: 26-04-2025
 */
public class Pertemuan5602 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sken = new Scanner(System.in);
        
        LuasSegitiga Segitiga1 = new LuasSegitiga();
        
        System.out.print("Masukkan alas: ");
        Segitiga1.alas = sken.nextInt();
        System.out.print("Masukkan tinggi: ");
        Segitiga1.tinggi = sken.nextInt();   Segitiga1.tinggi = 20;
        
        
        System.out.println("Luas Segitiga adalah: ");
        System.out.printf(" = 1/2 * %d * %d\n", Segitiga1.alas, Segitiga1.tinggi);
        System.out.println("Luas Segitiga adalah : " +Segitiga1.HitungLuas());
    }
    
}
