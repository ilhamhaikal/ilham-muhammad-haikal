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
public class Mainkomputer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Flashdisk fd = new Flashdisk("memindahkakn data");
        Mouse mouse = new Mouse("menggerakan kursor");
        USB usb = new USB ("menghubungkan suatu perangkat");
        Cpu cpu = new Cpu("Lenovo", fd, mouse, usb);
        
        System.out.println(cpu.toString());
        
        
    }
    
}
