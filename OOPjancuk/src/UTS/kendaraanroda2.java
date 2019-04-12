/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTS;

/**
 *
 * @author user
 */
public class kendaraanroda2 extends Sewakendaraan {

    @Override
    void jenis() {
        String jenis = "kendaraan roda 2";
        System.out.println("jenis moto"+jenis);
    }

    @Override
    void merk() {
        String merk = "honda vario, honda beat, aerox";
        System.out.println("merk moto"+merk);
    }

    @Override
    void sewa() {
        String sewa = "50000";
        System.out.println("sewa"+sewa);
    }
    
}
