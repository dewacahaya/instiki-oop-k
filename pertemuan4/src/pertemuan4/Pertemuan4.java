/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan4;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Decay
 * TGL: 12 April 2025
 */
public class Pertemuan4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String[] nama = new String[5];
        
        nama[0] = "Budi";
        nama[1] = "Andre";
        nama[2] = "Wira";
        nama[3] = "Rei";
        nama[4] = "Kana";
        
        Scanner inp = new Scanner(System.in);

//        for(int idx = 0; idx < nama.length; idx++){
//            System.out.print("Data Nama ke-"+ String.valueOf(idx)+" : " +nama[idx]);
//            nama[idx] = inp.nextLine();
//        }
        
//        int i = 0;
//        
//        while(i<5){
//            System.out.println("Ini nama dengan index ke-"+i+ " : " +nama[i]);
//            i++;
//        }
        
        for(String nm : nama){
            System.out.println(nm);
        }
//         for (int i = 0; i < nama.length; i++) {
//            System.out.println("Ini nama dengan index ke-"+i+ " : " +nama[i]);
//        }
//        
        
        
//        String[] nama = {"saya", "aku", "gua"};
//        for (int i = 0; i < nama.length; i++) {
//            System.out.println(nama[i]);
//        }
//        System.out.println(Arrays.toString(nama));
    } 
}
