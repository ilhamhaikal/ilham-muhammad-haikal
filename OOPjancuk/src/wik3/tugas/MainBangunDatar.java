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
public class MainBangunDatar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BangunDatar b = new BangunDatar();
        Persegi p = new Persegi();
        Segitiga s = new Segitiga();
        PersegiPanjang pp = new PersegiPanjang();
        Lingkaran l = new Lingkaran();
        System.out.println("");
        
        
        //Persegi luas
        p.setPanjang(2);
        p.luas();
        System.out.println("Luas PErsegi ="+p.luas(2.5));
        //Persegi keliling
        p.setPanjang(3);
        p.keliling();
        System.out.println("Keliling Persegi ="+p.keliling(2.4));
        System.out.println("");
        
        
        //Segitiga luas
        s.setAlas(2);
        s.setTinggi(7);
        s.luas();
        System.out.println("Luas Segitiga ="+s.luas(2, 7));
        System.out.println("");
        
        
        //Persegi panjang luas
        pp.setPanjang(3);
        pp.setLebar(5);
        pp.luas();
        System.out.println("Luas Persegi panjang ="+pp.luas(4, 8));
        System.out.println("");
        //Persegi panjang keliling
        pp.setPanjang(2);
        pp.setLebar(4);
        pp.keliling();
        System.out.println("Keliling Persegi panjang ="+pp.luas(2.5, 3.5));
        System.out.println("");
        
        
        //Lingkaran luas
        l.setJarijari(2);
        l.luas();
        System.out.println("Luas Lingkaran ="+l.luas(3.5));
        //Lingkaran keliling
        l.setJarijari(3);
        l.keliling();
        System.out.println("Keliling Lingkaran ="+l.keliling(4.5));
        
    }
    
}
