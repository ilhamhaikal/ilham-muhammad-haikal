/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wik1;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Mahasiswacoba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner (System.in);
     System.out.println("masukan nama : ");
     String nama = in.next();
     System.out.println("masukan alamat :");
     String alamat = in.next();
     System.out.println("masukan NRP : ");
     String nrp = in.next();
     System.out.println("masukan umur");
     int umur = in.nextInt();
     Mahasiswa mh = new Mahasiswa();
     mh.setName(nama);
     mh.setAddress(alamat);
     mh.setNrp(nrp);
     mh.setAge(umur);
     System.out.println(mh.getName() + " " + mh.getAge());
    }
    
}
