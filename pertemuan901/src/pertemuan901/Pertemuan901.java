/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan901;

import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Pongo
 */
public class Pertemuan901 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            db_koneksi dbk = new db_koneksi();
            Statement stm = dbk.koneksi().createStatement();
            String sqldata = "SElECT * FROM data_teman;";
            ResultSet rs = stm.executeQuery(sqldata);
            
            int ke = 1;
            while(rs.next()){
                System.out.println("Data ke-"+ke);
                System.out.println("Nama : "+rs.getString("nama"));
                System.out.println("Alamat : "+rs.getString("alamat"));
                System.out.println("Telepon : "+rs.getString("telp"));
                ke++;
            }
        } catch (Exception err) {
            System.out.println("Error");
        }
    }
    
}
