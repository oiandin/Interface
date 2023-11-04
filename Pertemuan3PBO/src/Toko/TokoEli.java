/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Toko;

/**
 *
 * @author lmao
 */
public class TokoEli extends Toko implements Baju, Sepatu {

    public void setNama() {
        super.setNama("Toko Eli");
    }

    public TokoEli() {
        super.setNama("Toko Eli");
    }

    public String cekInfo() {
        return "toko Eli berada di utara kawasan Kintamani";
    }

    @Override
    public void jualBaju() {
        System.out.println("- baju");
    }

    @Override
    public void jualSepatu() {
        System.out.println("- sepatu");
    }
}
