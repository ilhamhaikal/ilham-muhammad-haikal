/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wikwik2.komposisi;

/**
 *
 * @author user
 */
public class Flashdisk {
 private String Flashdisk;

    public Flashdisk() {
    }

    public Flashdisk(String Flashdisk) {
        this.Flashdisk = Flashdisk;
    }

    public String getFlashdisk() {
        return Flashdisk;
    }

    public void setFlashdisk(String Flashdisk) {
        this.Flashdisk = Flashdisk;
    }

    @Override
    public String toString() {
        return "Flashdisk{" + "Flashdisk=" + Flashdisk + '}';
    }
 
}
