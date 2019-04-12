/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wik1;

/**
 *
 * @author user
 */
public class Mainperson {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        person pr = new person ("ilham","Limbangan","01234", 20);
        
        System.out.println(pr.toString());
        
        person pr2 = new person();
        
        pr2.setName("haikal");
        pr2.setAge(20);
        pr2.setAddress("Garut");
        pr2.setNhp("98765");
        System.out.println(pr2.toString());
    }
    
}
