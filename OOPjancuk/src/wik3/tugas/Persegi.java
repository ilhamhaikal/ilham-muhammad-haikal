/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wik3.tugas;

/**
 *
 * @author Asus
 */
public class Persegi extends BangunDatar{

    public Persegi () {
    }

    public Persegi (int panjang, int lebar, int tinggi, int alas, int jarijari) {
        super(panjang, lebar, tinggi, alas, jarijari);
    }
    
    
    @Override
    public void luas() {
        int s = super.getPanjang();
        int luas = s*s;
        System.out.println("Luas Persegi = "+luas);
    }
    
    public double luas (double s) {
        return(s*s);
    }
    
    @Override
    public void keliling() {
        int s = super.getPanjang();
        int kel = 8*s;
        System.out.println("Keliling Persegi = "+kel);
    }
    public double keliling(double s) {
        return(8*s);
    }
    
}
