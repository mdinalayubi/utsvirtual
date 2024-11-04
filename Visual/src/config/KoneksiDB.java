/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package config;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author mdinal
 */
public class KoneksiDB {

    private static Connection conn;

    public static Connection getKoneksi() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/pv_biodata";
            String user = "root";
            String password = "";
            conn = DriverManager.getConnection(url, user, password);
            JOptionPane.showMessageDialog(null, "Koneksi Berhasil");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Koneksi Gagal");
        }
        return conn;
    }
}