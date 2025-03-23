/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan3;

import javax.swing.JOptionPane;

/**
 *
 * @author Dewa Cahaya
 * TGL: 22 Maret 2025
 */
public class Pertemuan3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int naw = 0;
        naw = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Nilai Awal: "));
        int awal = naw;
        
        int nak = 0;
        nak = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Nilai Akhir: "));
        int akhir = nak;
        
        System.out.println("Perulangan While");
        while (awal < akhir){
            System.out.println("Perulangan ke-"+awal);
            awal++;
        }
        
        System.out.println("Perulangan Do While");
        awal = naw;
        do{
            System.out.println("Perulangan Do While ke-"+awal);
            awal++;
        }while(awal<akhir);
        
        System.out.println("Perulangan For");
        for(awal = 0; awal < akhir; awal++) {
            System.out.println("Perulangan For ke-"+awal);
        }
    }
    
}
