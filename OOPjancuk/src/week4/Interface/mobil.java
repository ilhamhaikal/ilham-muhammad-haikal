/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4.Interface;

/**
 *
 * @author user
 */
public class mobil implements komponeninterface {

    @Override
    public void main() {
        System.out.println("Kecepatan Mobil ;" + kecepatanMax);
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void design() {
        System.out.println("Model mobil ;" + model);
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
