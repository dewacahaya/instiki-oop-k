/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan701;

/**
 *
 * @author Pongo
 */
public class salam {
    String tx="Tuliskan Pesan Anda!";
    
    public void tulisPesan(){
        System.out.println(this.tx);
    }
    
    public void tulisPesan(String txt1){
        System.out.println(txt1);
    }
    
    public void tulisPesan(String txt1, String txt2){
        System.out.println("Hai Saya "+txt1+ " Dengan NIM " +txt2);
    }
}
