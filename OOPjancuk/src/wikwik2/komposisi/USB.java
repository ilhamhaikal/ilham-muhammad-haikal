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
public class USB {
 private String USB;

    public USB() {
    }

    public USB(String USB) {
        this.USB = USB;
    }

    public String getUSB() {
        return USB;
    }

    public void setUSB(String USB) {
        this.USB = USB;
    }

    @Override
    public String toString() {
        return "USB{" + "USB=" + USB + '}';
    }
 
}
