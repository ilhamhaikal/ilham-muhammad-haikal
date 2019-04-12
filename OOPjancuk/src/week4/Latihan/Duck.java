/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4.Latihan;

/**
 *
 * @author user
 */
public class Duck extends Hewan {

    @Override
    void name() {
        String nama = "angsa";
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    void bred() {
        String bred = " Cirebon";
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    void umur() {
        String umur = " 1 ";
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
   @Override
   void sound () {
       System.out.println("kwek .. . . kwek . . . .. kwek . . .");
      //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates. 
   }
}
