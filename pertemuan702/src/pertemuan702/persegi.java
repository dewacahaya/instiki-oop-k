/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan702;

/**
 *
 * @author Pongo
 */
public class persegi extends BangunRuang{
    private int panjang, lebar;
    
    public void setPanjang(int pj){
        this.panjang = pj;
    }
    public void setLebar(int lb){
        this.lebar = lb;
    }
    @Override
    public void hitungLuas(){
        this.luas = this.panjang * this.lebar;
        
        System.out.printf("Hitung luas persegi panjang :\n");
        System.out.printf("================================\n");
        System.out.printf("Luas = Panjang * Lebar\n");
        System.out.printf("     = %d * %d\n", this.panjang, this.lebar);
        System.out.printf("     = %.2f\n", this.luas);
                
    }
}
