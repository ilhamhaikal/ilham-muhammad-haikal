/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4.abstrak;

/**
 *
 * @author user
 */
public class kueh extends komponen {

    @Override
    void peralatan() {
         String bahan1 ="Tepung Terigu";
       String bahan2 ="Gula";
       String bahan3 ="Telur";
       System.out.println("bahan-bahan ;");
       System.out.println("1. "+bahan1);
       System.out.println("2. "+bahan2);
       System.out.println("3. "+bahan3);
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    void proses() {
        String alat1 = "Oven";
        String alat2 = "Mixer";
        String alat3 = "Loyang";
        System.out.println("Alat-alat");
        System.out.println("1. "+alat1);
        System.out.println("2. "+alat2);
        System.out.println("3. "+alat3);
       
         
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    void bahan() {
        System.out.println("proses pembuatan");
        System.out.println("1. campur bahan menggunnakkan mixer");
        System.out.println("2. masukan pada loyang");
        System.out.println("3. panggang di dalam oven hingga matang");
        System.out.println("4. selesai");
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
