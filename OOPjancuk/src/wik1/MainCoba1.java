/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wik1;

import static java.time.Clock.system;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class MainCoba1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("masukan nama kamu ; ");
        Scanner input = new Scanner (System.in);
        String nama_user = input.next();
        System.out.println (" Hai, "+nama_user);
    }
    
}
