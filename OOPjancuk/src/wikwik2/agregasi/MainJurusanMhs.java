/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wikwik2.agregasi;

/**
 *
 * @author user
 */
public class MainJurusanMhs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Mahasiswa mhs = new Mahasiswa("152017106", "ilham muhammad haikal");
        Jurusan jrs = new Jurusan("15", "Teknik Informatika", mhs);
        System.out.println(jrs.toString());
        
    }
    
}
