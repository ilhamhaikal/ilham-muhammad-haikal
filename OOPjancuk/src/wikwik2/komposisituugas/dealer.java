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
public class dealer {
 private String dealer;

    public dealer() {
    }

    public dealer(String dealer) {
        this.dealer = dealer;
    }

    public String getDealer() {
        return dealer;
    }

    public void setDealer(String dealer) {
        this.dealer = dealer;
    }

    @Override
    public String toString() {
        return "dealer{" + "dealer=" + dealer + '}';
    }
 
}
