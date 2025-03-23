/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan303;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Decay
 * 22 Maret 2025
 */
public class Pertemuan303 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String pilih = "A";
        System.out.println("Menu Pilihan \n ========================= \n 1.Menu A \n 2.Menu B \n 3.Menu C \n ========================= \n Silahkan Pilih Salah Satu! (A/B/C) \n");
//        pilih = JOptionPane.showInputDialog("Pilih Menu").toUpperCase();
        
        Scanner inp = new Scanner(System.in);
        pilih = inp.nextLine();
        
        switch (pilih) {
            case "A":
                System.out.println("Memilih Menu A");
                break;
            case "B":
                System.out.println("Memilih Menu B");
                break;
            case "C":
                System.out.println("Memilih Menu C");
                break;
            default:
                System.out.println("Pilihan Menu Tidak Ada");
        }
    }
    
}
