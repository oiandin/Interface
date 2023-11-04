/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Toko;

/**
 *
 * @author lmao
 */
public class TokoDjaya extends Toko implements Topi, Tas, JamTangan {

    public void setNama(){
        super.setNama("Toko Djaya");
    }
    
    public TokoDjaya() {
        super.setNama("Toko Djaya");
    }
    
    public String cekInfo() {
        return "toko Djaya berada di timur kawasan Kintamani";
    }

    @Override
    public void jualTopi() {
        System.out.println("- topi");
    }

    public void jualTas() {
        System.out.println("- tas");
    }

    public void jualJamTangan() {
        System.out.println("- jam tangan");
    }

}
