/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Toko;

/**
 *
 * @author lmao
 */

public class Toko {

    private String nama;
    
    public String cekInfo() {
        return "toko kawasan Kintamani";
    }
    public String buka(int jam) {
        return "toko buka pada jam " + String.valueOf(jam);
    }
    
    public String buka(double jam) {
        return "toko buka pada jam " + String.valueOf(jam);
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

}
