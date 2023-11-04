/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MainClass;

import Toko.TokoEli;
import Toko.TokoIndah;
import Toko.TokoDjaya;

/**
 *
 * @author lmao
 */
public class MainClass {

    public static void main(String[] args) {
        
        System.out.println("Terdapat 3 wisatawan yang sedang berkunjung di Kintamani");
        System.out.println("yaitu Tina, Ajeng, dan Eri. Mereka ingin berbelanja oleh - oleh");
        System.out.println("");
        TokoIndah Pelanggan1 = new TokoIndah();
        System.out.println("Tina mampir ke " + Pelanggan1.getNama());
        System.out.println(Pelanggan1.cekInfo());
        System.out.println(Pelanggan1.buka(7.35));
        System.out.println("karena mereka menjual: ");
        Pelanggan1.jualSepatu();
        Pelanggan1.jualTas();
        System.out.println("");
        TokoEli Pelanggan2 = new TokoEli();
        System.out.println("Ajeng mampir ke " + Pelanggan2.getNama());
        System.out.println(Pelanggan2.cekInfo());
        System.out.println(Pelanggan2.buka(7.15));
        System.out.println("karena mereka menjual: ");
        Pelanggan2.jualSepatu();
        Pelanggan2.jualBaju();
        System.out.println("");
        TokoDjaya Pelanggan3 = new TokoDjaya();
        System.out.println("Eri mampir ke " + Pelanggan3.getNama());
        System.out.println(Pelanggan3.cekInfo());
        System.out.println(Pelanggan3.buka(8));
        System.out.println("karena mereka menjual: ");
        Pelanggan3.jualJamTangan();
        Pelanggan3.jualTas();
        Pelanggan3.jualTopi();
    }
}
