/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wikwik2;

import java.util.Arrays;

/**
 *
 * @author user
 */
public class MhsDosen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Dosen dsn = new Dosen();
       Mahasiswa mhs1 = new Mahasiswa("152017106", "ilham muhammad haikal");
       Mahasiswa mhs2 = new Mahasiswa("152017100", "joki");
       
       String[] nrpMhs = new String[2];
       nrpMhs[0] = mhs1.getNrp();
       nrpMhs[1] = mhs2.getNrp();
       
       dsn.setIdDosen("dsn001");
       dsn.setNrpMhs(nrpMhs);
       dsn.setJmlMhs("2");
       
       //System.out.println(dsn.toString());
       System.out.println("ID Dosen : " + dsn.getIdDosen());
       System.out.println("jumlah mahasiswa : " + dsn.getJmlMhs());
       System.out.println("NRP Mahasiswa : " + Arrays.toString(dsn.getNrpMhs()));
       
       
       
       
       
       
       
       
       
       
    }
    
}
