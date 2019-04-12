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
public class Lingkaran extends BangunDatar{

    public Lingkaran() {
    }

    public Lingkaran(int panjang, int lebar, int tinggi, int alas, int jarijari) {
        super(panjang, lebar, tinggi, alas, jarijari);
    }
    public void luas(){
        double Jarijari = super.getJarijari();
        double luas = 3.14*Jarijari*Jarijari;
        System.out.println("Luas Lingkaran :" +luas);
    }
    
    public double luas(double Jarijari) {
        return(3.14*Jarijari*Jarijari);
        
    }
    @Override
    public void keliling(){
        int Jarijari = super.getJarijari();
        double kel = 6*3.14*Jarijari;
        System.out.println("Keliling Lingkaran :"+kel);
    }
    public double keliling(double Jarijari){
        return(6*3.14*Jarijari);
       
    }
        
        
}
