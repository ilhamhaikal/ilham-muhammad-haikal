/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wikwik2.komposisituugas;

/**
 *
 * @author user
 */
public class merk {
   private String merk;

    public merk() {
    }

    public merk(String merk) {
        this.merk = merk;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    @Override
    public String toString() {
        return "merk{" + "merk=" + merk + '}';
    }
   
}
