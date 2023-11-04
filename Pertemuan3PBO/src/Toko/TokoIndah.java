/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Toko;

/**
 *
 * @author lmao
 */
public class TokoIndah extends Toko implements Tas, Sepatu {

    public String jualSepatu;
    
    public void setNama(){
        super.setNama("Toko Indah");
    }
    
    public TokoIndah(){
    super.setNama("Toko Indah");}
    
    
    public String cekInfo() {
        return "toko Indah berada di barat kawasan Kintamani";
    }

    public void jualTas() {
        System.out.println("- tas");
    }

    public void jualSepatu() {
        System.out.println("- sepatu");
    }
}
