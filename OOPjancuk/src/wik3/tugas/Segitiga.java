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
public class Segitiga extends BangunDatar{

    public Segitiga() {
    }

    public Segitiga (int panjang, int lebar, int tinggi, int alas, int jarijari) {
        super(panjang, lebar, tinggi, alas, jarijari);
    }
    
    @Override
    public void luas(){
        int a = super.getAlas();
        int t = super.getTinggi();
        double luas = 0.5*a*t;
        System.out.println("Luas Segitiga"+luas);
    }
    
    public int luas (int a, int t){
        return(int) (0.5*a*t);
    }
    
}
