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
public class PersegiPanjang extends BangunDatar{

    public PersegiPanjang () {
    }

    public PersegiPanjang (int panjang, int lebar, int tinggi, int alas, int jarijari) {
        super(panjang, lebar, tinggi, alas, jarijari);
    }
    
    @Override
    public void luas() {
        int p = super.getPanjang();
        int l = super.getLebar();
        int luas = p*l;
            System.out.println("Luas Persegi Panjang = "+luas);
    }
    public double luas(double p, double l){
        return (p*l);
    }
    
    @Override
    public void keliling(){
        int p = super.getPanjang();
        int l = super.getLebar();
        int kel = 4* (p+1);
        System.out.println("Keliling Persegi Panjang"+kel);
    }
    
    public double keliling (double p, double l){
        return (4*(p+1));
    }
    
}
