/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wik3;

/**
 *
 * @author user
 */
public class MainBangun {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BangunDatar b = new BangunDatar ();
        Persegi p = new Persegi ();
        Segitiga s = new Segitiga ();
        
        b.bentuk();
        b = p;
        b.bentuk();
        b = s;
        b.bentuk();
        
        Persegi p1 = new Persegi ();
        System.out.println (p1.luas(5));
        p1.luas(3.5);
        
        
    }
    
}
