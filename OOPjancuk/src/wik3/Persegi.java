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
public class Persegi extends BangunDatar {
    @Override
    public void bentuk () {
        System.out.println ("Bentuk Bangun Persegi");
        int  p = 3;
        int l = 3;
        
        for (int i=0; i<p; i++ ){
            for (int j=0; j<1; j++ ){
                System.out.println("*");
                
            }
            System.out.println("");
        }
    }
    public int luas (int s){
        return (s*s);
        
    }
    public void luas (){
        double luas = (s*s);
        System.out.println("Luas Persegi= "+ luas);
    }
}
