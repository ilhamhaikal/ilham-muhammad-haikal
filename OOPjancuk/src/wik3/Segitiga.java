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
public class Segitiga extends BangunDatar {
    @Override
    public void bentuk () {
        System.out.println("Bentuk bangun segitiga");
        //int t = 3;
        int a = 3;
        for (int i=0; i<a; i++){
            for (int j=0; j<i; j++ ){
                System.out.println("*");
                
            }
            System.out.println("");
        }
    }
}
