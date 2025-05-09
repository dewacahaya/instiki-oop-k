/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan56;

import java.util.Scanner;

/**
 *
 * @author Decay
 * TGL: 26-04-2025
 */
public class Pertemuan56 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        manusia johan = new manusia("L");
        johan.warnaKulit="coklat";
        johan.SetWarnaRambut("hitam");
        
        manusia yani = new manusia("P");
        yani.SetWarnaRambut("blonde");
        yani.warnaKulit=("putih");
        
        manusia bayu = new manusia("L");
        bayu.SetWarnaRambut("hitam");
    }
    
}

class manusia{
    public String warnaKulit="";
    private String warnaRambut="";
    private String jenisKelamin="";
    
    public manusia(String jk){
        this.jenisKelamin = jk;
    }
    
    public void SetWarnaRambut(String warna){
        this.warnaRambut = warna;
    }
    
    
}